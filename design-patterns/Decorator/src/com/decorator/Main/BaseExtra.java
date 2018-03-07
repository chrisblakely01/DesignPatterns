package com.decorator.Main;

import com.sun.xml.internal.rngom.parse.host.Base;

public abstract class BaseExtra implements Coffee {

    private Coffee coffee;
    private int extraCost;
    private String description;

    public BaseExtra(Coffee coffee) {
        this.coffee = coffee;
    }

    protected void setCost(int cost){
        this.extraCost = cost;
    }

    protected void setDescription(String description){
        this.description = description;
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
