package org.example.strategy.model;

import org.example.strategy.service.FlyBehavior;
import org.example.strategy.service.QuackBehavior;

public class MallardDuck extends Duck {

    public MallardDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        super(flyBehavior, quackBehavior);
    }

    @Override
    public void display() {
        System.out.println("I'm Mallard duck");
    }
}