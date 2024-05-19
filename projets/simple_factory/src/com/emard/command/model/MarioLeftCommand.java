package com.emard.command.model;

import com.emard.command.intefaces.Command;

public class MarioLeftCommand implements Command {
    private MarioCharacterReceiver marioCharacter;

    public MarioLeftCommand(MarioCharacterReceiver marioCharacter) {
        this.marioCharacter = marioCharacter;
    }

    @Override
    public void execute() {
        marioCharacter.moveLeft();
    }
}
