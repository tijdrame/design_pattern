package com.emard.simple.factory.interfs;

import com.emard.simple.factory.pojos.CheeseBurger;
import com.emard.simple.factory.pojos.GreekBurger;
import com.emard.simple.factory.pojos.Hamburger;
import com.emard.simple.factory.pojos.VeggieBurger;

public class SimpleburgerFactory {
    public Hamburger createHamburger(String type){
        if(type.equals("cheese")){
            return new CheeseBurger();
        } else if (type.equals("greek")) {
            return new GreekBurger();
        }else if (type.equals("veggie")) {
            return new VeggieBurger();
        }
        return null;
    }
}
