package com.decorator.Extras;

import com.decorator.Main.Coffee;

public class Flavouring implements Coffee {

    private Coffee coffee;

    private int extraCost = 1;

    public Flavouring(Coffee coffee){
        this.coffee = coffee;
    }

    @Override
    public int getCost() {
        return coffee.getCost() + extraCost;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ",flavouring";
    }
}
