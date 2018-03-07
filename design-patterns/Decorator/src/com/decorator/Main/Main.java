package com.decorator.Main;

import com.decorator.Extras.Cream;
import com.decorator.Extras.Flavouring;
import com.decorator.Extras.PremiumBeans;
import com.decorator.Extras.Vanilla;

public class Main {

    public static void main(String[] args) {
        Coffee order = new SimpleCoffee();

        order = new PremiumBeans(order);

        order = new Vanilla(order);

        order = new Cream(order);

        order = new Flavouring(order);

        printOrder(order);
    }

    private static void printOrder(Coffee coffee){
        System.out.println("You ordered a: " + coffee.getDescription());
        System.out.println("Costing: " + coffee.getCost());
    }
}
