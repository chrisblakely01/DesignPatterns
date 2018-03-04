package com.abstractfactory.ThirdParty;

import com.abstractfactory.Chassis;

public class ThirdPartyChassisImpl implements Chassis {

    @Override
    public void getManufacturer() {
        System.out.println("Chassis manufactured by THIRD PARTY installed");
    }
}
