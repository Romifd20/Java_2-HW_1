package com.company;

public final class AudiTT extends Audi{

    public AudiTT(Name name, String color, int year, NumberOfDoors numberOfDoors) {
        super(name,color, year, numberOfDoors);
    }

    @Override
    public void makeSignal() {
        System.out.println("paap-paap");
    }



}
