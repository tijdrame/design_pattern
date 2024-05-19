package com.emard.command.model;

import com.emard.command.intefaces.Command;

public class GameBoy {
    private Command upComand;
    private Command downComand;
    private Command leftComand;
    private Command rightComand;

    public GameBoy(Command upComand, Command downComand,
                   Command leftComand, Command rightComand) {
        this.upComand = upComand;
        this.downComand = downComand;
        this.leftComand = leftComand;
        this.rightComand = rightComand;
    }
    public void arrowUp(){
        upComand.execute();
    }
    public void arrowDown(){
        downComand.execute();
    }
    public void arrowRight(){
        rightComand.execute();
    }
    public void arrowLeft(){
        leftComand.execute();
    }
}
