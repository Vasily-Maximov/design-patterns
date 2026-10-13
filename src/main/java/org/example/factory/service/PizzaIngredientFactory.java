package org.example.factory.service;

import org.example.factory.ingredient.Dough;
import org.example.factory.ingredient.Sauce;
import org.example.factory.ingredient.Cheese;
import org.example.factory.ingredient.Clams;
import org.example.factory.ingredient.Pepperoni;
import org.example.factory.veggies.Veggies;

public interface PizzaIngredientFactory {

    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Veggies[] createVeggies();
    Pepperoni createPepperoni();
    Clams createClam();
}