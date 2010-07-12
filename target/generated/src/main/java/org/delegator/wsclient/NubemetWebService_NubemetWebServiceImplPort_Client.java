
package org.delegator.wsclient;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
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

public final class NubemetWebService_NubemetWebServiceImplPort_Client {

    private static final QName SERVICE_NAME = new QName("http://engine.delegator.org/", "NubemetWebServiceImplService");

    private NubemetWebService_NubemetWebServiceImplPort_Client() {
    }

    public static void main(String args[]) throws Exception {
        URL wsdlURL = NubemetWebServiceImplService.WSDL_LOCATION;
        if (args.length > 0) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        NubemetWebServiceImplService ss = new NubemetWebServiceImplService(wsdlURL, SERVICE_NAME);
        NubemetWebService port = ss.getNubemetWebServiceImplPort();  
        
        {
        System.out.println("Invoking removeTask...");
        int _removeTask_arg0 = 0;
        boolean _removeTask__return = port.removeTask(_removeTask_arg0);
        System.out.println("removeTask.result=" + _removeTask__return);


        }
        {
        System.out.println("Invoking authenticate...");
        java.lang.String _authenticate_arg0 = "";
        java.lang.String _authenticate_arg1 = "";
        boolean _authenticate__return = port.authenticate(_authenticate_arg0, _authenticate_arg1);
        System.out.println("authenticate.result=" + _authenticate__return);


        }
        {
        System.out.println("Invoking getTasks...");
        org.delegator.wsclient.UserTasksFilter _getTasks_arg0 = null;
        java.util.List<org.delegator.wsclient.NubemetTask> _getTasks__return = port.getTasks(_getTasks_arg0);
        System.out.println("getTasks.result=" + _getTasks__return);


        }
        {
        System.out.println("Invoking getWorksForMe...");
        org.delegator.wsclient.HashMap _getWorksForMe__return = port.getWorksForMe();
        System.out.println("getWorksForMe.result=" + _getWorksForMe__return);


        }
        {
        System.out.println("Invoking addTask...");
        org.delegator.wsclient.NubemetTask _addTask_arg0 = null;
        boolean _addTask__return = port.addTask(_addTask_arg0);
        System.out.println("addTask.result=" + _addTask__return);


        }
        {
        System.out.println("Invoking delegateTask...");
        java.util.List<java.lang.Integer> _delegateTask_arg0 = null;
        int _delegateTask_arg1 = 0;
        boolean _delegateTask__return = port.delegateTask(_delegateTask_arg0, _delegateTask_arg1);
        System.out.println("delegateTask.result=" + _delegateTask__return);


        }

        System.exit(0);
    }

}
