using StoreClient.StoreService;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace StoreClient
{
    class Client
    {
        private static Client instance = new Client();
        private StoreServiceClient service = new StoreServiceClient();
        public static User User { get; } = new User();

        public string Status { get; }

        private Client() { }

        public static Client GetInstance()
        {
            return instance;
        }

        public async Task<string> Register(string username)
        {
            return await service.RegisterAsync(username);
        }

        public async Task<string> Login(string username, string password)
        {
            return await service.LoginAsync(username, password);
        }

        public async Task<Product[]> GetProducts()
        {
            return await service.GetProductsAsync(User.Token);
        }

        public async Task<int> BuyProducts(List<ProductOrder> products)
        {
            return await service.OrderAsync(User.Token, products.ToArray());
        }

        public async Task<double> GetBalance()
        {
            return await service.GetBalanceAsync(User.Token);
        }

        public async Task<OrderList[]> GetOrders()
        {
            return await service.GetOrdersAsync(User.Token);
        }

        public async Task<OrderItemList> GetOrderItems(int orderId)
        {
            return await service.GetOrderItemsAsync(User.Token, orderId);
        }
    }
}
