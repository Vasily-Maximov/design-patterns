package org.example.factory.model.chicago;

import org.example.factory.model.Pizza;

public class ChicagoCheesePizza extends Pizza {

    public ChicagoCheesePizza() {

    }

    @Override
    public void prepare() {

    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}