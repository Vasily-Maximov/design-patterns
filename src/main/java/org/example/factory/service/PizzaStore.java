package org.example.factory.service;

import org.example.factory.model.Pizza;

public abstract class PizzaStore {

    public Pizza orderPizza(String item) {

        Pizza pizza = createPizza(item);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    public abstract Pizza createPizza(String item);
}