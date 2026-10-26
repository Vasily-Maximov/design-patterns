package org.example.command.model;

public class Light {

    private String name;

    public Light(String name) {
        this.name = name;
    }

    public void on() {
        System.out.printf("%s light is on\n", name);
    }

    public void off() {
        System.out.printf("%s light is off\n", name);
    }

}