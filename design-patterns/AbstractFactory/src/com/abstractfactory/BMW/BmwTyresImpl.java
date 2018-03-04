package com.abstractfactory.BMW;

import com.abstractfactory.Tyres;

public class BmwTyresImpl implements Tyres{
    @Override
    public void getManufacturer() {
        System.out.println("Tyres manufactured by BMW installed");
    }
}
