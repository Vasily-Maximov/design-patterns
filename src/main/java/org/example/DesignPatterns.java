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
                case 4:
                    System.out.println("Pattern FACTORY:");
                    Manager.createPatternFactory();
                    break;
                case 5:
                    System.out.println("Pattern COMMAND:");
                    Manager.createPatternCommand();
                    break;
                case 6:
                    System.out.println("Pattern ITERATOR:");
                    Manager.createPatternIterator();
                    break;
                case 7:
                    System.out.println("Pattern COMPOSITE:");
                    Manager.createPatternComposite();
                    break;
                case 8:
                    System.out.println("Pattern ADAPTER:");
                    Manager.createPatternAdapter();
                    break;
                case 9:
                    System.out.println("Pattern CONDITION:");
                    Manager.createPatternCondition();
                    break;
                case 10:
                    System.out.println("Patterns Together:");
                    Manager.createPatternsTogether();
                    break;
                case 11:
                    System.out.println("Template method:");
                    Manager.createTemplateMethod();
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
        System.out.println("4 - Pattern FACTORY");
        System.out.println("5 - Pattern COMMAND");
        System.out.println("6 - Pattern ITERATOR");
        System.out.println("7 - Pattern COMPOSITE");
        System.out.println("8 - Pattern ADAPTER");
        System.out.println("9 - Pattern CONDITION");
        System.out.println("10 -Patterns TOGETHER");
        System.out.println("11 -Template METHOD");
    }

}