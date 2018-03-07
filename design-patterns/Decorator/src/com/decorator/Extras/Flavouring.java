package com.decorator.Extras;

import com.decorator.Main.BaseExtra;
import com.decorator.Main.Coffee;

public class Flavouring extends BaseExtra {

    private int cost = 1;

    private String description = "flavouring";

    public Flavouring(Coffee coffee){
        super(coffee);
        super.setCost(cost);
        super.setDescription(description);
    }

}
