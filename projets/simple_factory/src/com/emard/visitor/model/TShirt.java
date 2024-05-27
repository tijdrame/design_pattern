package com.emard.visitor.model;

import com.emard.visitor.interf.Visitable;
import com.emard.visitor.interf.Visitor;

public class TShirt implements Visitable {
    private Double price;

    public TShirt(Double price) {
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
