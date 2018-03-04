package com.abstractfactory.Audi;

import com.abstractfactory.Chassis;

public class AudiChassisImpl implements Chassis {

    @Override
    public void getManufacturer() {
        System.out.println("Chassis manufactured by AUDI installed");
    }
}
