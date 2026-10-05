package org.example.decorator.model;

public abstract class Beverage {

    protected String description;
    protected double price;

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}