using StoreClient.StoreService;
using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.ComponentModel;
using System.Diagnostics;
using System.Linq;
using System.ServiceModel;
using System.Text;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Navigation;
using System.Windows.Shapes;

namespace StoreClient
{
    /// <summary>
    /// Interaction logic for ShopPage.xaml
    /// </summary>
    public partial class ShopPage : Page
    {
        Client client = Client.GetInstance();
        User user = Client.User;

        public ShopPage()
        {
            InitializeComponent();

            Refresh();

            ProductsList.SelectionChanged += ProductsList_SelectionChanged;
        }

        public async void LoadBalance()
        {
            BalanceLabel.Content = ProductHelper.PriceString(await client.GetBalance());
        }

        private void ProductsList_SelectionChanged(object sender, SelectionChangedEventArgs e)
        {
            BuyProductButton.IsEnabled = (ProductsList.SelectedItem == null ? false : true);
        }

        public async void LoadProducts()
        {
            // Tried, but didn't work:
            // Products = new ObservableCollection<Product>(dbProducts);
            // ProductsList.ItemsSource = Products;
            // ProductsList.DataContext = Products;

            try
            {
                // Show we are busy
                ProductsList.Visibility = Visibility.Collapsed;
                ProductsListStatusLabel.Content = "Loading...";

                // Get products
                Product[] dbProducts = await client.GetProducts();

                // Clear products
                ProductsList.Items.Clear();

                // Set products
                foreach (Product dbProduct in dbProducts)
                {
                    ProductsList.Items.Add(dbProduct);
                }

                // Show we are done
                ProductsList.Visibility = Visibility.Visible;
                ProductsListStatusLabel.Visibility = Visibility.Collapsed;

                // No products
                if (!dbProducts.Any())
                {
                    ProductsListStatusLabel.Content = "No products";
                    ProductsListStatusLabel.Visibility = Visibility.Visible;
                }
            }
            catch (FaultException ex)
            {
                MessageBox.Show(ex.Message);
            }
        }

        private void BuyProductButton_Click(object sender, RoutedEventArgs e)
        {
            // Get product
            Product selectedProduct = (Product)ProductsList.SelectedItem;

            // Check if product is valid
            if (selectedProduct == null)
            {
                MessageBox.Show("No product selected");

                return;
            }

            // Go to order page
            MainWindow window = (MainWindow)Window.GetWindow(this);
            window.SetPage(new OrderPage(selectedProduct));
        }

        private void RefreshButton_Click(object sender, RoutedEventArgs e)
        {
            Refresh();
        }

        private void Refresh()
        {
            LoadProducts();
            LoadBalance();
            LoadOrders();
        }

        public async void LoadOrders()
        {
            try
            {
                // Show we are busy
                OrdersList.Visibility = Visibility.Collapsed;
                OrdersListStatusLabel.Content = "Loading...";

                // Get orders
                OrderList[] dbOrders = await client.GetOrders();

                Debug.WriteLine("Result2 = " + dbOrders.Count());

                // Clear orders
                OrdersList.Items.Clear();

                // Set orders
                foreach (OrderList dbOrder in dbOrders)
                {
                    OrdersList.Items.Add(dbOrder);
                }

                // Show we are done
                OrdersList.Visibility = Visibility.Visible;
                OrdersListStatusLabel.Visibility = Visibility.Collapsed;

                // No orders
                if (!dbOrders.Any())
                {
                    OrdersListStatusLabel.Content = "No orders";
                    OrdersListStatusLabel.Visibility = Visibility.Visible;
                }
            }
            catch (FaultException ex)
            {
                MessageBox.Show(ex.Message);
            }
        }

        private async void ViewOrderButton_Click(object sender, RoutedEventArgs e)
        {
            // Get order
            OrderList selectedOrder = (OrderList)OrdersList.SelectedItem;

            // Check if product is valid
            if (selectedOrder == null)
            {
                MessageBox.Show("No order selected");

                return;
            }

            // Order item list
            OrderItemList orderItemList = await client.GetOrderItems(selectedOrder.Id);

            // Result
            string result = "Price = " + orderItemList.PriceTotal + "\n";

            foreach (OrderItem orderItem in orderItemList.OrderItems)
            {
                result += "Product: " + orderItem.ProductName + ", ";
                result += "Price: " + orderItem.ProductPrice + "\n";
            }

            MessageBox.Show(result);
        }
    }
}
