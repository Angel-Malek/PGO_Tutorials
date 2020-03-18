package com.company;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {
        // write your code here TESting

        Air A = new Air("SAS", 10);
        Engine Ab = new Engine(10000, 200000);
        Ab.TypeEngine();
        String Brand = A.getBrand();
        int Number = A.getNumber();
        int Year = Ab.getProductionYear();
        double Power = Ab.getPower();
        boolean Eco = Ab.TypeEngine();


        //  System.out.println(Eco);
        System.out.println("Brand: " + Brand + " number of seats: " + Number + " engine was made in: " + Year + " engine power rate is: " + Power + " Is engine eco?  " + Eco);

       // System.out.println(Eco);


    }

}
