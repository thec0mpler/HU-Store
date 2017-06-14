import org.datacontract.schemas._2004._07.storeservice.OrderList;
import org.tempuri.IStoreService;
import org.tempuri.StoreService;

public class Main {
    public static void main(String[] args) {
        try {
            StoreService service = new StoreService();
            IStoreService storeService = service.getBasicHttpBindingIStoreService();

            String token  = storeService.login("test", "test");

            System.out.println(
                storeService.getBalance(token)
            );



            for (OrderList orderList : storeService.getOrders(token).getOrderList()) {
                System.out.println(orderList.getId());
                System.out.println(orderList.getOrderDate());
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
