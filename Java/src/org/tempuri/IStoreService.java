
package org.tempuri;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import org.datacontract.schemas._2004._07.hu_store.ArrayOfProduct;
import org.datacontract.schemas._2004._07.storeservice.ArrayOfOrderList;
import org.datacontract.schemas._2004._07.storeservice.ArrayOfProductOrder;
import org.datacontract.schemas._2004._07.storeservice.OrderItemList;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "IStoreService", targetNamespace = "http://tempuri.org/")
@XmlSeeAlso({
    com.microsoft.schemas._2003._10.serialization.ObjectFactory.class,
    org.datacontract.schemas._2004._07.hu_store.ObjectFactory.class,
    org.datacontract.schemas._2004._07.storeservice.ObjectFactory.class,
    org.tempuri.ObjectFactory.class
})
public interface IStoreService {


    /**
     * 
     * @param username
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Register", action = "http://tempuri.org/IStoreService/Register")
    @WebResult(name = "RegisterResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "Register", targetNamespace = "http://tempuri.org/", className = "org.tempuri.Register")
    @ResponseWrapper(localName = "RegisterResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.RegisterResponse")
    public String register(
        @WebParam(name = "username", targetNamespace = "http://tempuri.org/")
        String username);

    /**
     * 
     * @param password
     * @param username
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Login", action = "http://tempuri.org/IStoreService/Login")
    @WebResult(name = "LoginResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "Login", targetNamespace = "http://tempuri.org/", className = "org.tempuri.Login")
    @ResponseWrapper(localName = "LoginResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.LoginResponse")
    public String login(
        @WebParam(name = "username", targetNamespace = "http://tempuri.org/")
        String username,
        @WebParam(name = "password", targetNamespace = "http://tempuri.org/")
        String password);

    /**
     * 
     * @param token
     * @return
     *     returns org.datacontract.schemas._2004._07.hu_store.ArrayOfProduct
     */
    @WebMethod(operationName = "GetProducts", action = "http://tempuri.org/IStoreService/GetProducts")
    @WebResult(name = "GetProductsResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetProducts", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetProducts")
    @ResponseWrapper(localName = "GetProductsResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetProductsResponse")
    public ArrayOfProduct getProducts(
        @WebParam(name = "token", targetNamespace = "http://tempuri.org/")
        String token);

    /**
     * 
     * @param token
     * @return
     *     returns java.lang.Double
     */
    @WebMethod(operationName = "GetBalance", action = "http://tempuri.org/IStoreService/GetBalance")
    @WebResult(name = "GetBalanceResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetBalance", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetBalance")
    @ResponseWrapper(localName = "GetBalanceResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetBalanceResponse")
    public Double getBalance(
        @WebParam(name = "token", targetNamespace = "http://tempuri.org/")
        String token);

    /**
     * 
     * @param token
     * @return
     *     returns org.datacontract.schemas._2004._07.storeservice.ArrayOfOrderList
     */
    @WebMethod(operationName = "GetOrders", action = "http://tempuri.org/IStoreService/GetOrders")
    @WebResult(name = "GetOrdersResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetOrders", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetOrders")
    @ResponseWrapper(localName = "GetOrdersResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetOrdersResponse")
    public ArrayOfOrderList getOrders(
        @WebParam(name = "token", targetNamespace = "http://tempuri.org/")
        String token);

    /**
     * 
     * @param token
     * @param products
     * @return
     *     returns java.lang.Integer
     */
    @WebMethod(operationName = "Order", action = "http://tempuri.org/IStoreService/Order")
    @WebResult(name = "OrderResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "Order", targetNamespace = "http://tempuri.org/", className = "org.tempuri.Order")
    @ResponseWrapper(localName = "OrderResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.OrderResponse")
    public Integer order(
        @WebParam(name = "token", targetNamespace = "http://tempuri.org/")
        String token,
        @WebParam(name = "products", targetNamespace = "http://tempuri.org/")
        ArrayOfProductOrder products);

    /**
     * 
     * @param orderId
     * @param token
     * @return
     *     returns org.datacontract.schemas._2004._07.storeservice.OrderItemList
     */
    @WebMethod(operationName = "GetOrderItems", action = "http://tempuri.org/IStoreService/GetOrderItems")
    @WebResult(name = "GetOrderItemsResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetOrderItems", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetOrderItems")
    @ResponseWrapper(localName = "GetOrderItemsResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetOrderItemsResponse")
    public OrderItemList getOrderItems(
        @WebParam(name = "token", targetNamespace = "http://tempuri.org/")
        String token,
        @WebParam(name = "OrderId", targetNamespace = "http://tempuri.org/")
        Integer orderId);

}
