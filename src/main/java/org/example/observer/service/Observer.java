package org.example.observer.service;

public interface Observer {

    void update(float temperature, float humidity, float pressure);
}