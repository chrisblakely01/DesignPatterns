package com.abstractfactory.Audi;

import com.abstractfactory.Tyres;

public class AudiTyresImpl implements Tyres {

    @Override
    public void getManufacturer() {
        System.out.println("Tyres manufactured by Audi installed");
    }
}
