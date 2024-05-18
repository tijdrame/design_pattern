package com.emard.factory.store;

import com.emard.factory.HamburgerStore;
import com.emard.factory.model.Hamburger;
import com.emard.factory.model.JamaincanCheeseBurger;
import com.emard.factory.model.JamaincanGreekBurger;
import com.emard.factory.model.JamaincanVeggieBurger;
import com.emard.factory.model.MozambicanCheeseBurger;
import com.emard.factory.model.MozambicanGreekBurger;
import com.emard.factory.model.MozambicanVeggieBurger;

public class MozHamburgerStore extends HamburgerStore {
    @Override
    public Hamburger createHamburger(String type) {
        if(type.equals("cheese")){
            return new MozambicanCheeseBurger();
        } else if (type.equals("greek")) {
            return new MozambicanGreekBurger();
        }else if (type.equals("veggie")) {
            return new MozambicanVeggieBurger();
        }
        return null;
    }
}
