using StoreService;
using System;
using System.Collections.Generic;
using System.Data.Entity;
using System.Diagnostics;
using System.IO;
using System.Linq;
using System.ServiceModel;

namespace HU_Store.Classes
{
    class AUser
    {
        public static string Login(string username, string password)
        {
            string token;

            using (HUStoreModelContainer db = new HUStoreModelContainer())
            {
                // Get user by username and password
                var dbUsers = from user in db.UserSet
                             where user.Username.Equals(username)
                             && user.Password.Equals(password)
                             select user;

                // Check: user empty
                if (!dbUsers.Any())
                {
                    throw new FaultException("Login credentials invalid", new FaultCode("Invalid credentials"));
                }

                // Get user
                var dbUser = dbUsers.First();

                // Generate token
                token = Path.GetRandomFileName().Replace(".", "");

                // Set token
                dbUser.Token = token;

                // Save
                db.SaveChanges();
            }

            return token;
        }

        public static string Register(string username)
        {
            // Check: username is empty
            if (string.IsNullOrEmpty(username))
            {
                throw new FaultException("Username is empty", new FaultCode("Username empty"));
            }

            // Generate password
            string password = username;

            // Create new user
            User newUser = new User()
            {
                Username = username,
                Password = password
            };

            using (HUStoreModelContainer db = new HUStoreModelContainer())
            {
                // Get users by username
                var dbUsers = from user in db.UserSet
                            where user.Username.Equals(username)
                            select user;
                
                // Check: user already exists
                if (dbUsers.Any())
                {
                    throw new FaultException("Username already exist", new FaultCode("Username exist"));
                }

                // Add user
                db.UserSet.Add(newUser);
                db.SaveChanges();
            }

            return password;
        }

        public static User GetUser(string token)
        {
            using (HUStoreModelContainer db = new HUStoreModelContainer())
            {
                // Get users by token
                var dbUsers = from dbUser in db.UserSet
                              where dbUser.Token.Equals(token)
                              select dbUser;

                // Check: user exists
                if (!dbUsers.Any())
                {
                    throw new FaultException("Login credentials invalid", new FaultCode("Invalid credentials"));
                }

                // Set user
                return dbUsers.First();
            }
        }

        public static Order GetOrder(string token, int orderId)
        {
            // Validate and get user
            User user = AUser.GetUser(token);

            // Get order
            using (HUStoreModelContainer db = new HUStoreModelContainer())
            {
                var orders = from dbOrder in db.OrderSet
                             where dbOrder.Id.Equals(orderId)
                             select dbOrder;

                return orders.First();
            }
        }

        public static List<OrderList> GetOrders(string token)
        {
            // Validate and get user
            User user = AUser.GetUser(token);

            List<OrderList> orders = new List<OrderList>();

            using (HUStoreModelContainer db = new HUStoreModelContainer())
            {
                var dbOrders = from order in db.OrderSet
                               where order.UserId.Equals(user.Id)
                               orderby order.OrderDate descending
                               select new OrderList
                               {
                                   Id = order.Id,
                                   OrderDate = order.OrderDate
                               };

                orders = dbOrders.ToList();
            }

            return orders;
        }

        public static OrderItemList GetOrderItems(string token, int orderId)
        {
            // Validate and get user
            User user = AUser.GetUser(token);

            OrderItemList orderItems = new OrderItemList();

            using (HUStoreModelContainer db = new HUStoreModelContainer())
            {
                var dbOrderItems = from orderItem in db.OrderItemsSet
                                       //let _ = (priceTotal += orderItem.Product.Price * orderItem.Amount)
                                   where orderItem.OrderId.Equals(orderId)
                                   select new OrderItem
                                   {
                                       ProductName = orderItem.Product.Name,
                                       ProductPrice = orderItem.Product.Price,
                                       Amount = orderItem.Amount
                                   };

                double priceTotal = 0;
                foreach (OrderItem orderItem in dbOrderItems)
                {
                    priceTotal += orderItem.ProductPrice * orderItem.Amount;
                }

                orderItems = new OrderItemList {
                    PriceTotal = priceTotal,
                    OrderItems = dbOrderItems.ToList()
                };
            }

            return orderItems;
        }

        public static int Order(string token, List<ProductOrder> productsOrders)
        {
            double cost = 0;

            // Validate and get user
            User user = AUser.GetUser(token);

            // Check: empty productsOrder
            if (!productsOrders.Any())
            {
                throw new FaultException("No products in order list", new FaultCode("Order list empty"));
            }

            foreach (ProductOrder productOrder in productsOrders)
            {
                cost += productOrder.Product.Price * productOrder.Amount;

                if (productOrder.Product == null
                    || productOrder.Amount <= 0)
                {
                    throw new FaultException("Product empty in order list", new FaultCode("Empty product in product list"));
                }

                if (cost > user.Balance)
                {
                    throw new FaultException("Balance too low", new FaultCode("Balance low"));
                }

                if (productOrder.Amount > productOrder.Product.Amount)
                {
                    throw new FaultException("Product amount too high", new FaultCode("Product amount too high"));
                }
            }

            using (HUStoreModelContainer db = new HUStoreModelContainer())
            {
                // Create order
                Order newOrder = new Order()
                {
                    UserId = user.Id,
                    OrderDate = DateTime.Now
                };

                // Add order to database
                Order addedOrder = db.OrderSet.Add(newOrder);

                // Save order
                db.SaveChanges();

                // Create order items
                foreach (ProductOrder productOrder in productsOrders)
                {
                    OrderItems newOrderItem = new OrderItems()
                    {
                        OrderId = newOrder.Id,
                        ProductId = productOrder.Product.Id,
                        Amount = productOrder.Amount,
                    };

                    db.OrderItemsSet.Add(newOrderItem);

                    // Change product
                    var dbProduct2 = (from dbProduct in db.ProductSet
                                      where dbProduct.Id.Equals(productOrder.Product.Id)
                                      select dbProduct).Single();
                    dbProduct2.Amount -= productOrder.Amount;
                }

                // Change balance
                var dbUser2 = (from dbUser in db.UserSet
                              where dbUser.Id.Equals(user.Id)
                              select dbUser).Single();
                dbUser2.Balance -= cost;

                // Save order items
                db.SaveChanges();                

                return addedOrder.Id;
            }
        }

        public static double GetBalance(string token)
        {
            // Validate and get user
            User user = AUser.GetUser(token);

            return user.Balance;
        }

        public static int GetProductMax(int productId)
        {
            using (HUStoreModelContainer db = new HUStoreModelContainer())
            {
                return (from dbProduct in db.ProductSet
                        where dbProduct.Id.Equals(productId)
                        select dbProduct).Single().Amount;
            }
        }

        public static List<Product> GetProducts(string token)
        {
            // Validate and get user
            User user = AUser.GetUser(token);

            List<Product> products = new List<Product>();

            using (HUStoreModelContainer db = new HUStoreModelContainer())
            {
                var dbProducts = from product in db.ProductSet
                                 where product.Amount > 0
                                 select product;

                products = dbProducts.ToList();
            }

            return products;
        }
    }
}
