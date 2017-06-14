
package org.datacontract.schemas._2004._07.storeservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderItemList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderItemList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrderItems" type="{http://schemas.datacontract.org/2004/07/StoreService}ArrayOfOrderItem" minOccurs="0"/>
 *         &lt;element name="PriceTotal" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderItemList", propOrder = {
    "orderItems",
    "priceTotal"
})
public class OrderItemList {

    @XmlElementRef(name = "OrderItems", namespace = "http://schemas.datacontract.org/2004/07/StoreService", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfOrderItem> orderItems;
    @XmlElement(name = "PriceTotal")
    protected Double priceTotal;

    /**
     * Gets the value of the orderItems property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOrderItem }{@code >}
     *     
     */
    public JAXBElement<ArrayOfOrderItem> getOrderItems() {
        return orderItems;
    }

    /**
     * Sets the value of the orderItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOrderItem }{@code >}
     *     
     */
    public void setOrderItems(JAXBElement<ArrayOfOrderItem> value) {
        this.orderItems = value;
    }

    /**
     * Gets the value of the priceTotal property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPriceTotal() {
        return priceTotal;
    }

    /**
     * Sets the value of the priceTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPriceTotal(Double value) {
        this.priceTotal = value;
    }

}
