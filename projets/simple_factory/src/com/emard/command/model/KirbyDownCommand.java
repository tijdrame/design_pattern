package com.emard.command.model;

import com.emard.command.intefaces.Command;

public class KirbyDownCommand implements Command {
    private KirbyCharacterReceiver kirbyCharacter;

    public KirbyDownCommand(KirbyCharacterReceiver kirbyCharacter) {
        this.kirbyCharacter = kirbyCharacter;
    }

    @Override
    public void execute() {
        kirbyCharacter.moveDown();
    }
}
