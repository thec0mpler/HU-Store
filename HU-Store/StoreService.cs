using HU_Store;
using System.Collections.Generic;
using System.Linq;

namespace StoreService
{
    public class StoreService : IStoreService
    {
        public List<Product> GetProducts()
        {
            return Store.GetProducts();
        }

        public string Register(string username)
        {
            string password = username;

            User newUser = new User()
            {
                Username = username,
                Password = password
            };

            using (HUStoreModelContainer db = new HUStoreModelContainer())
            {
                var users = from user in db.UserSet
                            select user;

                db.UserSet.Add(newUser);
                db.SaveChanges();
            }

            return password;
        }
    }
}
