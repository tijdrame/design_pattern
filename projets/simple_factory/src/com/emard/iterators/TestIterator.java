package com.emard.iterators;

import com.emard.iterators.models.DevStoreIterator;
import com.emard.iterators.models.GeekyStoreIterator;
import com.emard.iterators.models.Product;

import java.util.Iterator;


public class TestIterator {

    public static void main(String[] args) {
        Iterator obj = new GeekyStoreIterator();
        while (obj.hasNext()){
            Product product = (Product) obj.next();
            System.out.println(product);
        }
        obj = new DevStoreIterator();
        while (obj.hasNext()){
            Product product = (Product) obj.next();
            System.out.println(product);
        }
    }
}
