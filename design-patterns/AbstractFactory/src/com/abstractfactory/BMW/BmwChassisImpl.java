package com.abstractfactory.BMW;

import com.abstractfactory.Chassis;

public class BmwChassisImpl implements Chassis {
    @Override
    public void getManufacturer() {
        System.out.println("Chassis manufacturered by BMW installed");
    }
}
