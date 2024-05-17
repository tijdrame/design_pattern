package com.emard.simple.factory.pojos;

public class VeggieBurger extends Hamburger{
    @Override
    public void prepare() {
        System.out.println("Prepare VeggieBurger");
    }

    @Override
    public void cook() {
        System.out.println("cook VeggieBurger");
    }

    @Override
    public void box() {
        System.out.println("box VeggieBurger");
    }
}