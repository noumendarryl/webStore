
package com.store.integration;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.Action;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.2
 * Generated source version: 3.0
 * 
 */
@WebService(name = "BankingEndpoint", targetNamespace = "http://facade.paymentmgmt.bank.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BankingEndpoint {


    /**
     * 
     * @param amountPaid
     * @param cardNumber
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod
    @WebResult(name = "acceptedPayment", targetNamespace = "")
    @RequestWrapper(localName = "paymentOperation", targetNamespace = "http://facade.paymentmgmt.bank.com/", className = "com.store.PaymentOperation")
    @ResponseWrapper(localName = "paymentOperationResponse", targetNamespace = "http://facade.paymentmgmt.bank.com/", className = "com.store.PaymentOperationResponse")
    @Action(input = "http://facade.paymentmgmt.bank.com/BankingEndpoint/paymentOperationRequest", output = "http://facade.paymentmgmt.bank.com/BankingEndpoint/paymentOperationResponse")
    public Boolean paymentOperation(
        @WebParam(name = "cardNumber", targetNamespace = "")
        String cardNumber,
        @WebParam(name = "amountPaid", targetNamespace = "")
        Double amountPaid);

}
