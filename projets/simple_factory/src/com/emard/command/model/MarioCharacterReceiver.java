package com.emard.command.model;

import java.util.logging.Logger;

public class MarioCharacterReceiver {
    private static Logger log = Logger.getLogger(MarioCharacterReceiver.class.getName());
    private String name;
    public void moveUp(){
        log.info(name+" jumping up!");
    }
    public void moveLeft(){

        log.info(name+" movng left!");
    }
    public void moveRight(){
        log.info(name+" movng right!");
    }
    public void moveDown(){
        log.info(name+" movng down!");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
