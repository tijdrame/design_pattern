package com.emard.state.models;

import com.emard.state.interf.State;

public class SoldState implements State {
    SodaVendingMachine sodaVendingMachine;
    public SoldState(SodaVendingMachine sodaVendingMachine){
        this.sodaVendingMachine = sodaVendingMachine;
    }
    @Override
    public void insertMoney() {
        System.out.println("Give a second... Soda coming!");
    }
    @Override
    public void ejectMoney() {
        System.out.println("Sorry... soda is coming");
    }
    @Override
    public void select() {
        System.out.println("Nope.. you can't eject the money if you already have the soda");
    }
    @Override
    public void dispense() {
        System.out.println("Stop trying to get second soda for free");
        if(sodaVendingMachine.getCount()>0){
            sodaVendingMachine.setState(sodaVendingMachine.noMoneyState);
            sodaVendingMachine.count -= 1;
        }else {
            System.out.println("Sorry... out of sodas");
            sodaVendingMachine.setState(sodaVendingMachine.getSoldOutState());
        }
    }
    @Override
    public String toString() {
        return "Dispensing soda...";
    }
}
