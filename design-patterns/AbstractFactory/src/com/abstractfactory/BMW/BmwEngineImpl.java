package com.abstractfactory.BMW;

import com.abstractfactory.Engine;

public class BmwEngineImpl implements Engine {
    @Override
    public void getManufacturer() {
        System.out.println("Engine manufactured by BMW installed");
    }
}
