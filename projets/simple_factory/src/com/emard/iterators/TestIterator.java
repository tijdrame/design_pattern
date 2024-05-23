package com.emard.iterators;

import com.emard.iterators.interf.Iterator;
import com.emard.iterators.models.GeekyStoreIterator;
import com.emard.iterators.models.Product;


public class TestIterator {

    public static void main(String[] args) {
        Iterator obj = new GeekyStoreIterator();
        while (obj.hasNext()){
            Product product = (Product) obj.next();
            System.out.println(product);
        }
    }
}
