package org.example.strategy.service;

public class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("I'm quack");
    }
}