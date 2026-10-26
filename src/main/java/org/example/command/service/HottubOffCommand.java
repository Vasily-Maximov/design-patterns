package org.example.command.service;

import org.example.command.model.Hottub;

public class HottubOffCommand implements Command {

    private final Hottub hottub;

    public HottubOffCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    @Override
    public void execute() {
        hottub.off();
    }

    @Override
    public void undo() {
        hottub.on();
    }
}