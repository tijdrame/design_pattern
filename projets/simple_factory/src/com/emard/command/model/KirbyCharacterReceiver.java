package com.emard.command.model;

public class KirbyCharacterReceiver {
    private String name;
    public void moveUp(){
        System.out.println(name+" jumping up!");
    }
    public void moveLeft(){
        System.out.println(name+" movng left!");
    }
    public void moveRight(){
        System.out.println(name+" movng right!");
    }
    public void moveDown(){
        System.out.println(name+" movng down!");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
