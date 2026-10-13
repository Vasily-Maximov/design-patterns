package org.example.factory.service;

import org.example.factory.ingredient.Dough;
import org.example.factory.ingredient.Sauce;
import org.example.factory.ingredient.Cheese;
import org.example.factory.ingredient.Pepperoni;
import org.example.factory.ingredient.Clams;
import org.example.factory.ingredient.VeryThinDough;
import org.example.factory.ingredient.BruschettaSauce;
import org.example.factory.ingredient.GoatCheese;
import org.example.factory.ingredient.SlicedPepperoni;
import org.example.factory.ingredient.Calamari;
import org.example.factory.veggies.Veggies;
import org.example.factory.veggies.BlackOlives;
import org.example.factory.veggies.Spinach;
import org.example.factory.veggies.EggPlant;
import org.example.factory.veggies.Onion;

public class CaliforniaPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new VeryThinDough();
    }

    @Override
    public Sauce createSauce() {
        return new BruschettaSauce();
    }

    @Override
    public Cheese createCheese() {
        return new GoatCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{ new BlackOlives(), new Spinach(), new EggPlant(), new Onion() };
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new Calamari();
    }
}