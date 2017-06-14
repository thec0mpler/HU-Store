using HU_Store;
using System;
using System.Collections.Generic;
using System.ServiceModel;

namespace StoreService
{
    [ServiceContract]
    public interface IStoreService
    {
        [OperationContract]
        string Register(string username);

        [OperationContract]
        string Login(string username, string password);

        [OperationContract]
        List<Product> GetProducts(string token);

        [OperationContract]
        double GetBalance(string token);

        [OperationContract]
        List<OrderList> GetOrders(string token);

        [OperationContract]
        int Order(string token, List<ProductOrder> products);

        [OperationContract]
        OrderItemList GetOrderItems(string token, int OrderId);
    }


    [DataContractFormat]
    public class ProductOrder
    {
        public Product Product { get; set; }
        public int Amount { get; set; }
    }

    [DataContractFormat]
    public class OrderList
    {
        public int Id { get; set; }
        public DateTime OrderDate { get; set; }
    }

    [DataContractFormat]
    public class OrderItem
    {
        public string ProductName;
        public double ProductPrice;
        public int Amount;
    }

    [DataContractFormat]
    public class OrderItemList
    {
        public double PriceTotal;
        public List<OrderItem> OrderItems;
    }
}
