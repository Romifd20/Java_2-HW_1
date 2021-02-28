package com.company;

public class Car {

    private String color;
    private int year;
    private NumberOfDoors numberOfDoors;
    private Name name;
    private boolean theLamp;

    public Car(Name name, String color, int year, NumberOfDoors numberOfDoors) {
        this.color = color;
        this.year = year;
        this.numberOfDoors = numberOfDoors;
        this.name = name;
    }


    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public NumberOfDoors getNumberOfDoors() {
        return numberOfDoors;
    }


    public Name getName() {
        return name;
    }


    public void onLight() {
        theLamp = true;
        System.out.println("Is the lamp on ? " + theLamp);
    }

    public void ofLight() {
        theLamp = false;
        System.out.println("Is the lamp on ? " + theLamp);
    }


    public void makeSignal() {

    }


    public void getInfo() {
        System.out.println("Name = " + getName() + "\nColor = " + color + "\nYear = " + year + "\nNumber of doors = " + numberOfDoors.getNumberOfDoors());
    }


}

