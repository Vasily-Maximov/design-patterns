package org.example.factory.service;

import org.example.factory.model.Pizza;
import org.example.factory.model.california.CaliforniaCheesePizza;
import org.example.factory.model.california.CaliforniaClamPizza;
import org.example.factory.model.california.CaliforniaPepperoniPizza;
import org.example.factory.model.california.CaliforniaVeggiePizza;

public class CaliforniaPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String item) {
        switch (item) {
            case "cheese":
                return new CaliforniaCheesePizza();
            case "pepperoni":
                return new CaliforniaPepperoniPizza();
            case "clam":
                return new CaliforniaClamPizza();
            case "veggie":
                return new CaliforniaVeggiePizza();
            default:
                return null;
        }
    }
}