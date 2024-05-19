package com.emard.command;

import com.emard.command.model.GameBoy;
import com.emard.command.model.KirbyCharacterReceiver;
import com.emard.command.model.MarioCharacterReceiver;
import com.emard.command.model.MarioDownCommand;
import com.emard.command.model.MarioLeftCommand;
import com.emard.command.model.MarioRightCommand;
import com.emard.command.model.MarioUpCommand;

public class TestCommand {
    public static void main(String[] args) {
        MarioCharacterReceiver mario = new MarioCharacterReceiver();
        mario.setName("Mario");
        KirbyCharacterReceiver kirby = new KirbyCharacterReceiver();
        kirby.setName("Kirby");

        MarioUpCommand marioUpCommand = new MarioUpCommand(mario);
        MarioDownCommand marioDownCommand = new MarioDownCommand(mario);
        MarioLeftCommand marioLeftCommand= new MarioLeftCommand(mario);
        MarioRightCommand marioRightCommand = new MarioRightCommand(mario);

        GameBoy gameBoy = new GameBoy(marioUpCommand, marioDownCommand,
                marioLeftCommand, marioRightCommand);
        gameBoy.arrowUp();
        gameBoy.arrowDown();
        gameBoy.arrowRight();
        gameBoy.arrowLeft();

    }
}
