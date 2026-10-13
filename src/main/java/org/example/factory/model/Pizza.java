package org.example.factory.model;

import org.example.factory.ingredient.Dough;
import org.example.factory.ingredient.Sauce;
import org.example.factory.ingredient.Cheese;
import org.example.factory.ingredient.Pepperoni;
import org.example.factory.ingredient.Clams;
import org.example.factory.veggies.Veggies;
import java.util.Arrays;

public abstract class Pizza {

    protected  String name;
    protected  Dough dough;
    protected  Sauce sauce;
    protected  Veggies[] veggies;
    protected  Cheese cheese;
    protected  Pepperoni pepperoni;
    protected  Clams clam;

    public abstract void prepare();

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", dough=" + dough +
                ", sauce=" + sauce +
                ", veggies=" + Arrays.toString(veggies) +
                ", cheese=" + cheese +
                ", pepperoni=" + pepperoni +
                ", clam=" + clam +
                '}';
    }
}