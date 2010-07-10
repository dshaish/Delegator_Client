
package org.delegator.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for userTasksFilter.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="userTasksFilter">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ACTIVE"/>
 *     &lt;enumeration value="ALL"/>
 *     &lt;enumeration value="FLAGGED"/>
 *     &lt;enumeration value="SUSPENDED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "userTasksFilter")
@XmlEnum
public enum UserTasksFilter {

    ACTIVE,
    ALL,
    FLAGGED,
    SUSPENDED;

    public String value() {
        return name();
    }

    public static UserTasksFilter fromValue(String v) {
        return valueOf(v);
    }

}
