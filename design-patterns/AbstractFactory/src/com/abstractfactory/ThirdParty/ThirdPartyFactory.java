package com.abstractfactory.ThirdParty;

import com.abstractfactory.CarFactory;
import com.abstractfactory.Chassis;
import com.abstractfactory.Engine;
import com.abstractfactory.Tyres;

public class ThirdPartyFactory implements CarFactory {
    @Override
    public Chassis createChassis() {
        return new ThirdPartyChassisImpl();
    }

    @Override
    public Engine createEngine() {
        return new ThirdPartyEngineImpl();
    }

    @Override
    public Tyres createTyres() {
        return new ThirdPartyTyresImpl();
    }

    @Override
    public String getFactoryDescription() {
        return "Car is being created using THIRD PARTY FACTORY";
    }
}
