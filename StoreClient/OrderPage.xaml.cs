using StoreClient.StoreService;
using System;
using System.Collections.Generic;
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
    /// Interaction logic for OrderPage.xaml
    /// </summary>
    public partial class OrderPage : Page
    {
        Client client = Client.GetInstance();

        Product product;

        public OrderPage(Product product)
        {
            InitializeComponent();

            SetProduct(product);
        }

        private void SetProduct(Product product)
        {
            this.product = product;

            ProductNameTextBox.Text = product.Name;
            ProductPriceTextBox.Text = ProductHelper.PriceString(product.Price);
            ProductQuantityMaxLabel.Content = "/ " + product.Amount;
        }

        private async void OrderButton_Click(object sender, RoutedEventArgs e)
        {
            try
            {
                ProductOrder order = new ProductOrder()
                {
                    Product = product,
                    Amount = int.Parse(ProductQuantityTextBox.Text)
                };

                int placedOrderId = await client.BuyProducts(new List<ProductOrder>() { order });

                MessageBox.Show("Order with ID " + placedOrderId + " is placed");

                // Go to shop page
                MainWindow window = (MainWindow)Window.GetWindow(this);
                window.PageBack();
            }
            catch (FaultException ex)
            {
                MessageBox.Show(ex.Message);
            }
            catch (Exception ex)
            {
                if (ex is ArgumentNullException
                    || ex is FormatException
                    || ex is OverflowException)
                {
                    MessageBox.Show("Invalid quantity");
                } else
                {
                    MessageBox.Show(ex.Message);
                }
            }
        }

        private void BackButton_Click(object sender, RoutedEventArgs e)
        {
            // Go to shop page
            MainWindow window = (MainWindow)Window.GetWindow(this);
            window.PageBack();
        }
    }
}
