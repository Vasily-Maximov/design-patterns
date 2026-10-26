package org.example.command.service;

import org.example.command.model.Hottub;

public class HottubOnCommand implements Command {

    private final Hottub hottub;

    public HottubOnCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    @Override
    public void execute() {
        hottub.on();
    }

    @Override
    public void undo() {
        hottub.off();
    }
}