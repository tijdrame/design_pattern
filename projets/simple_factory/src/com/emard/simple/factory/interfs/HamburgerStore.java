package com.emard.simple.factory.interfs;

import com.emard.simple.factory.pojos.Hamburger;

public class HamburgerStore {
    private SimpleburgerFactory factory;
    public HamburgerStore(SimpleburgerFactory factory){
        this.factory = factory;
    }
    public Hamburger orderHamburger(String type){
        Hamburger burger = factory.createHamburger(type);
        burger.prepare();
        burger.cook();
        burger.box();
        return burger;
    }
}
