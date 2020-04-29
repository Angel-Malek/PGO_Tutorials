package com.company;

public class Furniture {
    String name;
    double price;
    double VAT = 0.15;

    public Furniture(String name, double price) {
        this.name = name;
        this.price = price;
        this.VAT = VAT;
    }

    public double getPrice() {
       // System.out.println("price, just price: " + price);
        return price;
    }


    public double gettingprice() {
       // System.out.println("price with VAT: " + (price * VAT + price));
        return price * VAT + price;
    }
//эта  работает алилуя!!!!!!!!!!

}
