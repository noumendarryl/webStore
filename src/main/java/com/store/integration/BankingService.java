
package com.store.integration;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import jakarta.xml.ws.Service;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceClient;
import jakarta.xml.ws.WebServiceException;
import jakarta.xml.ws.WebServiceFeature;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.2
 * Generated source version: 3.0
 * 
 */
@WebServiceClient(name = "BankingService", targetNamespace = "http://facade.paymentmgmt.bank.com/", wsdlLocation = "http://0.0.0.0:11080/BankingService/BankingServiceBean?wsdl")
public class BankingService
    extends Service
{

    private static final URL BANKINGSERVICE_WSDL_LOCATION;
    private static final WebServiceException BANKINGSERVICE_EXCEPTION;
    private static final QName BANKINGSERVICE_QNAME = new QName("http://facade.paymentmgmt.bank.com/", "BankingService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://0.0.0.0:11080/BankingService/BankingServiceBean?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        BANKINGSERVICE_WSDL_LOCATION = url;
        BANKINGSERVICE_EXCEPTION = e;
    }

    public BankingService() {
        super(__getWsdlLocation(), BANKINGSERVICE_QNAME);
    }

    public BankingService(WebServiceFeature... features) {
        super(__getWsdlLocation(), BANKINGSERVICE_QNAME, features);
    }

    public BankingService(URL wsdlLocation) {
        super(wsdlLocation, BANKINGSERVICE_QNAME);
    }

    public BankingService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, BANKINGSERVICE_QNAME, features);
    }

    public BankingService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BankingService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns BankingEndpoint
     */
    @WebEndpoint(name = "BankingPort")
    public BankingEndpoint getBankingPort() {
        return super.getPort(new QName("http://facade.paymentmgmt.bank.com/", "BankingPort"), BankingEndpoint.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BankingEndpoint
     */
    @WebEndpoint(name = "BankingPort")
    public BankingEndpoint getBankingPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://facade.paymentmgmt.bank.com/", "BankingPort"), BankingEndpoint.class, features);
    }

    private static URL __getWsdlLocation() {
        if (BANKINGSERVICE_EXCEPTION!= null) {
            throw BANKINGSERVICE_EXCEPTION;
        }
        return BANKINGSERVICE_WSDL_LOCATION;
    }

}