package org.example.observer.service;

public interface Subject {

    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver();
    float getTemperature();
    float getHumidity();
    float getPressure();
}