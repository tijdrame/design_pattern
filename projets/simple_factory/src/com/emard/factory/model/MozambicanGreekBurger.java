package com.emard.factory.model;

public class MozambicanGreekBurger implements Hamburger {
    @Override
    public void prepare() {
        System.out.println("Prepare MozambicanGreekBurger");
    }

    @Override
    public void cook() {
        System.out.println("cook MozambicanGreekBurger");
    }

    @Override
    public void box() {
        System.out.println("box MozambicanGreekBurger");
    }
}