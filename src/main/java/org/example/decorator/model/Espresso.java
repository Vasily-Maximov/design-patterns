package org.example.decorator.model;

public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
        price = 1.99;
    }

    @Override
    public double cost() {
        return price;
    }
}