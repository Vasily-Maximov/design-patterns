package org.example.patterns_together.service;

public interface QuackObservable {

    void registerObserver(Observer observer);
    void notifyObservers();
}
