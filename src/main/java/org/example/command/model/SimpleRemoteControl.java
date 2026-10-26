package org.example.command.model;

import org.example.command.service.Command;
import org.example.command.service.NoCommand;

public class SimpleRemoteControl {

    private final Command[] onCommands;
    private final Command[] offCommands;
    private Command undoCommand;
    private final int size = 7;

    public SimpleRemoteControl() {
        onCommands = new Command[size];
        offCommands = new Command[size];
        undoCommand = new NoCommand();
        initCommands();
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonWasPushed() {
        undoCommand.undo();
    }

    @Override
    public String toString() {
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n------ Remote Control -------\n");
        for (int i = 0; i < size; i++) {
            if (onCommands[i] != null && offCommands[i] != null) {
                stringBuff.append("[slot " + i + "] " + String.format("%-30s",onCommands[i].getClass().getSimpleName())
                        + offCommands[i].getClass().getSimpleName() + "\n");
            }
        }
        stringBuff.append(String.format("[undo] %s\n",undoCommand.getClass().getSimpleName()));
        return stringBuff.toString();
    }

    private void initCommands() {
        Command noCommand = new NoCommand();
        for (int i = 0; i < size; i++ ) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }
}