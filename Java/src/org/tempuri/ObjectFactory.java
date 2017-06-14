
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.datacontract.schemas._2004._07.hu_store.ArrayOfProduct;
import org.datacontract.schemas._2004._07.storeservice.ArrayOfOrderList;
import org.datacontract.schemas._2004._07.storeservice.ArrayOfProductOrder;
import org.datacontract.schemas._2004._07.storeservice.OrderItemList;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tempuri package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _RegisterResponseRegisterResult_QNAME = new QName("http://tempuri.org/", "RegisterResult");
    private final static QName _GetBalanceToken_QNAME = new QName("http://tempuri.org/", "token");
    private final static QName _GetOrderItemsResponseGetOrderItemsResult_QNAME = new QName("http://tempuri.org/", "GetOrderItemsResult");
    private final static QName _LoginPassword_QNAME = new QName("http://tempuri.org/", "password");
    private final static QName _LoginUsername_QNAME = new QName("http://tempuri.org/", "username");
    private final static QName _LoginResponseLoginResult_QNAME = new QName("http://tempuri.org/", "LoginResult");
    private final static QName _GetProductsResponseGetProductsResult_QNAME = new QName("http://tempuri.org/", "GetProductsResult");
    private final static QName _GetOrdersResponseGetOrdersResult_QNAME = new QName("http://tempuri.org/", "GetOrdersResult");
    private final static QName _OrderProducts_QNAME = new QName("http://tempuri.org/", "products");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tempuri
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Order }
     * 
     */
    public Order createOrder() {
        return new Order();
    }

    /**
     * Create an instance of {@link GetBalance }
     * 
     */
    public GetBalance createGetBalance() {
        return new GetBalance();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link GetBalanceResponse }
     * 
     */
    public GetBalanceResponse createGetBalanceResponse() {
        return new GetBalanceResponse();
    }

    /**
     * Create an instance of {@link OrderResponse }
     * 
     */
    public OrderResponse createOrderResponse() {
        return new OrderResponse();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link RegisterResponse }
     * 
     */
    public RegisterResponse createRegisterResponse() {
        return new RegisterResponse();
    }

    /**
     * Create an instance of {@link GetOrders }
     * 
     */
    public GetOrders createGetOrders() {
        return new GetOrders();
    }

    /**
     * Create an instance of {@link GetOrderItemsResponse }
     * 
     */
    public GetOrderItemsResponse createGetOrderItemsResponse() {
        return new GetOrderItemsResponse();
    }

    /**
     * Create an instance of {@link Register }
     * 
     */
    public Register createRegister() {
        return new Register();
    }

    /**
     * Create an instance of {@link GetProducts }
     * 
     */
    public GetProducts createGetProducts() {
        return new GetProducts();
    }

    /**
     * Create an instance of {@link GetOrderItems }
     * 
     */
    public GetOrderItems createGetOrderItems() {
        return new GetOrderItems();
    }

    /**
     * Create an instance of {@link GetProductsResponse }
     * 
     */
    public GetProductsResponse createGetProductsResponse() {
        return new GetProductsResponse();
    }

    /**
     * Create an instance of {@link GetOrdersResponse }
     * 
     */
    public GetOrdersResponse createGetOrdersResponse() {
        return new GetOrdersResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RegisterResult", scope = RegisterResponse.class)
    public JAXBElement<String> createRegisterResponseRegisterResult(String value) {
        return new JAXBElement<String>(_RegisterResponseRegisterResult_QNAME, String.class, RegisterResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "token", scope = GetBalance.class)
    public JAXBElement<String> createGetBalanceToken(String value) {
        return new JAXBElement<String>(_GetBalanceToken_QNAME, String.class, GetBalance.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderItemList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetOrderItemsResult", scope = GetOrderItemsResponse.class)
    public JAXBElement<OrderItemList> createGetOrderItemsResponseGetOrderItemsResult(OrderItemList value) {
        return new JAXBElement<OrderItemList>(_GetOrderItemsResponseGetOrderItemsResult_QNAME, OrderItemList.class, GetOrderItemsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "password", scope = Login.class)
    public JAXBElement<String> createLoginPassword(String value) {
        return new JAXBElement<String>(_LoginPassword_QNAME, String.class, Login.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "username", scope = Login.class)
    public JAXBElement<String> createLoginUsername(String value) {
        return new JAXBElement<String>(_LoginUsername_QNAME, String.class, Login.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "LoginResult", scope = LoginResponse.class)
    public JAXBElement<String> createLoginResponseLoginResult(String value) {
        return new JAXBElement<String>(_LoginResponseLoginResult_QNAME, String.class, LoginResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "token", scope = GetProducts.class)
    public JAXBElement<String> createGetProductsToken(String value) {
        return new JAXBElement<String>(_GetBalanceToken_QNAME, String.class, GetProducts.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "token", scope = GetOrderItems.class)
    public JAXBElement<String> createGetOrderItemsToken(String value) {
        return new JAXBElement<String>(_GetBalanceToken_QNAME, String.class, GetOrderItems.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "token", scope = GetOrders.class)
    public JAXBElement<String> createGetOrdersToken(String value) {
        return new JAXBElement<String>(_GetBalanceToken_QNAME, String.class, GetOrders.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "username", scope = Register.class)
    public JAXBElement<String> createRegisterUsername(String value) {
        return new JAXBElement<String>(_LoginUsername_QNAME, String.class, Register.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetProductsResult", scope = GetProductsResponse.class)
    public JAXBElement<ArrayOfProduct> createGetProductsResponseGetProductsResult(ArrayOfProduct value) {
        return new JAXBElement<ArrayOfProduct>(_GetProductsResponseGetProductsResult_QNAME, ArrayOfProduct.class, GetProductsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOrderList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetOrdersResult", scope = GetOrdersResponse.class)
    public JAXBElement<ArrayOfOrderList> createGetOrdersResponseGetOrdersResult(ArrayOfOrderList value) {
        return new JAXBElement<ArrayOfOrderList>(_GetOrdersResponseGetOrdersResult_QNAME, ArrayOfOrderList.class, GetOrdersResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "token", scope = Order.class)
    public JAXBElement<String> createOrderToken(String value) {
        return new JAXBElement<String>(_GetBalanceToken_QNAME, String.class, Order.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProductOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "products", scope = Order.class)
    public JAXBElement<ArrayOfProductOrder> createOrderProducts(ArrayOfProductOrder value) {
        return new JAXBElement<ArrayOfProductOrder>(_OrderProducts_QNAME, ArrayOfProductOrder.class, Order.class, value);
    }

}
