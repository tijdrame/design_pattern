package com.emard.bridge.models;

import com.emard.bridge.interf.WorkShop;

public class Assemble implements WorkShop {
    @Override
    public void make() {
        System.out.println("...also");
        System.out.println("Assembled");
    }
}
