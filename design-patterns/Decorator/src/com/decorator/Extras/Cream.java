package com.decorator.Extras;

import com.decorator.Main.Coffee;

public class Cream implements Coffee {

    private Coffee coffee;

    private int extraCost = 3;

    private String description = "cream";

    public Cream(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public int getCost() {
        return coffee.getCost() + extraCost;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + "," + description;
    }
}
