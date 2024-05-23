package com.emard.proxy.models;

import com.emard.proxy.interf.Bank;

public class RealBank implements Bank {
    @Override
    public void withdrawMoney(String clientName) throws Exception {
        System.out.println(clientName +" is Withdrawing from the ATM...");
    }
}
