package com.emard.mediator;

import com.emard.mediator.interf.ATCMediator;
import com.emard.mediator.interf.AirCraft;
import com.emard.mediator.models.ATCMediatorImpl;
import com.emard.mediator.models.AirCraftImpl;

public class TestMediator {
    public static void main(String[] args) {
        ATCMediator mediator = new ATCMediatorImpl();
        AirCraft boing1 = new AirCraftImpl(mediator, "Boing 1");
        AirCraft helicopter = new AirCraftImpl(mediator, "Helicopter");
        AirCraft boing707 = new AirCraftImpl(mediator, "Boing 707");

        mediator.addAircraft(boing1);
        mediator.addAircraft(helicopter);
        mediator.addAircraft(boing707);
        boing1.send("hello from Boing 01");
    }
}
