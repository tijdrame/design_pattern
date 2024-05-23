package com.emard.state;

import com.emard.state.models.SodaMachine;
import com.emard.state.models.SodaVendingMachine;

public class TestState {
    public static void main(String[] args) {
        /*SodaMachine sodaMachine = new SodaMachine(10);
        sodaMachine.insertMoney();
        sodaMachine.selectSoda();
        System.out.println("Invetory: "+sodaMachine.count);
        System.out.println("---------");
        sodaMachine.insertMoney();
        sodaMachine.ejectMoney();
        sodaMachine.selectSoda();
        System.out.println("Invetory: "+sodaMachine.count);
        System.out.println("---------");
        sodaMachine.insertMoney();
        sodaMachine.selectSoda();
        sodaMachine.insertMoney();
        sodaMachine.selectSoda();
        sodaMachine.ejectMoney();
        System.out.println("Invetory: "+sodaMachine.count);*/
        SodaVendingMachine vendingMachine = new SodaVendingMachine(10);
        System.out.println(vendingMachine);
        vendingMachine.insertMoney();
        vendingMachine.selectSoda();
        vendingMachine.dispense();
        System.out.println(vendingMachine);
        vendingMachine.insertMoney();
        vendingMachine.selectSoda();
        vendingMachine.insertMoney();
        vendingMachine.selectSoda();
        vendingMachine.dispense();
        System.out.println(vendingMachine);
    }
}
