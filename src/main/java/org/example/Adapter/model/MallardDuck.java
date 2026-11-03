package org.example.Adapter.model;

import org.example.Adapter.service.Duck;

public class MallardDuck implements Duck {

    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("I’m flying");
    }
}