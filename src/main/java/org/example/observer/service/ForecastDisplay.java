package org.example.observer.service;

public class ForecastDisplay implements Observer, DisplayElement {

    private float temperature;
    private final Subject weatherData;

    public ForecastDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println(temperature > 0 ? "Forecast: Improving weather on the way!" : "The weather is deteriorating.");
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        display();
    }
}