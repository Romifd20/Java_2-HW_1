package com.company;

public class Audi extends Car {

    private String fromWhichCountry;


    public Audi(Name name, String color, int year, NumberOfDoors numberOfDoors, String fromWhichCountry) {
        super(name, color, year, numberOfDoors);
        this.fromWhichCountry = fromWhichCountry;
    }

    public String getFromWhichCountry(){
        return fromWhichCountry;
    }



    @Override
    public void makeSignal() {
        System.out.println("pii-piip");

    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("This car from " + fromWhichCountry);
    }
}
