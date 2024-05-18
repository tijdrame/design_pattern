package com.emard.factory;


import com.emard.factory.model.Hamburger;

public abstract class HamburgerStore {
    public Hamburger orderHamburger(String type){
        Hamburger burger = createHamburger(type);
        burger.prepare();
        burger.cook();
        burger.box();
        return burger;
    }
    public abstract Hamburger createHamburger(String type);
}
