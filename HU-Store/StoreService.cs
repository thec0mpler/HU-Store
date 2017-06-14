using HU_Store;
using HU_Store.Classes;
using System.Collections.Generic;

namespace StoreService
{
    public class StoreService : IStoreService
    {
        public string Register(string username)
        {
            return AUser.Register(username);

        }

        public string Login(string username, string password)
        {
            return AUser.Login(username, password);
        }

        public List<Product> GetProducts(string token)
        {
            return AUser.GetProducts(token);
        }

        public double GetBalance(string token)
        {
            return AUser.GetBalance(token);
        }

        public List<OrderList> GetOrders(string token)
        {
            return AUser.GetOrders(token);
        }

        public int Order(string token, List<ProductOrder> productOrders)
        {
            return AUser.Order(token, productOrders);
        }

        public OrderItemList GetOrderItems(string token, int orderId)
        {
            return AUser.GetOrderItems(token, orderId);
        }
    }
}
