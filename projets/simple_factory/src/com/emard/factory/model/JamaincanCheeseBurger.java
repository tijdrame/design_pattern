package com.emard.factory.model;


public class JamaincanCheeseBurger extends Hamburger {
    @Override
    public void prepare() {
        System.out.println("Prepare JamaincanCheeseBurger");
    }

    @Override
    public void cook() {
        System.out.println("cook JamaincanCheeseBurger");
    }

    @Override
    public void box() {
        System.out.println("box JamaincanCheeseBurger");
    }
}