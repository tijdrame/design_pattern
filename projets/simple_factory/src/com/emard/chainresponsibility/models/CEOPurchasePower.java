package com.emard.chainresponsibility.models;

import com.emard.chainresponsibility.interf.PurchasePower;

public class CEOPurchasePower extends PurchasePower {
    @Override
    protected double getAllowable() {
        return BASE * 1000000;
    }

    @Override
    protected String getRole() {
        return "CEO";
    }
}
