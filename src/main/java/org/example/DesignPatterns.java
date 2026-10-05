package org.example;

import org.example.manager.Manager;

import java.util.Scanner;

public class DesignPatterns {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        display();
        int number = scanner.nextInt();
        while(number > 0) {
            switch (number) {
                case 1:
                    System.out.println("Pattern STRATEGY:");
                    Manager.createPatternStrategy();
                    break;
                case 2:
                    System.out.println("Pattern OBSERVER:");
                    Manager.createPatternObServer();
                    break;
                case 3:
                    System.out.println("Pattern DECORATOR:");
                    Manager.createPatternDecorator();
                    break;
                default:
                    break;
            }
            System.out.println();
            display();
            number = scanner.nextInt();
        }
    }

    private static void display() {
        System.out.println("Select Pattern:");
        System.out.println("0 - EXIT");
        System.out.println("1 - Pattern STRATEGY");
        System.out.println("2 - Pattern OBSERVER");
        System.out.println("3 - Pattern DECORATOR");
    }

}