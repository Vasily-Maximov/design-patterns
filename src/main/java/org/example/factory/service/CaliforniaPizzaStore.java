package org.example.factory.service;

import org.example.factory.model.Pizza;
import org.example.factory.model.CheesePizza;
import org.example.factory.model.ClamPizza;
import org.example.factory.model.PepperoniPizza;
import org.example.factory.model.VeggiePizza;

public class CaliforniaPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String item) {
        PizzaIngredientFactory ingredientFactory = new CaliforniaPizzaIngredientFactory();
        switch (item) {
            case "cheese":
                return new CheesePizza(ingredientFactory, "California Style Cheese Pizza");
            case "pepperoni":
                return new PepperoniPizza(ingredientFactory, "California Style Pepperoni Pizza");
            case "clam":
                return new ClamPizza(ingredientFactory, "California Style Clam Pizza");
            case "veggie":
                return new VeggiePizza(ingredientFactory, "California Style Veggie Pizza");
            default:
                return null;
        }
    }
}