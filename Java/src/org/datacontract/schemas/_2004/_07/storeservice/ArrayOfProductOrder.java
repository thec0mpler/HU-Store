
package org.datacontract.schemas._2004._07.storeservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfProductOrder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfProductOrder">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProductOrder" type="{http://schemas.datacontract.org/2004/07/StoreService}ProductOrder" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfProductOrder", propOrder = {
    "productOrder"
})
public class ArrayOfProductOrder {

    @XmlElement(name = "ProductOrder", nillable = true)
    protected List<ProductOrder> productOrder;

    /**
     * Gets the value of the productOrder property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productOrder property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductOrder().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductOrder }
     * 
     * 
     */
    public List<ProductOrder> getProductOrder() {
        if (productOrder == null) {
            productOrder = new ArrayList<ProductOrder>();
        }
        return this.productOrder;
    }

}
