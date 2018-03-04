package com.abstractfactory.ThirdParty;

import com.abstractfactory.Engine;

public class ThirdPartyEngineImpl implements Engine {
    @Override
    public void getManufacturer() {
        System.out.println("Enginer manufactured by THIRD PARTY installed");
    }
}
