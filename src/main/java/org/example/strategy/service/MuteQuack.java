package org.example.strategy.service;

public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("I'm can't quack");
    }
}
