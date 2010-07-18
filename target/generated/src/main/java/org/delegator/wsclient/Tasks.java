
package org.delegator.wsclient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for tasks complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tasks">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="creator" type="{http://api.delegator.org/}employee" minOccurs="0"/>
 *         &lt;element name="delegated" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="doneBy" type="{http://api.delegator.org/}doneBy" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="tid" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="eDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tasks", propOrder = {
    "creator",
    "delegated",
    "description",
    "doneBy",
    "tid",
    "title",
    "cDate",
    "eDate"
})
public class Tasks {

    protected Employee creator;
    protected byte delegated;
    protected String description;
    @XmlElement(nillable = true)
    protected List<DoneBy> doneBy;
    protected Long tid;
    protected String title;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar cDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar eDate;

    /**
     * Gets the value of the creator property.
     * 
     * @return
     *     possible object is
     *     {@link Employee }
     *     
     */
    public Employee getCreator() {
        return creator;
    }

    /**
     * Sets the value of the creator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Employee }
     *     
     */
    public void setCreator(Employee value) {
        this.creator = value;
    }

    /**
     * Gets the value of the delegated property.
     * 
     */
    public byte getDelegated() {
        return delegated;
    }

    /**
     * Sets the value of the delegated property.
     * 
     */
    public void setDelegated(byte value) {
        this.delegated = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
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
     * Gets the value of the tid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTid() {
        return tid;
    }

    /**
     * Sets the value of the tid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTid(Long value) {
        this.tid = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the cDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCDate() {
        return cDate;
    }

    /**
     * Sets the value of the cDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCDate(XMLGregorianCalendar value) {
        this.cDate = value;
    }

    /**
     * Gets the value of the eDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEDate() {
        return eDate;
    }

    /**
     * Sets the value of the eDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEDate(XMLGregorianCalendar value) {
        this.eDate = value;
    }

}
