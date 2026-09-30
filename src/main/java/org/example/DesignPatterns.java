package org.example;

import org.example.manager.Manager;

public class DesignPatterns {
    public static void main(String[] args) {
        System.out.println("Pattern STRATEGY:");
        Manager.createPatternStrategy();
        System.out.println("Pattern OBSERVER:");
        Manager.createPatternObServer();
    }
}