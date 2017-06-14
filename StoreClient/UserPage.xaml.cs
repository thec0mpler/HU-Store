using System;
using System.Collections.Generic;
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
    /// Interaction logic for UserPage.xaml
    /// </summary>
    public partial class UserPage : Page
    {
        Client client = Client.GetInstance();
        User User = Client.User;

        public UserPage()
        {
            InitializeComponent();
        }

        private async void RegisterButton_Click(object sender, RoutedEventArgs e)
        {
            await Register();
        }

        private async void RegisterUsernameInput_KeyDown(object sender, KeyEventArgs e)
        {
            if (e.Key.Equals(Key.Enter))
            {
                await Register();
            }
        }

        private void DisableRegisterFields()
        {
            RegisterUsernameInput.IsEnabled = false;
            RegisterButton.IsEnabled = false;
            RegisterButton.Content = "Trying...";
        }

        private void EnableRegisterFields()
        {
            RegisterUsernameInput.IsEnabled = true;
            RegisterButton.IsEnabled = true;
            RegisterButton.Content = "Register";
        }

        private async Task Register()
        {
            // Disable fields
            DisableRegisterFields();

            // Set username
            User.Username = RegisterUsernameInput.Text;

            // Make request
            string password = string.Empty;

            try
            {
                password = await client.Register(User.Username);
            }
            catch (FaultException ex)
            {
                MessageBoxResult popup = MessageBox.Show(ex.Message);

                return;
            }
            finally
            {
                EnableRegisterFields();
            }

            // Make username empty
            RegisterUsernameInput.Text = string.Empty;

            // User credentials
            LoginUsernameInput.Text = User.Username;
            LoginPasswordInput.Password = password;

            // Message
            MessageLabel.Visibility = Visibility.Visible;

            // Switch to login tab
            UserTab.SelectedItem = LoginTab;
        }

        private void DisableLoginFields()
        {
            LoginUsernameInput.IsEnabled = false;
            LoginPasswordInput.IsEnabled = false;
            LoginButton.IsEnabled = false;
            LoginButton.Content = "Trying...";
        }

        private void EnableLoginFields()
        {
            LoginUsernameInput.IsEnabled = true;
            LoginPasswordInput.IsEnabled = true;
            LoginButton.IsEnabled = true;
            LoginButton.Content = "Login";
        }

        private async void LoginButton_Click(object sender, RoutedEventArgs e)
        {
           await Login();
        }

        private async void LoginPasswordInput_KeyDown(object sender, KeyEventArgs e)
        {
            if (e.Key.Equals(Key.Enter))
            {
                await Login();
            }
        }

        private async Task Login()
        {
            // Disable fields
            DisableLoginFields();

            // Set user
            User.Username = LoginUsernameInput.Text;

            // Make request
            string token;

            try
            {
                token = await client.Login(User.Username, LoginPasswordInput.Password);
            }
            catch (FaultException ex)
            {
                MessageBoxResult popup = MessageBox.Show(ex.Message);

                return;
            }
            finally
            {
                EnableLoginFields();
            }

            // Set token
            User.Token = token;

            // Go to store
            MainWindow window = (MainWindow)Window.GetWindow(this);
            window.SetPage(new ShopPage());
        }
    }
}
