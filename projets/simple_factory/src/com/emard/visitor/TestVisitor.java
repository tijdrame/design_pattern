package com.emard.visitor;

import com.emard.visitor.model.Jacket;
import com.emard.visitor.model.Shirt;
import com.emard.visitor.model.TShirt;
import com.emard.visitor.model.TaxVisitor;

public class TestVisitor {
    public static void main(String[] args) {
        TaxVisitor taxVisitor = new TaxVisitor();
        Jacket jacket = new Jacket(45.99);
        TShirt tShirt =  new TShirt(24.99);
        Shirt shirt = new Shirt(22.89);
        System.out.println(jacket.accept(taxVisitor));
        System.out.println(tShirt.accept(taxVisitor));
        System.out.println(shirt.accept(taxVisitor));
    }
}
