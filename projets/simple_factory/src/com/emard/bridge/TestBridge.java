package com.emard.bridge;

import com.emard.bridge.interf.Vehicle;
import com.emard.bridge.models.Assemble;
import com.emard.bridge.models.Bike;
import com.emard.bridge.models.Car;
import com.emard.bridge.models.Make;

public class TestBridge {
    public static void main(String[] args) {
        Vehicle bmw = new Car(new Make(), new Assemble());
        bmw.manufacture();
        Vehicle bmx = new Bike(new Make(), new Assemble());
        bmx.manufacture();
    }
}
