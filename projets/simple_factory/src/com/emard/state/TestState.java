package com.emard.state;

import com.emard.state.models.SodaMachine;

public class TestState {
    public static void main(String[] args) {
        SodaMachine sodaMachine = new SodaMachine(10);
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
        System.out.println("Invetory: "+sodaMachine.count);
    }
}
