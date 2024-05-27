package com.emard.chainresponsibility.interf;

import com.emard.chainresponsibility.models.PurchaseRequest;

public abstract class PurchasePower {
    protected static final double BASE = 1000;
    protected PurchasePower successor;
    abstract protected double getAllowable();
    abstract protected String  getRole();
    public void setSucessor(PurchasePower successor){
        this.successor = successor;
    }
    public PurchasePower getSuccessor() {
        return successor;
    }
    public void processRequest(PurchaseRequest request){
        if(request.getAmount() < this.getAllowable()){
            System.out.println(this.getRole() + " will approve $"+request.getAmount());
        }else if(successor != null){
            successor.processRequest(request);
        }
    }
}
