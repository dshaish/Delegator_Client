
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
 * <p>Java class for employee complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="employee">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="archiveds" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="archiveds_1" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="archiveds_2" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="archiveds_3" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="auth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bdate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="divisionses" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="divisionses_1" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="divisionses_2" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="divisionses_3" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="doneBies" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="doneBies_1" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="eid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="employeesForEid" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="employeesForEid_1" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="employeesForManagerId" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="employeesForManagerId_1" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="jobDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="late" type="{http://api.delegator.org/}late" minOccurs="0"/>
 *         &lt;element name="lname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="onTime" type="{http://api.delegator.org/}onTime" minOccurs="0"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="phoneNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="taskses" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="taskses_1" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
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
    "address",
    "archiveds",
    "archiveds1",
    "archiveds2",
    "archiveds3",
    "auth",
    "bdate",
    "divisionses",
    "divisionses1",
    "divisionses2",
    "divisionses3",
    "doneBies",
    "doneBies1",
    "eid",
    "email",
    "employeesForEid",
    "employeesForEid1",
    "employeesForManagerId",
    "employeesForManagerId1",
    "jobDesc",
    "late",
    "lname",
    "name",
    "onTime",
    "password",
    "phoneNum",
    "taskses",
    "taskses1",
    "userName"
})
public class Employee {

    protected String address;
    @XmlElement(nillable = true)
    protected List<Object> archiveds;
    @XmlElement(name = "archiveds_1", nillable = true)
    protected List<Object> archiveds1;
    @XmlElement(name = "archiveds_2", nillable = true)
    protected List<Object> archiveds2;
    @XmlElement(name = "archiveds_3", nillable = true)
    protected List<Object> archiveds3;
    protected String auth;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar bdate;
    @XmlElement(nillable = true)
    protected List<Object> divisionses;
    @XmlElement(name = "divisionses_1", nillable = true)
    protected List<Object> divisionses1;
    @XmlElement(name = "divisionses_2", nillable = true)
    protected List<Object> divisionses2;
    @XmlElement(name = "divisionses_3", nillable = true)
    protected List<Object> divisionses3;
    @XmlElement(nillable = true)
    protected List<Object> doneBies;
    @XmlElement(name = "doneBies_1", nillable = true)
    protected List<Object> doneBies1;
    protected int eid;
    protected String email;
    @XmlElement(nillable = true)
    protected List<Object> employeesForEid;
    @XmlElement(name = "employeesForEid_1", nillable = true)
    protected List<Object> employeesForEid1;
    @XmlElement(nillable = true)
    protected List<Object> employeesForManagerId;
    @XmlElement(name = "employeesForManagerId_1", nillable = true)
    protected List<Object> employeesForManagerId1;
    protected String jobDesc;
    protected Late late;
    protected String lname;
    protected String name;
    protected OnTime onTime;
    protected Integer password;
    protected Integer phoneNum;
    @XmlElement(nillable = true)
    protected List<Object> taskses;
    @XmlElement(name = "taskses_1", nillable = true)
    protected List<Object> taskses1;
    protected String userName;

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the archiveds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the archiveds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArchiveds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getArchiveds() {
        if (archiveds == null) {
            archiveds = new ArrayList<Object>();
        }
        return this.archiveds;
    }

    /**
     * Gets the value of the archiveds1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the archiveds1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArchiveds1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getArchiveds1() {
        if (archiveds1 == null) {
            archiveds1 = new ArrayList<Object>();
        }
        return this.archiveds1;
    }

    /**
     * Gets the value of the archiveds2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the archiveds2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArchiveds2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getArchiveds2() {
        if (archiveds2 == null) {
            archiveds2 = new ArrayList<Object>();
        }
        return this.archiveds2;
    }

    /**
     * Gets the value of the archiveds3 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the archiveds3 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArchiveds3().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getArchiveds3() {
        if (archiveds3 == null) {
            archiveds3 = new ArrayList<Object>();
        }
        return this.archiveds3;
    }

    /**
     * Gets the value of the auth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuth() {
        return auth;
    }

    /**
     * Sets the value of the auth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuth(String value) {
        this.auth = value;
    }

    /**
     * Gets the value of the bdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBdate() {
        return bdate;
    }

    /**
     * Sets the value of the bdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBdate(XMLGregorianCalendar value) {
        this.bdate = value;
    }

    /**
     * Gets the value of the divisionses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the divisionses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDivisionses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getDivisionses() {
        if (divisionses == null) {
            divisionses = new ArrayList<Object>();
        }
        return this.divisionses;
    }

    /**
     * Gets the value of the divisionses1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the divisionses1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDivisionses1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getDivisionses1() {
        if (divisionses1 == null) {
            divisionses1 = new ArrayList<Object>();
        }
        return this.divisionses1;
    }

    /**
     * Gets the value of the divisionses2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the divisionses2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDivisionses2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getDivisionses2() {
        if (divisionses2 == null) {
            divisionses2 = new ArrayList<Object>();
        }
        return this.divisionses2;
    }

    /**
     * Gets the value of the divisionses3 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the divisionses3 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDivisionses3().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getDivisionses3() {
        if (divisionses3 == null) {
            divisionses3 = new ArrayList<Object>();
        }
        return this.divisionses3;
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
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the employeesForEid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the employeesForEid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmployeesForEid().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getEmployeesForEid() {
        if (employeesForEid == null) {
            employeesForEid = new ArrayList<Object>();
        }
        return this.employeesForEid;
    }

    /**
     * Gets the value of the employeesForEid1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the employeesForEid1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmployeesForEid1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getEmployeesForEid1() {
        if (employeesForEid1 == null) {
            employeesForEid1 = new ArrayList<Object>();
        }
        return this.employeesForEid1;
    }

    /**
     * Gets the value of the employeesForManagerId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the employeesForManagerId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmployeesForManagerId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getEmployeesForManagerId() {
        if (employeesForManagerId == null) {
            employeesForManagerId = new ArrayList<Object>();
        }
        return this.employeesForManagerId;
    }

    /**
     * Gets the value of the employeesForManagerId1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the employeesForManagerId1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmployeesForManagerId1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getEmployeesForManagerId1() {
        if (employeesForManagerId1 == null) {
            employeesForManagerId1 = new ArrayList<Object>();
        }
        return this.employeesForManagerId1;
    }

    /**
     * Gets the value of the jobDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobDesc() {
        return jobDesc;
    }

    /**
     * Sets the value of the jobDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobDesc(String value) {
        this.jobDesc = value;
    }

    /**
     * Gets the value of the late property.
     * 
     * @return
     *     possible object is
     *     {@link Late }
     *     
     */
    public Late getLate() {
        return late;
    }

    /**
     * Sets the value of the late property.
     * 
     * @param value
     *     allowed object is
     *     {@link Late }
     *     
     */
    public void setLate(Late value) {
        this.late = value;
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
     * Gets the value of the onTime property.
     * 
     * @return
     *     possible object is
     *     {@link OnTime }
     *     
     */
    public OnTime getOnTime() {
        return onTime;
    }

    /**
     * Sets the value of the onTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link OnTime }
     *     
     */
    public void setOnTime(OnTime value) {
        this.onTime = value;
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
     * Gets the value of the phoneNum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPhoneNum() {
        return phoneNum;
    }

    /**
     * Sets the value of the phoneNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPhoneNum(Integer value) {
        this.phoneNum = value;
    }

    /**
     * Gets the value of the taskses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taskses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaskses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getTaskses() {
        if (taskses == null) {
            taskses = new ArrayList<Object>();
        }
        return this.taskses;
    }

    /**
     * Gets the value of the taskses1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taskses1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaskses1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getTaskses1() {
        if (taskses1 == null) {
            taskses1 = new ArrayList<Object>();
        }
        return this.taskses1;
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
