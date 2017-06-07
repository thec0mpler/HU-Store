using System.Collections.Generic;
using System.Linq;

namespace HU_Store
{
    class Store
    {
        public static List<Product> GetProducts()
        {
            List<Product> products = new List<Product>();

            using (HUStoreModelContainer db = new HUStoreModelContainer())
            {
                var dbProducts = from product in db.ProductSet
                                 select product;

                products = dbProducts.ToList();
            }

            return products;
        }
    }
}
