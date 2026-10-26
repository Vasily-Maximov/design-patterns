package org.example.command.service;

import org.example.command.model.TV;

public class TVOffCommand implements Command {

    private final TV tv;

    public TVOffCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.off();
    }

    @Override
    public void undo() {
        tv.on();
    }
}
