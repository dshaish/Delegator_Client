
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
 *         &lt;element name="attachment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="delegated" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="doneBies" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="doneBies_1" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="edate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="employee" type="{http://api.delegator.org/}employee" minOccurs="0"/>
 *         &lt;element name="finishedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="flagged" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tasksCByTid" type="{http://api.delegator.org/}tasksC" minOccurs="0"/>
 *         &lt;element name="tasksCsForParentTaskId" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="tasksCsForParentTaskId_1" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="tasksCsForRootTaskId" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="tasksCsForRootTaskId_1" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="tid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="updates" type="{http://api.delegator.org/}updates" minOccurs="0"/>
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
    "attachment",
    "cdate",
    "delegated",
    "description",
    "doneBies",
    "doneBies1",
    "edate",
    "employee",
    "finishedDate",
    "flagged",
    "status",
    "tasksCByTid",
    "tasksCsForParentTaskId",
    "tasksCsForParentTaskId1",
    "tasksCsForRootTaskId",
    "tasksCsForRootTaskId1",
    "tid",
    "title",
    "updates"
})
public class Tasks {

    protected String attachment;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar cdate;
    protected byte delegated;
    protected String description;
    @XmlElement(nillable = true)
    protected List<Object> doneBies;
    @XmlElement(name = "doneBies_1", nillable = true)
    protected List<Object> doneBies1;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar edate;
    protected Employee employee;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar finishedDate;
    protected byte flagged;
    protected String status;
    protected TasksC tasksCByTid;
    @XmlElement(nillable = true)
    protected List<Object> tasksCsForParentTaskId;
    @XmlElement(name = "tasksCsForParentTaskId_1", nillable = true)
    protected List<Object> tasksCsForParentTaskId1;
    @XmlElement(nillable = true)
    protected List<Object> tasksCsForRootTaskId;
    @XmlElement(name = "tasksCsForRootTaskId_1", nillable = true)
    protected List<Object> tasksCsForRootTaskId1;
    protected Integer tid;
    protected String title;
    protected Updates updates;

    /**
     * Gets the value of the attachment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttachment() {
        return attachment;
    }

    /**
     * Sets the value of the attachment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttachment(String value) {
        this.attachment = value;
    }

    /**
     * Gets the value of the cdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCdate() {
        return cdate;
    }

    /**
     * Sets the value of the cdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCdate(XMLGregorianCalendar value) {
        this.cdate = value;
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
     * Gets the value of the doneBies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the doneBies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDoneBies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getDoneBies() {
        if (doneBies == null) {
            doneBies = new ArrayList<Object>();
        }
        return this.doneBies;
    }

    /**
     * Gets the value of the doneBies1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the doneBies1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDoneBies1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getDoneBies1() {
        if (doneBies1 == null) {
            doneBies1 = new ArrayList<Object>();
        }
        return this.doneBies1;
    }

    /**
     * Gets the value of the edate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEdate() {
        return edate;
    }

    /**
     * Sets the value of the edate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEdate(XMLGregorianCalendar value) {
        this.edate = value;
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

    /**
     * Gets the value of the finishedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFinishedDate() {
        return finishedDate;
    }

    /**
     * Sets the value of the finishedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFinishedDate(XMLGregorianCalendar value) {
        this.finishedDate = value;
    }

    /**
     * Gets the value of the flagged property.
     * 
     */
    public byte getFlagged() {
        return flagged;
    }

    /**
     * Sets the value of the flagged property.
     * 
     */
    public void setFlagged(byte value) {
        this.flagged = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the tasksCByTid property.
     * 
     * @return
     *     possible object is
     *     {@link TasksC }
     *     
     */
    public TasksC getTasksCByTid() {
        return tasksCByTid;
    }

    /**
     * Sets the value of the tasksCByTid property.
     * 
     * @param value
     *     allowed object is
     *     {@link TasksC }
     *     
     */
    public void setTasksCByTid(TasksC value) {
        this.tasksCByTid = value;
    }

    /**
     * Gets the value of the tasksCsForParentTaskId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tasksCsForParentTaskId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTasksCsForParentTaskId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getTasksCsForParentTaskId() {
        if (tasksCsForParentTaskId == null) {
            tasksCsForParentTaskId = new ArrayList<Object>();
        }
        return this.tasksCsForParentTaskId;
    }

    /**
     * Gets the value of the tasksCsForParentTaskId1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tasksCsForParentTaskId1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTasksCsForParentTaskId1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getTasksCsForParentTaskId1() {
        if (tasksCsForParentTaskId1 == null) {
            tasksCsForParentTaskId1 = new ArrayList<Object>();
        }
        return this.tasksCsForParentTaskId1;
    }

    /**
     * Gets the value of the tasksCsForRootTaskId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tasksCsForRootTaskId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTasksCsForRootTaskId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getTasksCsForRootTaskId() {
        if (tasksCsForRootTaskId == null) {
            tasksCsForRootTaskId = new ArrayList<Object>();
        }
        return this.tasksCsForRootTaskId;
    }

    /**
     * Gets the value of the tasksCsForRootTaskId1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tasksCsForRootTaskId1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTasksCsForRootTaskId1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getTasksCsForRootTaskId1() {
        if (tasksCsForRootTaskId1 == null) {
            tasksCsForRootTaskId1 = new ArrayList<Object>();
        }
        return this.tasksCsForRootTaskId1;
    }

    /**
     * Gets the value of the tid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTid() {
        return tid;
    }

    /**
     * Sets the value of the tid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTid(Integer value) {
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
     * Gets the value of the updates property.
     * 
     * @return
     *     possible object is
     *     {@link Updates }
     *     
     */
    public Updates getUpdates() {
        return updates;
    }

    /**
     * Sets the value of the updates property.
     * 
     * @param value
     *     allowed object is
     *     {@link Updates }
     *     
     */
    public void setUpdates(Updates value) {
        this.updates = value;
    }

}
