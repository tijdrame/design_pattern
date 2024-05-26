package com.emard.mediator.interf;

public interface ATCMediator {
    void sendMessage(String msg, AirCraft airCraft);
    void addAircraft(AirCraft airCraft);
}
