package com.emard.factory.model;

public class JamaincanGreekBurger implements Hamburger {
    @Override
    public void prepare() {
        System.out.println("Prepare JamaincanGreekBurger");
    }

    @Override
    public void cook() {
        System.out.println("cook JamaincanGreekBurger");
    }

    @Override
    public void box() {
        System.out.println("box JamaincanGreekBurger");
    }
}