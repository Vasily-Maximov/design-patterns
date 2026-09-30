package org.example.strategy.service;

public class Squeak implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("I'm squeak");
    }
}