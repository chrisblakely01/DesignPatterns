package com.decorator.test;

import com.decorator.Extras.Cream;
import com.decorator.Extras.Flavouring;
import com.decorator.Extras.PremiumBeans;
import com.decorator.Extras.Vanilla;
import com.decorator.Main.Coffee;
import com.decorator.Main.SimpleCoffee;
import org.junit.Test;
import org.junit.Assert;

public class CoffeeTests {

    @Test
    public void ShouldCreateSimpleCoffee(){
        Coffee classUnderTest = new SimpleCoffee();

        Assert.assertEquals(classUnderTest.getCost(), 10);
        Assert.assertEquals(classUnderTest.getDescription(), "Simple coffee");
    }

    @Test
    public void ShouldCreateSimpleCoffeeWithExtras(){
        Coffee classUnderTest = new SimpleCoffee();

        classUnderTest = new PremiumBeans(classUnderTest);

        classUnderTest = new Vanilla(classUnderTest);

        classUnderTest = new Cream(classUnderTest);

        classUnderTest = new Flavouring(classUnderTest);

        Assert.assertEquals(classUnderTest.getCost(), 10);
        Assert.assertEquals(classUnderTest.getDescription(), "Simple coffee");
    }
}
