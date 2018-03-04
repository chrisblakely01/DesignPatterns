package com.abstractfactory;

public interface CarFactory {
    Chassis createChassis();
    Engine createEngine();
    Tyres createTyres();

    String getFactoryDescription();
}
