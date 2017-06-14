
package org.datacontract.schemas._2004._07.storeservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.datacontract.schemas._2004._07.hu_store.Product;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.storeservice package. 
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

    private final static QName _ArrayOfProductOrder_QNAME = new QName("http://schemas.datacontract.org/2004/07/StoreService", "ArrayOfProductOrder");
    private final static QName _OrderItemList_QNAME = new QName("http://schemas.datacontract.org/2004/07/StoreService", "OrderItemList");
    private final static QName _ProductOrder_QNAME = new QName("http://schemas.datacontract.org/2004/07/StoreService", "ProductOrder");
    private final static QName _OrderList_QNAME = new QName("http://schemas.datacontract.org/2004/07/StoreService", "OrderList");
    private final static QName _ArrayOfOrderItem_QNAME = new QName("http://schemas.datacontract.org/2004/07/StoreService", "ArrayOfOrderItem");
    private final static QName _OrderItem_QNAME = new QName("http://schemas.datacontract.org/2004/07/StoreService", "OrderItem");
    private final static QName _ArrayOfOrderList_QNAME = new QName("http://schemas.datacontract.org/2004/07/StoreService", "ArrayOfOrderList");
    private final static QName _OrderItemListOrderItems_QNAME = new QName("http://schemas.datacontract.org/2004/07/StoreService", "OrderItems");
    private final static QName _ProductOrderProduct_QNAME = new QName("http://schemas.datacontract.org/2004/07/StoreService", "Product");
    private final static QName _OrderItemProductName_QNAME = new QName("http://schemas.datacontract.org/2004/07/StoreService", "ProductName");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.storeservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ArrayOfProductOrder }
     * 
     */
    public ArrayOfProductOrder createArrayOfProductOrder() {
        return new ArrayOfProductOrder();
    }

    /**
     * Create an instance of {@link OrderItemList }
     * 
     */
    public OrderItemList createOrderItemList() {
        return new OrderItemList();
    }

    /**
     * Create an instance of {@link ArrayOfOrderList }
     * 
     */
    public ArrayOfOrderList createArrayOfOrderList() {
        return new ArrayOfOrderList();
    }

    /**
     * Create an instance of {@link OrderItem }
     * 
     */
    public OrderItem createOrderItem() {
        return new OrderItem();
    }

    /**
     * Create an instance of {@link ArrayOfOrderItem }
     * 
     */
    public ArrayOfOrderItem createArrayOfOrderItem() {
        return new ArrayOfOrderItem();
    }

    /**
     * Create an instance of {@link OrderList }
     * 
     */
    public OrderList createOrderList() {
        return new OrderList();
    }

    /**
     * Create an instance of {@link ProductOrder }
     * 
     */
    public ProductOrder createProductOrder() {
        return new ProductOrder();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProductOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StoreService", name = "ArrayOfProductOrder")
    public JAXBElement<ArrayOfProductOrder> createArrayOfProductOrder(ArrayOfProductOrder value) {
        return new JAXBElement<ArrayOfProductOrder>(_ArrayOfProductOrder_QNAME, ArrayOfProductOrder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderItemList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StoreService", name = "OrderItemList")
    public JAXBElement<OrderItemList> createOrderItemList(OrderItemList value) {
        return new JAXBElement<OrderItemList>(_OrderItemList_QNAME, OrderItemList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StoreService", name = "ProductOrder")
    public JAXBElement<ProductOrder> createProductOrder(ProductOrder value) {
        return new JAXBElement<ProductOrder>(_ProductOrder_QNAME, ProductOrder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StoreService", name = "OrderList")
    public JAXBElement<OrderList> createOrderList(OrderList value) {
        return new JAXBElement<OrderList>(_OrderList_QNAME, OrderList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOrderItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StoreService", name = "ArrayOfOrderItem")
    public JAXBElement<ArrayOfOrderItem> createArrayOfOrderItem(ArrayOfOrderItem value) {
        return new JAXBElement<ArrayOfOrderItem>(_ArrayOfOrderItem_QNAME, ArrayOfOrderItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StoreService", name = "OrderItem")
    public JAXBElement<OrderItem> createOrderItem(OrderItem value) {
        return new JAXBElement<OrderItem>(_OrderItem_QNAME, OrderItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOrderList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StoreService", name = "ArrayOfOrderList")
    public JAXBElement<ArrayOfOrderList> createArrayOfOrderList(ArrayOfOrderList value) {
        return new JAXBElement<ArrayOfOrderList>(_ArrayOfOrderList_QNAME, ArrayOfOrderList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOrderItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StoreService", name = "OrderItems", scope = OrderItemList.class)
    public JAXBElement<ArrayOfOrderItem> createOrderItemListOrderItems(ArrayOfOrderItem value) {
        return new JAXBElement<ArrayOfOrderItem>(_OrderItemListOrderItems_QNAME, ArrayOfOrderItem.class, OrderItemList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Product }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StoreService", name = "Product", scope = ProductOrder.class)
    public JAXBElement<Product> createProductOrderProduct(Product value) {
        return new JAXBElement<Product>(_ProductOrderProduct_QNAME, Product.class, ProductOrder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StoreService", name = "ProductName", scope = OrderItem.class)
    public JAXBElement<String> createOrderItemProductName(String value) {
        return new JAXBElement<String>(_OrderItemProductName_QNAME, String.class, OrderItem.class, value);
    }

}
