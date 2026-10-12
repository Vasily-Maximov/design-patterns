package org.example.factory.service;

import org.example.factory.model.newyork.NYCheesePizza;
import org.example.factory.model.newyork.NYClamPizza;
import org.example.factory.model.newyork.NYPepperoniPizza;
import org.example.factory.model.newyork.NYVeggiePizza;
import org.example.factory.model.Pizza;

public class NYPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String item) {
        switch (item) {
            case "cheese":
                return new NYCheesePizza();
            case "pepperoni":
                return new NYPepperoniPizza();
            case "clam":
                return new NYClamPizza();
            case "veggie":
                return new NYVeggiePizza();
            default:
                return null;
        }
    }
}