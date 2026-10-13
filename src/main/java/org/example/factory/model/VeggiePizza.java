package org.example.factory.model;

import org.example.factory.service.PizzaIngredientFactory;

public class VeggiePizza extends Pizza {

    private final PizzaIngredientFactory ingredientFactory;

    public VeggiePizza(PizzaIngredientFactory ingredientFactory, String name) {
        this.ingredientFactory = ingredientFactory;
        this.name = name;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        veggies = ingredientFactory.createVeggies();
    }
}