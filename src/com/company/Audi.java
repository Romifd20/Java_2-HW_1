package com.company;

public class Audi extends Car {

    public Audi(Name name, String color, int year, NumberOfDoors numberOfDoors) {
        super(name, color, year, numberOfDoors);
    }

    @Override
    public void makeSignal() {
        System.out.println("pii-piip");

    }


}
