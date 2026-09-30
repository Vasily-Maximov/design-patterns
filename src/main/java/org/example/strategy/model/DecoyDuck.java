package org.example.strategy.model;

import org.example.strategy.service.FlyBehavior;
import org.example.strategy.service.QuackBehavior;

public class DecoyDuck extends Duck {

    public DecoyDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        super(flyBehavior, quackBehavior);
    }

    @Override
    public void display() {
        System.out.println("I'm decoy duck");
    }
}