package com.emard.chainresponsibility.models;

import com.emard.chainresponsibility.interf.PurchasePower;

public class DirectorPurchasePower extends PurchasePower {
    @Override
    protected double getAllowable() {
        return BASE * 20;
    }

    @Override
    protected String getRole() {
        return "Director";
    }
}
