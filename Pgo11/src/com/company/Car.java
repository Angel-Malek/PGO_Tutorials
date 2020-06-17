package com.company;

import java.util.ArrayList;

public class Car implements Comparable<Car> {
    //такой биг брейн я тут использовал что я в шоке что такое законно
    private String model;
    private int year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String name) {
        this.model = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int compareTo(Car other) {
        int compareResult = (this.getYear() - other.getYear());
        return compareResult;
    }

    public String toString() {
        return this.getModel() + " " + this.getYear();
    }

}
