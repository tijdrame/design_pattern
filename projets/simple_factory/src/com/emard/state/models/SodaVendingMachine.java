package com.emard.state.models;

import com.emard.state.interf.State;

public class SodaVendingMachine {
    State soldOutState;
    State noMoneyState;
    State hasMoneyState;
    State soldState;
    State state = soldOutState;
    int count = 0;

    public SodaVendingMachine(int count) {
        soldOutState = new SoldOutState(this);
        noMoneyState = new NoMoneyState(this);
        hasMoneyState = new HasMoneyState(this);
        soldState = new SoldState(this);
        this.count = count;
        if(count > 0){
            state = noMoneyState;
        }
    }
    //actions
    public void insertMoney(){
        state.insertMoney();
    }
    public void ejectMoney(){
        state.ejectMoney();
    }
    public void selectSoda(){
        state.select();
    }
    public void dispense(){
        state.dispense();
    }

    public int getCount() {
        return count;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public void setSoldOutState(State soldOutState) {
        this.soldOutState = soldOutState;
    }

    public State getNoMoneyState() {
        return noMoneyState;
    }

    public void setNoMoneyState(State noMoneyState) {
        this.noMoneyState = noMoneyState;
    }

    public State getHasMoneyState() {
        return hasMoneyState;
    }

    public void setHasMoneyState(State hasMoneyState) {
        this.hasMoneyState = hasMoneyState;
    }

    public State getSoldState() {
        return soldState;
    }

    public void setSoldState(State soldState) {
        this.soldState = soldState;
    }

    @Override
    public String toString() {
        return "SodaVendingMachine{" +
                "state=" + state +
                ", inventory=" + count +
                '}';
    }
}
