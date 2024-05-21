package com.emard.adapter;

import com.emard.adapter.interfaces.SocketAdapter;
import com.emard.adapter.model.SocketAdapterImpl;
import com.emard.adapter.model.SocketObjectAdapterImpl;
import com.emard.adapter.model.Volt;

public class TestAdapter {
    public static void main(String[] args) {
        testingObjectAdapter();
        //testingClassAdapter();
    }
    private static void testingClassAdapter(){
        SocketAdapter socketAdapter = new SocketAdapterImpl();
        Volt v1 = getVolt(socketAdapter, 1);
        Volt v3 = getVolt(socketAdapter, 3);
        Volt v12 = getVolt(socketAdapter, 12);
        Volt v120 = getVolt(socketAdapter, 120);
        System.out.println("V1 volts is using Object Adapter"+v1.getVolts());
        System.out.println("V3 volts is using Object Adapter"+v3.getVolts());
        System.out.println("V12 volts is using Object Adapter"+v12.getVolts());
        System.out.println("V120 volts is using Object Adapter"+v120.getVolts());
    }

    private static void testingObjectAdapter(){
        SocketAdapter socketAdapter = new SocketObjectAdapterImpl();
        Volt v1 = getVolt(socketAdapter, 1);
        Volt v3 = getVolt(socketAdapter, 3);
        Volt v12 = getVolt(socketAdapter, 12);
        Volt v120 = getVolt(socketAdapter, 120);
        System.out.println("V1 volts is using Object Adapter"+v1.getVolts());
        System.out.println("V3 volts is using Object Adapter"+v3.getVolts());
        System.out.println("V12 volts is using Object Adapter"+v12.getVolts());
        System.out.println("V120 volts is using Object Adapter"+v120.getVolts());
    }

    private static Volt getVolt(SocketAdapter socketAdapter, int i){
        switch (i){
            case 1: return socketAdapter.get1Volts();
            case 3: return socketAdapter.get3Volts();
            case 12: return socketAdapter.get12Volts();
            case 120: return socketAdapter.get120Volts();
            default: return socketAdapter.get120Volts();
        }
    }
}
