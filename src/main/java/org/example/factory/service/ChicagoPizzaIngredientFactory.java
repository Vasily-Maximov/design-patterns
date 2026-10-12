package org.example.factory.service;

import org.example.factory.ingredient.Dough;
import org.example.factory.ingredient.Sauce;
import org.example.factory.ingredient.Cheese;
import org.example.factory.ingredient.Pepperoni;
import org.example.factory.ingredient.Clams;
import org.example.factory.ingredient.ThickCrustDough;
import org.example.factory.ingredient.PlumTomatoSauce;
import org.example.factory.ingredient.MozzarellaCheese;
import org.example.factory.ingredient.SlicedPepperoni;
import org.example.factory.ingredient.FrozenClams;
import org.example.factory.veggies.BlackOlives;
import org.example.factory.veggies.EggPlant;
import org.example.factory.veggies.Spinach;
import org.example.factory.veggies.Veggies;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{new BlackOlives(), new Spinach(), new EggPlant()};
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FrozenClams();
    }
}