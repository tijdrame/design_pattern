package com.emard.factory.model;

public class MozambicanCheeseBurger implements Hamburger {
    @Override
    public void prepare() {
        System.out.println("Prepare MozambicanCheeseBurger");
    }

    @Override
    public void cook() {
        System.out.println("cook MozambicanCheeseBurger");
    }

    @Override
    public void box() {
        System.out.println("box MozambicanCheeseBurger");
    }
}