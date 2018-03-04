package com.abstractfactory.Audi;

import com.abstractfactory.Engine;

public class AudiEngineImpl implements Engine {
    @Override
    public void getManufacturer() {
        System.out.println("Engine manufactured by Audi installed");
    }
}
