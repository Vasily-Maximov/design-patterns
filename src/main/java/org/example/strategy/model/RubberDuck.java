package org.example.strategy.model;

import org.example.strategy.service.FlyBehavior;
import org.example.strategy.service.QuackBehavior;

public class RubberDuck extends Duck {

    public RubberDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        super(flyBehavior, quackBehavior);
    }

    @Override
    public void display() {
        System.out.println("I'm rubber duck");
    }
}