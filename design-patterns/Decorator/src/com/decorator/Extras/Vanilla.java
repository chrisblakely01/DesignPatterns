package com.decorator.Extras;

import com.decorator.Main.BaseExtra;
import com.decorator.Main.Coffee;

public class Vanilla extends BaseExtra {

    private int cost = 2;
    private String description = "vanilla";

    public Vanilla(Coffee coffee){
        super(coffee);
        super.setCost(cost);
        super.setDescription(description);
    }
}
