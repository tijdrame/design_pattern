package com.emard.mediator.models;

import com.emard.mediator.interf.ATCMediator;
import com.emard.mediator.interf.AirCraft;

import java.util.ArrayList;
import java.util.List;

public class ATCMediatorImpl implements ATCMediator {
    private List<AirCraft> airCraftList;

    public ATCMediatorImpl() {
        this.airCraftList = new ArrayList<>();
    }
    @Override
    public void sendMessage(String msg, AirCraft airCraft) {
        for (AirCraft a : airCraftList) {
            //ne pas envoyer le msg a l'emetteur
            if(a != airCraft){
                a.receive(msg);
            }
        }
    }
    @Override
    public void addAircraft(AirCraft airCraft) {
        airCraftList.add(airCraft);
    }
}
