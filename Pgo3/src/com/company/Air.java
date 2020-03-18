package com.company;

public class Air {

    String Brand;
    int NumberOfSeats;


    public Air(String Brand, int NumberOfSeats) {
        this.Brand = Brand;
        this.NumberOfSeats = NumberOfSeats;
    }

    public int getNumber() {
        return this.NumberOfSeats;
    }

    public void setNumberOfSeats(int NumberOfSeats) {
        this.NumberOfSeats = NumberOfSeats;
    }

    public String getBrand() {
        return this.Brand;
    }
    public void setBrand( String Brand){this.Brand = Brand;}
}


