package org.example.strategy.model;

import org.example.strategy.service.FlyBehavior;
import org.example.strategy.service.QuackBehavior;

public class RedheadDuck extends Duck {

    public RedheadDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        super(flyBehavior, quackBehavior);
    }

    @Override
    public void display() {
        System.out.println("I'm redhead duck");
    }
}