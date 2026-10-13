package org.example.factory.service;

import org.example.factory.ingredient.Dough;
import org.example.factory.ingredient.Sauce;
import org.example.factory.ingredient.Cheese;
import org.example.factory.ingredient.Pepperoni;
import org.example.factory.ingredient.Clams;
import org.example.factory.ingredient.ReggianoCheese;
import org.example.factory.ingredient.MarinaraSauce;
import org.example.factory.ingredient.ThinCrustDough;
import org.example.factory.ingredient.SlicedPepperoni;
import org.example.factory.ingredient.FreshClams;
import org.example.factory.veggies.Mushroom;
import org.example.factory.veggies.Onion;
import org.example.factory.veggies.Garlic;
import org.example.factory.veggies.Veggies;
import org.example.factory.veggies.RedPepper;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{ new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }
}