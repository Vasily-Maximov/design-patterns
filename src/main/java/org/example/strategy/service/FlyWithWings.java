package org.example.strategy.service;

public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I’m flying");
    }
}