package com.emard.mediator.models;

import com.emard.mediator.interf.ATCMediator;
import com.emard.mediator.interf.AirCraft;

public class AirCraftImpl extends AirCraft {
    public AirCraftImpl(ATCMediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void send(String msg) {
        System.out.println(name+ " : Sending message= "+msg);
        mediator.sendMessage(msg, this);
    }

    @Override
    public void receive(String msg) {
        System.out.println(name+ " : Received message= "+msg);
    }
}
