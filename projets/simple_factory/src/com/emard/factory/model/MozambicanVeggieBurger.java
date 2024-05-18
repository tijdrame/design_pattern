package com.emard.factory.model;

public class MozambicanVeggieBurger extends Hamburger {
    @Override
    public void prepare() {
        System.out.println("Prepare MozambicanVeggieBurger");
    }

    @Override
    public void cook() {
        System.out.println("cook MozambicanVeggieBurger");
    }

    @Override
    public void box() {
        System.out.println("box MozambicanVeggieBurger");
    }
}