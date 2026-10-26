package org.example.command.service;

public interface Command {

    void execute();

    void undo();
}