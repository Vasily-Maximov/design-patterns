package org.example.command.service;

import org.example.command.model.TV;

public class TVOnCommand implements Command {

    private final TV tv;

    public TVOnCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.on();
    }

    @Override
    public void undo() {
        tv.off();
    }
}