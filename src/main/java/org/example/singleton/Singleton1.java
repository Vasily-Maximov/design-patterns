package org.example.singleton;

public class Singleton1 {

    private static Singleton1 singleton = new Singleton1();

    private Singleton1() {
    }

    public static Singleton1 getSingleton() {
        return singleton;
    }
}