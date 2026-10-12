package org.example.factory.service;

import org.example.factory.ingredient.*;
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