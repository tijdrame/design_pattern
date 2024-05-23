package com.emard.proxy.models;

import com.emard.proxy.interf.Bank;

import java.util.ArrayList;
import java.util.List;

public class ProxyBank implements Bank {
    private RealBank bank ;
    public ProxyBank(RealBank bank) {
        this.bank = bank;
    }
    private static List<String> bannedClients;
    static {
        bannedClients = new ArrayList<>();
        bannedClients.add("xXcs");
        bannedClients.add("me@me");
        bannedClients.add("@xmil.com");
    }
    @Override
    public void withdrawMoney(String clientName) throws Exception {
        if(bannedClients.contains(clientName.toLowerCase())){
            throw new Exception(clientName+" Acces Denied!");
        }
        bank.withdrawMoney(clientName);
    }
}
