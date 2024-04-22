package com.buildappswithpaulo.com.model;

import com.buildappswithpaulo.com.interfaces.IceCream;

public class BasicIceCream implements IceCream {
    @Override
    public IceCream getDecorated() {
        return this;
    }
    public BasicIceCream() {
        System.out.println("Creating a basic Ice-Cream");
    }
    @Override
    public double cost() {
        return 0.50;
    }



}
