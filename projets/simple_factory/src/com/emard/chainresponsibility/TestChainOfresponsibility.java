package com.emard.chainresponsibility;

import com.emard.chainresponsibility.models.CEOPurchasePower;
import com.emard.chainresponsibility.models.DirectorPurchasePower;
import com.emard.chainresponsibility.models.ManagerPurchasePower;
import com.emard.chainresponsibility.models.PurchaseRequest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestChainOfresponsibility {
    public static void main(String[] args) throws IOException {
        CEOPurchasePower ceo = new CEOPurchasePower();
        DirectorPurchasePower dir = new DirectorPurchasePower();
        ManagerPurchasePower man = new ManagerPurchasePower();
        ceo.setSucessor(dir);
        dir.setSucessor(ceo);
        man.setSucessor(dir);
        while (true){
            System.out.println("Enter the amount >>");
            double amount = Double.parseDouble(new
                    BufferedReader(new InputStreamReader(System.in)).readLine());
            man.processRequest(new PurchaseRequest(amount, "Buy Stuff"));

        }
    }
}
