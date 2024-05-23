package com.emard.template.models;

public class FootballGame extends Game{
    @Override
    void initialize() {
        System.out.println("Football Game initializing...");
    }

    @Override
    void startPlay() {
        System.out.println("Football Game starting...");
    }

    @Override
    void endPlay() {
        System.out.println("Football Game ending.");
    }

    @Override
    protected void addNewCharacterToThegame() {

    }
}
