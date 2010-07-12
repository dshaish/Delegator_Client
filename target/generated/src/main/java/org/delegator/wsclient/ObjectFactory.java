
package org.delegator.wsclient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.delegator.wsclient package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AuthenticateResponse_QNAME = new QName("http://api.delegator.org/", "authenticateResponse");
    private final static QName _DelegateTaskResponse_QNAME = new QName("http://api.delegator.org/", "delegateTaskResponse");
    private final static QName _RemoveTask_QNAME = new QName("http://api.delegator.org/", "removeTask");
    private final static QName _DelegateTask_QNAME = new QName("http://api.delegator.org/", "delegateTask");
    private final static QName _GetTasksResponse_QNAME = new QName("http://api.delegator.org/", "getTasksResponse");
    private final static QName _GetWorksForMe_QNAME = new QName("http://api.delegator.org/", "getWorksForMe");
    private final static QName _AddTask_QNAME = new QName("http://api.delegator.org/", "addTask");
    private final static QName _AddTaskResponse_QNAME = new QName("http://api.delegator.org/", "addTaskResponse");
    private final static QName _GetWorksForMeResponse_QNAME = new QName("http://api.delegator.org/", "getWorksForMeResponse");
    private final static QName _GetTasks_QNAME = new QName("http://api.delegator.org/", "getTasks");
    private final static QName _Authenticate_QNAME = new QName("http://api.delegator.org/", "authenticate");
    private final static QName _RemoveTaskResponse_QNAME = new QName("http://api.delegator.org/", "removeTaskResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.delegator.wsclient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetTasksResponse }
     * 
     */
    public GetTasksResponse createGetTasksResponse() {
        return new GetTasksResponse();
    }

    /**
     * Create an instance of {@link RemoveTask }
     * 
     */
    public RemoveTask createRemoveTask() {
        return new RemoveTask();
    }

    /**
     * Create an instance of {@link GetTasks }
     * 
     */
    public GetTasks createGetTasks() {
        return new GetTasks();
    }

    /**
     * Create an instance of {@link OnTime }
     * 
     */
    public OnTime createOnTime() {
        return new OnTime();
    }

    /**
     * Create an instance of {@link RemoveTaskResponse }
     * 
     */
    public RemoveTaskResponse createRemoveTaskResponse() {
        return new RemoveTaskResponse();
    }

    /**
     * Create an instance of {@link DelegateTaskResponse }
     * 
     */
    public DelegateTaskResponse createDelegateTaskResponse() {
        return new DelegateTaskResponse();
    }

    /**
     * Create an instance of {@link Tasks }
     * 
     */
    public Tasks createTasks() {
        return new Tasks();
    }

    /**
     * Create an instance of {@link Updates }
     * 
     */
    public Updates createUpdates() {
        return new Updates();
    }

    /**
     * Create an instance of {@link DelegateTask }
     * 
     */
    public DelegateTask createDelegateTask() {
        return new DelegateTask();
    }

    /**
     * Create an instance of {@link AddTaskResponse }
     * 
     */
    public AddTaskResponse createAddTaskResponse() {
        return new AddTaskResponse();
    }

    /**
     * Create an instance of {@link Employee }
     * 
     */
    public Employee createEmployee() {
        return new Employee();
    }

    /**
     * Create an instance of {@link AuthenticateResponse }
     * 
     */
    public AuthenticateResponse createAuthenticateResponse() {
        return new AuthenticateResponse();
    }

    /**
     * Create an instance of {@link HashMap }
     * 
     */
    public HashMap createHashMap() {
        return new HashMap();
    }

    /**
     * Create an instance of {@link GetWorksForMeResponse }
     * 
     */
    public GetWorksForMeResponse createGetWorksForMeResponse() {
        return new GetWorksForMeResponse();
    }

    /**
     * Create an instance of {@link Late }
     * 
     */
    public Late createLate() {
        return new Late();
    }

    /**
     * Create an instance of {@link Authenticate }
     * 
     */
    public Authenticate createAuthenticate() {
        return new Authenticate();
    }

    /**
     * Create an instance of {@link GetWorksForMe }
     * 
     */
    public GetWorksForMe createGetWorksForMe() {
        return new GetWorksForMe();
    }

    /**
     * Create an instance of {@link NubemetTask }
     * 
     */
    public NubemetTask createNubemetTask() {
        return new NubemetTask();
    }

    /**
     * Create an instance of {@link TasksC }
     * 
     */
    public TasksC createTasksC() {
        return new TasksC();
    }

    /**
     * Create an instance of {@link AddTask }
     * 
     */
    public AddTask createAddTask() {
        return new AddTask();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.delegator.org/", name = "authenticateResponse")
    public JAXBElement<AuthenticateResponse> createAuthenticateResponse(AuthenticateResponse value) {
        return new JAXBElement<AuthenticateResponse>(_AuthenticateResponse_QNAME, AuthenticateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DelegateTaskResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.delegator.org/", name = "delegateTaskResponse")
    public JAXBElement<DelegateTaskResponse> createDelegateTaskResponse(DelegateTaskResponse value) {
        return new JAXBElement<DelegateTaskResponse>(_DelegateTaskResponse_QNAME, DelegateTaskResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveTask }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.delegator.org/", name = "removeTask")
    public JAXBElement<RemoveTask> createRemoveTask(RemoveTask value) {
        return new JAXBElement<RemoveTask>(_RemoveTask_QNAME, RemoveTask.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DelegateTask }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.delegator.org/", name = "delegateTask")
    public JAXBElement<DelegateTask> createDelegateTask(DelegateTask value) {
        return new JAXBElement<DelegateTask>(_DelegateTask_QNAME, DelegateTask.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTasksResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.delegator.org/", name = "getTasksResponse")
    public JAXBElement<GetTasksResponse> createGetTasksResponse(GetTasksResponse value) {
        return new JAXBElement<GetTasksResponse>(_GetTasksResponse_QNAME, GetTasksResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWorksForMe }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.delegator.org/", name = "getWorksForMe")
    public JAXBElement<GetWorksForMe> createGetWorksForMe(GetWorksForMe value) {
        return new JAXBElement<GetWorksForMe>(_GetWorksForMe_QNAME, GetWorksForMe.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddTask }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.delegator.org/", name = "addTask")
    public JAXBElement<AddTask> createAddTask(AddTask value) {
        return new JAXBElement<AddTask>(_AddTask_QNAME, AddTask.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddTaskResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.delegator.org/", name = "addTaskResponse")
    public JAXBElement<AddTaskResponse> createAddTaskResponse(AddTaskResponse value) {
        return new JAXBElement<AddTaskResponse>(_AddTaskResponse_QNAME, AddTaskResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWorksForMeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.delegator.org/", name = "getWorksForMeResponse")
    public JAXBElement<GetWorksForMeResponse> createGetWorksForMeResponse(GetWorksForMeResponse value) {
        return new JAXBElement<GetWorksForMeResponse>(_GetWorksForMeResponse_QNAME, GetWorksForMeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTasks }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.delegator.org/", name = "getTasks")
    public JAXBElement<GetTasks> createGetTasks(GetTasks value) {
        return new JAXBElement<GetTasks>(_GetTasks_QNAME, GetTasks.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Authenticate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.delegator.org/", name = "authenticate")
    public JAXBElement<Authenticate> createAuthenticate(Authenticate value) {
        return new JAXBElement<Authenticate>(_Authenticate_QNAME, Authenticate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveTaskResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.delegator.org/", name = "removeTaskResponse")
    public JAXBElement<RemoveTaskResponse> createRemoveTaskResponse(RemoveTaskResponse value) {
        return new JAXBElement<RemoveTaskResponse>(_RemoveTaskResponse_QNAME, RemoveTaskResponse.class, null, value);
    }

}
