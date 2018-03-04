package com.abstractfactory;

/*
* Create functionality that returns cars.
*
* A car must have:
*   An engine
*   Tyres
*   Chasis
*
*   Each car component manufacturer can be interchangable, therefore, we cannot specify concrete classes of each type
*
* */

import com.abstractfactory.Audi.AudiFactory;
import com.abstractfactory.BMW.BmwFactory;
import com.abstractfactory.ThirdParty.ThirdPartyFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {

        System.out.println("Enter the car which you would like to create:");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        try {
            input = br.readLine();
        } catch (IOException e) {
            throw new RuntimeException();
        }

        CarFactory carFactory = makeCarFactory(input);

        System.out.println(carFactory.getFactoryDescription());
        carFactory.createChassis().getManufacturer();
        carFactory.createTyres().getManufacturer();
        carFactory.createEngine().getManufacturer();
    }

    private static CarFactory makeCarFactory(String type){
        switch (type) {
            case "BMW":
                return new BmwFactory();
            case "AUDI":
                return new AudiFactory();
            default:
                return new ThirdPartyFactory();
        }
    }


}

