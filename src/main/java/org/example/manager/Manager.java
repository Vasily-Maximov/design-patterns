package org.example.manager;

import org.example.command.model.*;
import org.example.command.service.*;
import org.example.decorator.model.Beverage;
import org.example.decorator.model.DarkRoast;
import org.example.decorator.model.Espresso;
import org.example.decorator.service.Milk;
import org.example.decorator.service.Mocha;
import org.example.decorator.service.Whip;
import org.example.factory.model.Pizza;
import org.example.factory.service.CaliforniaPizzaStore;
import org.example.factory.service.ChicagoPizzaStore;
import org.example.factory.service.NYPizzaStore;
import org.example.factory.service.PizzaStore;
import org.example.iterator.model.DinerMenu;
import org.example.iterator.model.PancakeHouseMenu;
import org.example.iterator.model.Waitress;
import org.example.iterator.service.Menu;
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

    public static void createPatternDecorator() {
        Beverage beverage = new Espresso();
        System.out.printf("%s - $%.2f\n", beverage.getDescription(), beverage.cost());
        beverage = new Milk(beverage);
        System.out.printf("%s - $%.2f\n", beverage.getDescription(), beverage.cost());
        beverage = new DarkRoast();
        beverage = new Whip(beverage);
        beverage = new Mocha(beverage);
        beverage = new Mocha(beverage);
        System.out.printf("%s - $%.2f\n", beverage.getDescription(), beverage.cost());
    }

    public static void createPatternFactory() {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();
        PizzaStore californiaStore = new CaliforniaPizzaStore();
        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");
        System.out.println(pizza.getName() + " ingredient: " + pizza + "\n");
        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");
        System.out.println(pizza.getName() + " ingredient: " + pizza + "\n");
        pizza = californiaStore.orderPizza("clam");
        System.out.println("Bob ordered a " + pizza.getName() + "\n");
        System.out.println(pizza.getName() + " ingredient: " + pizza + "\n");
    }

    public static void createPatternCommand() {
        SimpleRemoteControl remoteControl = new SimpleRemoteControl();

        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        CeilingFan ceilingFan= new CeilingFan("Living Room");
        GarageDoor garageDoor = new GarageDoor("");
        Stereo stereo = new Stereo("Living Room");
        Light light = new Light("Living Room");
        TV tv = new TV("Living Room");
        Hottub hottub = new Hottub();

        LightOnCommand livingRoomLightOnCommand = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOffCommand = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOnCommand = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOffCommand = new LightOffCommand(kitchenLight);

        CeilingFanHighCommand ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);
        CeilingFanMediumCommand ceilingFanMediumCommand = new CeilingFanMediumCommand(ceilingFan);
        CeilingFanLowCommand ceilingFanLowCommand = new CeilingFanLowCommand(ceilingFan);

        GarageDoorUpCommand garageDoorUpCommand = new GarageDoorUpCommand(garageDoor);
        GarageDoorDownCommand garageDoorDownCommand = new GarageDoorDownCommand(garageDoor);

        StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);

        LightOnCommand lightOn = new LightOnCommand(light);
        LightOffCommand lightOff = new LightOffCommand(light);
        StereoOnCommand stereoOn = new StereoOnCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);
        TVOnCommand tvOn = new TVOnCommand(tv);
        TVOffCommand tvOff = new TVOffCommand(tv);
        HottubOnCommand hottubOn = new HottubOnCommand(hottub);
        HottubOffCommand hottubOff = new HottubOffCommand(hottub);

        Command[] partyOn = {lightOn, stereoOn, tvOn, hottubOn};
        Command[] partyOff = {lightOff, stereoOff, tvOff, hottubOff};
        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        remoteControl.setCommand(0, livingRoomLightOnCommand, livingRoomLightOffCommand);
        remoteControl.setCommand(1, kitchenLightOnCommand, kitchenLightOffCommand);
        remoteControl.setCommand(2, ceilingFanHighCommand, ceilingFanOffCommand);
        remoteControl.setCommand(3, stereoOnWithCDCommand, stereoOffCommand);

//        System.out.println(remoteControl);
//
//        System.out.printf("[slot %d]\n",0);
//        remoteControl.onButtonWasPushed(0);
//        remoteControl.offButtonWasPushed(0);
//        System.out.printf("[slot %d]\n",1);
//        remoteControl.onButtonWasPushed(1);
//        remoteControl.offButtonWasPushed(1);
//        System.out.printf("[slot %d]\n",2);
//        remoteControl.onButtonWasPushed(2);
//        remoteControl.offButtonWasPushed(2);
//        System.out.printf("[slot %d]\n",3);
//        remoteControl.onButtonWasPushed(3);
//        remoteControl.offButtonWasPushed(3);
//
//        System.out.printf("[slot %d]\n",0);
//        remoteControl.onButtonWasPushed(0);
//        remoteControl.offButtonWasPushed(0);
//        System.out.println(remoteControl);
//        System.out.printf("[slot %d]\n",0);
//        remoteControl.undoButtonWasPushed();
//        remoteControl.offButtonWasPushed(0);
//        remoteControl.onButtonWasPushed(0);
//        System.out.println(remoteControl);
//        remoteControl.undoButtonWasPushed();
//
//        remoteControl.setCommand(0, ceilingFanLowCommand, ceilingFanOffCommand);
//        remoteControl.setCommand(1, ceilingFanMediumCommand, ceilingFanOffCommand);
//        remoteControl.setCommand(2, ceilingFanHighCommand, ceilingFanOffCommand);
//        remoteControl.onButtonWasPushed(0);
//        remoteControl.offButtonWasPushed(0);
//        System.out.println(remoteControl);
//        remoteControl.undoButtonWasPushed();
//        remoteControl.onButtonWasPushed(1);
//        System.out.println(remoteControl);
//        remoteControl.undoButtonWasPushed();

        remoteControl.setCommand(0, partyOnMacro, partyOffMacro);
        System.out.println(remoteControl);
        System.out.println("--- Pushing Macro On---");
        remoteControl.onButtonWasPushed(0);
        System.out.println("--- Pushing Macro Off---");
        remoteControl.offButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();
    }

    public static void createPatternIterator() {
        Menu dinerMenu = new DinerMenu();
        Menu pancakeHouseMenu = new PancakeHouseMenu();
        Waitress waitress = new Waitress(dinerMenu, pancakeHouseMenu);
        waitress.printMenu();
    }
}