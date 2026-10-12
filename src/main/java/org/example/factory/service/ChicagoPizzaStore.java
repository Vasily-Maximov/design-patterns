package org.example.factory.service;

import org.example.factory.model.*;
import org.example.factory.model.chicago.ChicagoCheesePizza;
import org.example.factory.model.chicago.ChicagoClamPizza;
import org.example.factory.model.chicago.ChicagoPepperoniPizza;
import org.example.factory.model.chicago.ChicagoVeggiePizza;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String item) {
        switch (item) {
            case "cheese":
                return new ChicagoCheesePizza();
            case "pepperoni":
                return new ChicagoPepperoniPizza();
            case "clam":
                return new ChicagoClamPizza();
            case "veggie":
                return new ChicagoVeggiePizza();
            default:
                return null;
        }
    }
}