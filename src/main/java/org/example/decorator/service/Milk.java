package org.example.decorator.service;

import org.example.decorator.model.Beverage;

public class Milk extends CondimentDecorator {

    public Milk(Beverage beverage) {
        super(beverage);
        price = 0.1;
    }

    @Override
    public double cost() {
        return beverage.cost() + price;
    }

    @Override
    public String getDescription() {
        return String.format("%s, Milk", beverage.getDescription());
    }
}