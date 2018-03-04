package com.abstractfactory.BMW;

import com.abstractfactory.CarFactory;
import com.abstractfactory.Chassis;
import com.abstractfactory.Engine;
import com.abstractfactory.Tyres;

public class BmwFactory implements CarFactory {
    @Override
    public Chassis createChassis() {
        return new BmwChassisImpl();
    }

    @Override
    public Engine createEngine() {
        return new BmwEngineImpl();
    }

    @Override
    public Tyres createTyres() {
        return new BmwTyresImpl();
    }

    @Override
    public String getFactoryDescription() {
        return "Car is being created using BMW FACTORY";
    }
}
