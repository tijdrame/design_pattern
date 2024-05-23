package com.emard.iterators.models;

import com.emard.iterators.interf.Iterator;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class DevStoreIterator implements Iterator {
    Product[] catalog;
    int position = 0;
    int nb = 0;
    public DevStoreIterator() {
        this.catalog = new Product[4];
        addItem("C++ is not dead", "T-shirt", 39.99);
        addItem("Java rocks. Yes", "Silky mouse-pad", 19.99);
        addItem("Java Design Pattern", "Book - a must!", 139.99);
        addItem("Web Developpement Cookbook", "The Best developement cookbok - 2018", 129.99);
    }
    @Override
    public boolean hasNext() {
        if(position >= catalog.length || catalog[position]==null){
            return false;
        }else
            return true;
    }
    @Override
    public Object next() {
        Product product = catalog[position];
        position += 1;
        return product;
    }
    public void addItem(String name, String description, double price){
        Product product = new Product(name, description, price);
        catalog[nb] = product;
        nb += 1;
    }
}
