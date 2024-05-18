package com.emard.factory.model;

public class JamaincanVeggieBurger extends Hamburger {
    @Override
    public void prepare() {
        System.out.println("Prepare JamaincanVeggieBurger");
    }

    @Override
    public void cook() {
        System.out.println("cook JamaincanVeggieBurger");
    }

    @Override
    public void box() {
        System.out.println("box JamaincanVeggieBurger");
    }
}
