package com.emard.factory.model;

public class MozambicanGreekBurger extends Hamburger {
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