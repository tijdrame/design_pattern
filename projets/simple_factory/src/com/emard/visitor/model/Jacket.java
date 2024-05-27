package com.emard.visitor.model;

import com.emard.visitor.interf.Visitable;
import com.emard.visitor.interf.Visitor;

public class Jacket implements Visitable {
    private Double price;
    public Jacket(Double price) {
        this.price = price;
    }
    public Double getPrice() {
        return price;
    }
    @Override
    public Double accept(Visitor visitor) {
        return visitor.visitor(this);
    }
}
