
package org.delegator.wsclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for late complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="late">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="counter" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="eid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="employee" type="{http://api.delegator.org/}employee" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "late", propOrder = {
    "counter",
    "eid",
    "employee"
})
public class Late {

    protected int counter;
    protected int eid;
    protected Employee employee;

    /**
     * Gets the value of the counter property.
     * 
     */
    public int getCounter() {
        return counter;
    }

    /**
     * Sets the value of the counter property.
     * 
     */
    public void setCounter(int value) {
        this.counter = value;
    }

    /**
     * Gets the value of the eid property.
     * 
     */
    public int getEid() {
        return eid;
    }

    /**
     * Sets the value of the eid property.
     * 
     */
    public void setEid(int value) {
        this.eid = value;
    }

    /**
     * Gets the value of the employee property.
     * 
     * @return
     *     possible object is
     *     {@link Employee }
     *     
     */
    public Employee getEmployee() {
        return employee;
    }

    /**
     * Sets the value of the employee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Employee }
     *     
     */
    public void setEmployee(Employee value) {
        this.employee = value;
    }

}
