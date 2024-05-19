package com.emard.command.model;

import com.emard.command.intefaces.Command;

public class MarioRightCommand implements Command {
    private MarioCharacterReceiver marioCharacter;

    public MarioRightCommand(MarioCharacterReceiver marioCharacter) {
        this.marioCharacter = marioCharacter;
    }

    @Override
    public void execute() {
        marioCharacter.moveRight();
    }
}
