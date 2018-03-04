package com.abstractfactory.ThirdParty;

import com.abstractfactory.Tyres;

public class ThirdPartyTyresImpl implements Tyres {

    @Override
    public void getManufacturer() {
        System.out.println("Tyres manufactured by THIRD PARTY installed");
    }
}
