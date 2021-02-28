package com.company;

public class Main {

    public static void main(String[] args) {

        Audi audi = new Audi(Name.AUDI, "White", 2014, new NumberOfDoors(4));
        audi.getInfo();
        audi.makeSignal();
        audi.onLight();

        System.out.println("-----------------------------------------");

        AudiTT audiTT1 = new AudiTT(Name.AUDITT, "Black", 2010, new NumberOfDoors(2));
        audiTT1.getInfo();
        audiTT1.makeSignal();
        audiTT1.ofLight();

        System.out.println("-----------------------------------------");

        AudiTT audiTT2 = new AudiTT(Name.TOYOTA, "Black", 2011, new NumberOfDoors(5));
        audiTT2.getInfo();
        audiTT2.makeSignal();
        audiTT2.onLight();


    }
}
