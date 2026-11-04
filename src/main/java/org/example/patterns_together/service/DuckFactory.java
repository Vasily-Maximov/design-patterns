package org.example.patterns_together.service;

import org.example.patterns_together.model.DuckCall;
import org.example.patterns_together.model.MallardDuck;
import org.example.patterns_together.model.RedheadDuck;
import org.example.patterns_together.model.RubberDuck;

public class DuckFactory extends AbstractDuckFactory {

    @Override
    public Quackable createMallardDuck() {
        return new MallardDuck();
    }

    @Override
    public Quackable createRedheadDuck() {
        return new RedheadDuck();
    }

    @Override
    public Quackable createDuckCall() {
        return new DuckCall();
    }

    @Override
    public Quackable createRubberDuck() {
        return new RubberDuck();
    }
}