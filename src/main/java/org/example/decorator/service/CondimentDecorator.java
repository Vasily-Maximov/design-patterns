package org.example.decorator.service;

import org.example.decorator.model.Beverage;

public abstract class CondimentDecorator extends Beverage {

    protected final Beverage beverage;
    protected double price;

    protected CondimentDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    public abstract String getDescription();
}