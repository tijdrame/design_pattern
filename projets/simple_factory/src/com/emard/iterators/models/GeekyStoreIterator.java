package com.emard.iterators.models;

import com.emard.iterators.interf.Iterator;

import java.util.ArrayList;
import java.util.List;

public class GeekyStoreIterator implements Iterator {
    List<Product> catalog;
    int position = 0;
    public GeekyStoreIterator() {
        this.catalog = new ArrayList<>();
        addItem("Superman Comic", "The best in town", 12.99);
        addItem("Batman Comic", "Okay, but still good", 11.99);
        addItem("Star Wars", "Can't live without it", 39.99);
        addItem("Jedi T-Shirt", "Gotta have it", 29.99);
    }
    @Override
    public boolean hasNext() {
        if(position >= catalog.size() || catalog.get(position)==null){
            return false;
        }else
            return true;
    }
    @Override
    public Object next() {
        Product product = catalog.get(position);
        position += 1;
        return product;
    }
    public void addItem(String name, String description, double price){
        Product product = new Product(name, description, price);
        catalog.add(product);
    }
}
