package org.example.patterns_together.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Observable implements QuackObservable {

    private final List<Observer> observers;
    private final QuackObservable duck;

    public Observable(QuackObservable duck) {
        this.duck = duck;
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        Iterator<Observer> iterator = observers.iterator();
        while (iterator.hasNext()) {
            Observer observer = iterator.next();
            observer.update(duck);
        }
    }
}