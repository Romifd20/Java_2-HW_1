package com.company;

public class Main {

    public static void main(String[] args) {

        Audi audi = new Audi(Name.AUDI, "White", 2014, new NumberOfDoors(4),"Germany");
        audi.getInfo();
        audi.makeSignal();
        audi.onLight();
        audi.fuelConsumption(20.4, 40);


        System.out.println("-----------------------------------------");

        AudiTT audiTT1 = new AudiTT(Name.AUDITT, "Black", 2010, new NumberOfDoors(2), "Italy",3.5);
        audiTT1.getInfo();
        audiTT1.makeSignal();
        audiTT1.ofLight();
        audiTT1.fuelConsumption(audiTT1.KM, 25,38.7);

        System.out.println("-----------------------------------------");

        AudiTT audiTT2 = new AudiTT(Name.TOYOTA, "Black", 2011, new NumberOfDoors(5),"Japan", 2.8);
        audiTT2.getInfo();
        audiTT2.makeSignal();
        audiTT2.onLight();
        audiTT2.fuelConsumption(100,45,36);



    }
}
