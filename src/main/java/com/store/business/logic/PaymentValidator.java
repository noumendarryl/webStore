package com.store.business.logic;

import jakarta.ejb.Local;

@Local
public interface PaymentValidator {

    public Boolean process(String ccNumber, Double amount);

}
