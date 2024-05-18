package com.emard.factory.store;

import com.emard.factory.HamburgerStore;
import com.emard.factory.model.Hamburger;
import com.emard.factory.model.JamaincanCheeseBurger;
import com.emard.factory.model.JamaincanGreekBurger;
import com.emard.factory.model.JamaincanVeggieBurger;

public class JamHamburgerStore extends HamburgerStore {
    @Override
    public Hamburger createHamburger(String type) {
        if(type.equals("cheese")){
            return new JamaincanCheeseBurger();
        } else if (type.equals("greek")) {
            return new JamaincanGreekBurger();
        }else if (type.equals("veggie")) {
            return new JamaincanVeggieBurger();
        }
        return null;
    }
}
