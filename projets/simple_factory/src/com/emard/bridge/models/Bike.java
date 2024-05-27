package com.emard.bridge.models;

import com.emard.bridge.interf.Vehicle;
import com.emard.bridge.interf.WorkShop;

public class Bike extends Vehicle {
    public Bike(WorkShop workShop,
                WorkShop workShop2) {
        super(workShop, workShop2);
    }
    @Override
    public void manufacture() {
        System.out.println("Bike...");
        workShop.make();
        workShop2.make();
    }
}
