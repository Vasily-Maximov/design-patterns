package org.example.command.model;

public class CeilingFan {

    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    private int speed;
    private String name;

    public CeilingFan(String name) {
        this.name = name;
        this.speed = OFF;
    }

    public void off() {
        speed = OFF;
        System.out.printf("%s ceiling fan is off\n", name);
    }

    public void high() {
        speed = HIGH;
        System.out.printf("%s ceiling fan is on speed: %d\n", name, speed);
    }

    public void medium() {
        speed = MEDIUM;
        System.out.printf("%s ceiling fan is on speed: %d\n", name, speed);
    }

    public void low() {
        speed = LOW;
        System.out.printf("%s ceiling fan is on speed: %d\n", name, speed);
    }

    public int getSpeed() {
        return speed;
    }
}