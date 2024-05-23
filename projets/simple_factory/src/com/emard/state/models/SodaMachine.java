package com.emard.state.models;
//code spaghetti
public class SodaMachine {
    //STATES
    final static int SOLD_OUT= 0;
    final static int NO_MONEY= 1;
    final static int HAS_MONEY= 2;
    final static int SOLD= 3;
    int state = SOLD_OUT;
    public int count = 0;
    public SodaMachine(int count){
        this.count = count;
        if(count>0){
            state = NO_MONEY;
            System.out.println("Welcome to our Soda Vending Machine");
            System.out.println("Inventory is "+count+" Sodas");
            System.out.println("Insert a dollar bill to get started");
        }

    }
    //actions
    public void insertMoney(){
        if(state == HAS_MONEY){
            System.out.println("You can't insiert  another dollar bill");
        }else if(state == NO_MONEY){
            state = HAS_MONEY;
            System.out.println("You inserted a dollar");
        } else if (state == SOLD_OUT) {
            System.out.println("The machine is sold out");
        } else if (state == SOLD) {
            System.out.println("Please wait! We are already giving you a soda!");
        }
    }
    public void ejectMoney(){
        if(state == HAS_MONEY){
            System.out.println("Returning dollar bill");
            state = NO_MONEY;
        } else if (state == NO_MONEY) {
            System.out.println("You haven't inserted a dollar bill");
        }else if(state == SOLD){
            System.out.println("Already selected soda!");
        }else if(state == SOLD_OUT){
            System.out.println("Machine Sold out!");
        }
    }
    public void selectSoda(){
        if(state == SOLD){
            System.out.println("Dispensing your soda as we speak... Enjoy!");
        }else if (state == NO_MONEY){
            System.out.println("You selected soda, but money first, buddy!");
        } else if (state == SOLD_OUT) {
            System.out.println("You're outta luck - No sodas left :(");
        } else if (state == HAS_MONEY) {
            System.out.println("You selected a soda...");
            state = SOLD;
            dispense();
        }
    }
    public void dispense(){
        if(state == SOLD){
            System.out.println("Dispensing your soda as we speak... Enjoy!");
            count = count -1;
            if(count == 0){
                System.out.println("Sorry out of sodas");
                state = SOLD_OUT;
            } else  {
                state = NO_MONEY;
            }
        } else if (state == NO_MONEY) {
            System.out.println("please insert a dollar  bill first");
        } else if (state == SOLD_OUT) {
            System.out.println("Machine sold out!");
        } else if (state == HAS_MONEY) {
            System.out.println("No soda dispensed");
        }
    }
}
