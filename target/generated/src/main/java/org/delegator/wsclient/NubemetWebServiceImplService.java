
/*
 * 
 */

package org.delegator.wsclient;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.2.9
 * Mon Jul 19 00:04:16 IDT 2010
 * Generated source version: 2.2.9
 * 
 */


@WebServiceClient(name = "NubemetWebServiceImplService", 
                  wsdlLocation = "http://localhost:8080/Delegator/services/NubemetWebService?wsdl",
                  targetNamespace = "http://engine.delegator.org/") 
public class NubemetWebServiceImplService extends Service {

    public final static URL WSDL_LOCATION;
    public final static QName SERVICE = new QName("http://engine.delegator.org/", "NubemetWebServiceImplService");
    public final static QName NubemetWebServiceImplPort = new QName("http://engine.delegator.org/", "NubemetWebServiceImplPort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8080/Delegator/services/NubemetWebService?wsdl");
        } catch (MalformedURLException e) {
            System.err.println("Can not initialize the default wsdl from http://localhost:8080/Delegator/services/NubemetWebService?wsdl");
            // e.printStackTrace();
        }
        WSDL_LOCATION = url;
    }

    public NubemetWebServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public NubemetWebServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public NubemetWebServiceImplService() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     * 
     * @return
     *     returns NubemetWebService
     */
    @WebEndpoint(name = "NubemetWebServiceImplPort")
    public NubemetWebService getNubemetWebServiceImplPort() {
        return super.getPort(NubemetWebServiceImplPort, NubemetWebService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns NubemetWebService
     */
    @WebEndpoint(name = "NubemetWebServiceImplPort")
    public NubemetWebService getNubemetWebServiceImplPort(WebServiceFeature... features) {
        return super.getPort(NubemetWebServiceImplPort, NubemetWebService.class, features);
    }

}
