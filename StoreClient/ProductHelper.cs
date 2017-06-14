using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace StoreClient
{
    static class ProductHelper
    {
        public static String PriceString(double price)
        {
            return string.Format("€{0:N2}", price);
        }
    }
}
