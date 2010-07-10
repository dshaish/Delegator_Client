
package org.delegator.wsclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tasksC complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tasksC">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="parallel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tasksByParentTaskId" type="{http://api.delegator.org/}tasks" minOccurs="0"/>
 *         &lt;element name="tasksByRootTaskId" type="{http://api.delegator.org/}tasks" minOccurs="0"/>
 *         &lt;element name="tasksByTid" type="{http://api.delegator.org/}tasks" minOccurs="0"/>
 *         &lt;element name="tid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tasksC", propOrder = {
    "parallel",
    "tasksByParentTaskId",
    "tasksByRootTaskId",
    "tasksByTid",
    "tid"
})
public class TasksC {

    protected Integer parallel;
    protected Tasks tasksByParentTaskId;
    protected Tasks tasksByRootTaskId;
    protected Tasks tasksByTid;
    protected int tid;

    /**
     * Gets the value of the parallel property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getParallel() {
        return parallel;
    }

    /**
     * Sets the value of the parallel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setParallel(Integer value) {
        this.parallel = value;
    }

    /**
     * Gets the value of the tasksByParentTaskId property.
     * 
     * @return
     *     possible object is
     *     {@link Tasks }
     *     
     */
    public Tasks getTasksByParentTaskId() {
        return tasksByParentTaskId;
    }

    /**
     * Sets the value of the tasksByParentTaskId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tasks }
     *     
     */
    public void setTasksByParentTaskId(Tasks value) {
        this.tasksByParentTaskId = value;
    }

    /**
     * Gets the value of the tasksByRootTaskId property.
     * 
     * @return
     *     possible object is
     *     {@link Tasks }
     *     
     */
    public Tasks getTasksByRootTaskId() {
        return tasksByRootTaskId;
    }

    /**
     * Sets the value of the tasksByRootTaskId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tasks }
     *     
     */
    public void setTasksByRootTaskId(Tasks value) {
        this.tasksByRootTaskId = value;
    }

    /**
     * Gets the value of the tasksByTid property.
     * 
     * @return
     *     possible object is
     *     {@link Tasks }
     *     
     */
    public Tasks getTasksByTid() {
        return tasksByTid;
    }

    /**
     * Sets the value of the tasksByTid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tasks }
     *     
     */
    public void setTasksByTid(Tasks value) {
        this.tasksByTid = value;
    }

    /**
     * Gets the value of the tid property.
     * 
     */
    public int getTid() {
        return tid;
    }

    /**
     * Sets the value of the tid property.
     * 
     */
    public void setTid(int value) {
        this.tid = value;
    }

}
