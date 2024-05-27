package com.emard.chainresponsibility.models;

import com.emard.chainresponsibility.interf.PurchasePower;

public class ManagerPurchasePower extends PurchasePower {
    @Override
    protected double getAllowable() {
        return BASE * 10;
    }

    @Override
    protected String getRole() {
        return "Manager";
    }
}
