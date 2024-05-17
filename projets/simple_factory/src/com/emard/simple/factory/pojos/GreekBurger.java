package com.emard.simple.factory.pojos;

public class GreekBurger extends Hamburger{
    @Override
    public void prepare() {
        System.out.println("Prepare GreekBurger");
    }

    @Override
    public void cook() {
        System.out.println("cook GreekBurger");
    }

    @Override
    public void box() {
        System.out.println("box GreekBurger");
    }
}