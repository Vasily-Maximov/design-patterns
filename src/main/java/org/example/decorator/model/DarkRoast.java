package org.example.decorator.model;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        this.description = "Dark Roast";
        price = 0.99;
    }

    @Override
    public double cost() {
        return price;
    }
}