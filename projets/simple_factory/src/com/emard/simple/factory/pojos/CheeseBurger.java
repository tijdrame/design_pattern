package com.emard.simple.factory.pojos;

public class CheeseBurger extends Hamburger{
    @Override
    public void prepare() {
        System.out.println("Prepare CheeseBurger");
    }

    @Override
    public void cook() {
        System.out.println("cook CheeseBurger");
    }

    @Override
    public void box() {
        System.out.println("box CheeseBurger");
    }
}
