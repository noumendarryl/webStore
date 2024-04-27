package com.store.model;

import com.store.business.logic.PaymentValidator;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named(value = "paymentModel")
@RequestScoped
public class PaymentBean {

    private  String ccNumber;

    private Double amount;

    @Inject
    private PaymentValidator paymentValidator;

    public String doPaymentWithSoap() {
        System.out.println("Le paiement commence");
        boolean isValid = paymentValidator.process(ccNumber, amount);
        if(isValid==true) {
            return "valid";
        } else {
            return "invalid";
        }
    }

    public String getCcNumber() {
        return ccNumber;
    }

    public void setCcNumber(String ccNumber) {
        this.ccNumber = ccNumber;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

}
