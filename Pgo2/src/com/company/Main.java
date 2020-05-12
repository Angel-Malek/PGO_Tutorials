package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here


        //Testing??

        Phone Iphone = new Phone("Iphone", 15, 831209911, "", 989281488);
        Iphone.SendText(19888, "Hello world", 31434);
        //     int Number = Iphone.getNumber();
        //   int Number2 = Iphone.getNumber2();
        // System.out.println("number of phone is   " + Number);
        // String Masange = Iphone.Text("hello");
        // System.out.println(Number + " sent an sms to " + Number2 + " with this text:  "+ Masange);
        // System.out.println();


        //Testing 2

        Car Carr = new Car("Mersedes", "Black", 48);
        Carr.TypeEngine();
        String Brand = Carr.getBrand();
        String Color = Carr.getColor();
        System.out.println("car brand"+ Brand + " car color "+ Color +" engine type "+ Carr.getEngine());
    }
}
