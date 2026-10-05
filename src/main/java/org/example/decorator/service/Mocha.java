package org.example.decorator.service;

import org.example.decorator.model.Beverage;

public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        super(beverage);
        price = 0.2;
    }

    @Override
    public double cost() {
        return beverage.cost() + price;
    }

    @Override
    public String getDescription() {
        return String.format("%s, Mocha", beverage.getDescription());
    }
}