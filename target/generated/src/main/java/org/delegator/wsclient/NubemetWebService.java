package org.delegator.wsclient;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.2.9
 * Sat Jul 10 16:17:05 IDT 2010
 * Generated source version: 2.2.9
 * 
 */
 
@WebService(targetNamespace = "http://api.delegator.org/", name = "NubemetWebService")
@XmlSeeAlso({ObjectFactory.class})
public interface NubemetWebService {

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "removeTask", targetNamespace = "http://api.delegator.org/", className = "org.delegator.wsclient.RemoveTask")
    @WebMethod
    @ResponseWrapper(localName = "removeTaskResponse", targetNamespace = "http://api.delegator.org/", className = "org.delegator.wsclient.RemoveTaskResponse")
    public boolean removeTask(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "authenticate", targetNamespace = "http://api.delegator.org/", className = "org.delegator.wsclient.Authenticate")
    @WebMethod
    @ResponseWrapper(localName = "authenticateResponse", targetNamespace = "http://api.delegator.org/", className = "org.delegator.wsclient.AuthenticateResponse")
    public boolean authenticate(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        java.lang.String arg1
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getTasks", targetNamespace = "http://api.delegator.org/", className = "org.delegator.wsclient.GetTasks")
    @WebMethod
    @ResponseWrapper(localName = "getTasksResponse", targetNamespace = "http://api.delegator.org/", className = "org.delegator.wsclient.GetTasksResponse")
    public java.util.List<org.delegator.wsclient.NubemetTask> getTasks(
        @WebParam(name = "arg0", targetNamespace = "")
        org.delegator.wsclient.UserTasksFilter arg0
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getWorksForMe", targetNamespace = "http://api.delegator.org/", className = "org.delegator.wsclient.GetWorksForMe")
    @WebMethod
    @ResponseWrapper(localName = "getWorksForMeResponse", targetNamespace = "http://api.delegator.org/", className = "org.delegator.wsclient.GetWorksForMeResponse")
    public org.delegator.wsclient.HashMap getWorksForMe();

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "addTask", targetNamespace = "http://api.delegator.org/", className = "org.delegator.wsclient.AddTask")
    @WebMethod
    @ResponseWrapper(localName = "addTaskResponse", targetNamespace = "http://api.delegator.org/", className = "org.delegator.wsclient.AddTaskResponse")
    public boolean addTask(
        @WebParam(name = "arg0", targetNamespace = "")
        org.delegator.wsclient.NubemetTask arg0
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "delegateTask", targetNamespace = "http://api.delegator.org/", className = "org.delegator.wsclient.DelegateTask")
    @WebMethod
    @ResponseWrapper(localName = "delegateTaskResponse", targetNamespace = "http://api.delegator.org/", className = "org.delegator.wsclient.DelegateTaskResponse")
    public boolean delegateTask(
        @WebParam(name = "arg0", targetNamespace = "")
        java.util.List<java.lang.Integer> arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1
    );
}