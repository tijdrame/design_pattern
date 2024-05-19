package com.emard.command.model;

import com.emard.command.intefaces.Command;

public class MarioDownCommand implements Command {
    private MarioCharacterReceiver marioCharacter;

    public MarioDownCommand(MarioCharacterReceiver marioCharacter) {
        this.marioCharacter = marioCharacter;
    }

    @Override
    public void execute() {
        marioCharacter.moveDown();
    }
}
