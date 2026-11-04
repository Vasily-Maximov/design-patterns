package org.example.patterns_together.model;

import org.example.patterns_together.service.Observable;
import org.example.patterns_together.service.Observer;
import org.example.patterns_together.service.Quackable;

public class DuckCall implements Quackable {

    private final Observable observable;

    public DuckCall() {
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Kwak");
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }

    @Override
    public String toString() {
        return "Duck Call";
    }
}