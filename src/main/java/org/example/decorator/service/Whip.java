package org.example.decorator.service;

import org.example.decorator.model.Beverage;

public class Whip extends CondimentDecorator {


    public Whip(Beverage beverage) {
        super(beverage);
        price = 0.1;
    }

    @Override
    public double cost() {
        return beverage.cost() + price;
    }

    @Override
    public String getDescription() {
        return String.format("%s, Whip", beverage.getDescription());
    }
}