package com.decorator.Extras;

import com.decorator.Main.Coffee;

public class Vanilla implements Coffee {

    private Coffee coffee;
    private int extraCost = 2;

    public Vanilla(Coffee coffee){
        this.coffee = coffee;
    }

    @Override
    public int getCost() {
        return coffee.getCost() + extraCost;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ",vanilla";
    }
}
