package com.emard.proxy;

import com.emard.proxy.interf.Bank;
import com.emard.proxy.models.ProxyBank;
import com.emard.proxy.models.RealBank;

public class TestProxy {
    public static void main(String[] args) {
        Bank bank = new ProxyBank(new RealBank());
        try {
            bank.withdrawMoney("Paulo");
            bank.withdrawMoney("me@me");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
