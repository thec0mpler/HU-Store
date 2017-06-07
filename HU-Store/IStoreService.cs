using HU_Store;
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
        List<Product> GetProducts();
    }
}
