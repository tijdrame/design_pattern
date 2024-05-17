package com.emard.simple.factory;

import com.emard.simple.factory.interfs.HamburgerStore;
import com.emard.simple.factory.interfs.SimpleburgerFactory;

public class TestSimpleFactory {
    public static void main(String[] args) {
        SimpleburgerFactory factory = new SimpleburgerFactory();
        HamburgerStore store = new HamburgerStore(factory);
        store.orderHamburger("cheese");
    }
}
