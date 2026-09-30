package org.example.strategy.service;

public class FlyRocketPowered implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I’m flying with a rocket");
    }
}