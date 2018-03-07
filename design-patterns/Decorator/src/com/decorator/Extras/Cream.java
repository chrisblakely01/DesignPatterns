package com.decorator.Extras;

import com.decorator.Main.BaseExtra;
import com.decorator.Main.Coffee;

public class Cream extends BaseExtra {

    private int extraCost = 3;

    private String description = "cream";

    public Cream(Coffee coffee) {
        super(coffee);
        super.setCost(extraCost);
        super.setDescription(description);
    }

}
