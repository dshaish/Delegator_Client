
package org.delegator.wsclient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for employee complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="employee">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="boss" type="{http://api.delegator.org/}employee" minOccurs="0"/>
 *         &lt;element name="doneBy" type="{http://api.delegator.org/}doneBy" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="eid" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="employee" type="{http://api.delegator.org/}employee" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="lname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="userName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "employee", propOrder = {
    "boss",
    "doneBy",
    "eid",
    "employee",
    "lname",
    "name",
    "password",
    "userName"
})
public class Employee {

    protected Employee boss;
    @XmlElement(nillable = true)
    protected List<DoneBy> doneBy;
    protected Long eid;
    @XmlElement(nillable = true)
    protected List<Employee> employee;
    protected String lname;
    protected String name;
    protected Integer password;
    protected String userName;

    /**
     * Gets the value of the boss property.
     * 
     * @return
     *     possible object is
     *     {@link Employee }
     *     
     */
    public Employee getBoss() {
        return boss;
    }

    /**
     * Sets the value of the boss property.
     * 
     * @param value
     *     allowed object is
     *     {@link Employee }
     *     
     */
    public void setBoss(Employee value) {
        this.boss = value;
    }

    /**
     * Gets the value of the doneBy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the doneBy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDoneBy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DoneBy }
     * 
     * 
     */
    public List<DoneBy> getDoneBy() {
        if (doneBy == null) {
            doneBy = new ArrayList<DoneBy>();
        }
        return this.doneBy;
    }

    /**
     * Gets the value of the eid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEid() {
        return eid;
    }

    /**
     * Sets the value of the eid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEid(Long value) {
        this.eid = value;
    }

    /**
     * Gets the value of the employee property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the employee property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmployee().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Employee }
     * 
     * 
     */
    public List<Employee> getEmployee() {
        if (employee == null) {
            employee = new ArrayList<Employee>();
        }
        return this.employee;
    }

    /**
     * Gets the value of the lname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLname() {
        return lname;
    }

    /**
     * Sets the value of the lname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLname(String value) {
        this.lname = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPassword(Integer value) {
        this.password = value;
    }

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

}
