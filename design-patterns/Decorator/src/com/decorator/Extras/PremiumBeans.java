package com.decorator.Extras;

import com.decorator.Main.Coffee;

public class PremiumBeans implements Coffee {

    private int extraCost = 3;
    private Coffee coffee;

    public PremiumBeans(Coffee coffee){
        this.coffee = coffee;
    }

    @Override
    public int getCost() {
        return coffee.getCost() + extraCost;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ",Premiun Beans";
    }
}
