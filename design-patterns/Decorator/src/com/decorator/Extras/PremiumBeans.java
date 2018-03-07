package com.decorator.Extras;

import com.decorator.Main.BaseExtra;
import com.decorator.Main.Coffee;

public class PremiumBeans extends BaseExtra {

    private int cost = 3;
    private String description = "premium beans";

    public PremiumBeans(Coffee coffee){
        super(coffee);
        super.setCost(cost);
        super.setDescription(description);
    }

}
