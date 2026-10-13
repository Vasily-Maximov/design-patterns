package org.example.factory.service;

import org.example.factory.model.Pizza;
import org.example.factory.model.CheesePizza;
import org.example.factory.model.ClamPizza;
import org.example.factory.model.PepperoniPizza;
import org.example.factory.model.VeggiePizza;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String item) {
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();
        switch (item) {
            case "cheese":
                return new CheesePizza(ingredientFactory, "Chicago Style Cheese Pizza");
            case "pepperoni":
                return new PepperoniPizza(ingredientFactory, "Chicago Style Pepperoni Pizza");
            case "clam":
                return new ClamPizza(ingredientFactory, "Chicago Style Clam Pizza");
            case "veggie":
                return new VeggiePizza(ingredientFactory, "Chicago Style Veggie Pizza");
            default:
                return null;
        }
    }
}