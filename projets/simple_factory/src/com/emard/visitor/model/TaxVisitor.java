package com.emard.visitor.model;

import com.emard.visitor.interf.Visitor;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class TaxVisitor implements Visitor {
    DecimalFormat df = new DecimalFormat("#0.00", DecimalFormatSymbols.getInstance(Locale.US));
    @Override
    public Double visitor(Shirt shirtItem) {
        System.out.println("Shirt final price with tax:");
        return Double.valueOf(df.format(shirtItem.getPrice()*.10+
                shirtItem.getPrice()));
    }
    @Override
    public Double visitor(TShirt tshirtItem) {
        System.out.println("TShirt final price with tax:");
        return Double.valueOf(df.format(tshirtItem.getPrice()*.18+
                tshirtItem.getPrice()));
    }
    @Override
    public Double visitor(Jacket jacketItem) {
        System.out.println("Jacket final price with tax:");
        return Double.valueOf(df.format(jacketItem.getPrice()*.20+
                jacketItem.getPrice()));
    }
}
