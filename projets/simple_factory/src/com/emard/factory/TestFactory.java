package com.emard.factory;

import com.emard.factory.model.Hamburger;
import com.emard.factory.store.JamHamburgerStore;
import com.emard.factory.store.MozHamburgerStore;

public class TestFactory {
    public static void main(String[] args) {
        HamburgerStore mozambicanStore = new MozHamburgerStore();
        HamburgerStore jamaicanStore = new JamHamburgerStore();

        Hamburger mozVeegie = mozambicanStore.orderHamburger("veggie");
        Hamburger jamBurger = jamaicanStore.orderHamburger("cheese");
        System.out.println(mozVeegie);
        System.out.println(jamBurger);
    }
}
