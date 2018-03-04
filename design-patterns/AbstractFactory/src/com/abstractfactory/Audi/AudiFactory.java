package com.abstractfactory.Audi;

import com.abstractfactory.BMW.BmwChassisImpl;
import com.abstractfactory.BMW.BmwEngineImpl;
import com.abstractfactory.CarFactory;
import com.abstractfactory.Chassis;
import com.abstractfactory.Engine;
import com.abstractfactory.ThirdParty.ThirdPartyEngineImpl;
import com.abstractfactory.Tyres;

public class AudiFactory implements CarFactory {
    @Override
    public Chassis createChassis() {
        return new AudiChassisImpl();
    }

    @Override
    public Engine createEngine() {
        return new ThirdPartyEngineImpl();
    }

    @Override
    public Tyres createTyres() {
        return new AudiTyresImpl();
    }

    @Override
    public String getFactoryDescription() {
        return "Car is being created using AUDI FACTORY";
    }
}
