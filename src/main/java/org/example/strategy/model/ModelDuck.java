package org.example.strategy.model;

import org.example.strategy.service.FlyBehavior;
import org.example.strategy.service.QuackBehavior;

public class ModelDuck extends Duck {

    public ModelDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        super(flyBehavior, quackBehavior);
    }

    @Override
    public void display() {
        System.out.println("I'm model duck");
    }
}