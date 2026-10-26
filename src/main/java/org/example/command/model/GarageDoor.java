package org.example.command.model;

public class GarageDoor {

    private String name;

    public GarageDoor(String name) {
        this.name = name;
    }

    public void up() {
        System.out.printf("%s Garage Door is Open\n", name);
    }

    public void down() {
        System.out.printf("%s Garage Door is Close\n", name);
    }
}