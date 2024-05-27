package com.emard.bridge.models;

import com.emard.bridge.interf.WorkShop;

public class Make implements WorkShop {
    @Override
    public void make() {
        System.out.println("Making..");
    }
}
