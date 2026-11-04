package org.example.patterns_together.service;

import org.example.patterns_together.model.Goose;

public class GooseFactory extends AbstractGooseFactory {

    @Override
    public Quackable createGoose() {
        return new GooseAdapter(new Goose());
    }
}