package org.example.factory.service;

import org.example.factory.model.Pizza;
import org.example.factory.model.CheesePizza;
import org.example.factory.model.ClamPizza;
import org.example.factory.model.PepperoniPizza;
import org.example.factory.model.VeggiePizza;

public class NYPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String item) {
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        switch (item) {
            case "cheese":
                return new CheesePizza(ingredientFactory, "New York Style Cheese Pizza");
            case "pepperoni":
                return new PepperoniPizza(ingredientFactory, "New York Style Pepperoni Pizza");
            case "clam":
                return new ClamPizza(ingredientFactory, "New York Style Clam Pizza");
            case "veggie":
                return new VeggiePizza(ingredientFactory, "New York Style Veggie Pizza");
            default:
                return null;
        }
    }
}