package org.example.manager;

import org.example.observer.model.WeatherData;
import org.example.observer.service.CurrentConditionsDisplay;
import org.example.observer.service.ForecastDisplay;
import org.example.observer.service.StatisticsDisplay;
import org.example.strategy.model.*;
import org.example.strategy.service.*;

public class Manager {

    public static void createPatternStrategy() {
        Duck duck = new MallardDuck(new FlyWithWings(), new Quack());
        duck.display();
        duck.swim();
        duck.performFly();
        duck.performQuack();
        System.out.println("------------------------");
        duck = new RubberDuck(new FlyNoWay(), new Squeak());
        duck.display();
        duck.swim();
        duck.performFly();
        duck.performQuack();
        System.out.println("------------------------");
        duck = new DecoyDuck(new FlyNoWay(), new MuteQuack());
        duck.display();
        duck.swim();
        duck.performFly();
        duck.performQuack();
        System.out.println("------------------------");
        duck = new RedheadDuck(new FlyWithWings(), new Quack());
        duck.display();
        duck.swim();
        duck.performFly();
        duck.performQuack();
        System.out.println("------------------------");
        duck = new ModelDuck(new FlyNoWay(), new MuteQuack());
        duck.display();
        duck.swim();
        duck.performFly();
        duck.performQuack();
        duck.setFlyBehavior(new FlyRocketPowered());
        duck.setQuackBehavior(new Squeak());
        duck.performFly();
        duck.performQuack();

    }

    public static void createPatternObServer() {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(-5, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}