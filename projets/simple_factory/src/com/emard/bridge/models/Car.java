package com.emard.bridge.models;

import com.emard.bridge.interf.Vehicle;
import com.emard.bridge.interf.WorkShop;

public class Car extends Vehicle {
    public Car(WorkShop workShop,
               WorkShop workShop2) {
        super(workShop, workShop2);
    }
    @Override
    public void manufacture() {
        System.out.println("Car...");
        workShop.make();
        workShop2.make();
    }
}
