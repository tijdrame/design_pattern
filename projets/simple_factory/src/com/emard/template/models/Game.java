package com.emard.template.models;

public abstract class Game {


    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    public final void play(){
        loadAssets();
        initialize();
        startPlay();
        if(addNewCharacter()){
            addNewCharacterToThegame();
        }
        endPlay();
    }
    //Hooked on Template Method
    protected abstract void addNewCharacterToThegame();

    public final void loadAssets(){
        System.out.println("Loading Game Assets!");
    }
    boolean addNewCharacter(){
        return true;
    }
}
