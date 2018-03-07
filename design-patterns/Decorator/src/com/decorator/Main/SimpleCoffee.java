package com.decorator.Main;

public class SimpleCoffee implements Coffee {

    private int cost = 10;
    private String description =  "Simple coffee";

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
