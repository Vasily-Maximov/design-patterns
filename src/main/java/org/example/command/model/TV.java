package org.example.command.model;

public class TV {

    private String name;

    public TV(String name) {
        this.name = name;
    }

    public void on() {
        System.out.printf("%s TV is on\n", name);
    }

    public void off() {
        System.out.printf("%s TV is off\n", name);
    }
}