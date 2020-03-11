package com.company;

public class Phone {
    String Brand;
    int Screen_resolution;
    int Number;
    String Mesange ;
    int Number2;

    public Phone(String Brand, int Screen_resolution, int Number, String Mesange, int Number2) {
        this.Brand = Brand;
        this.Screen_resolution = Screen_resolution;
        this.Number = Number;
        this.Mesange = Mesange;
        this.Number2 = Number2;
    }
    public String Text(String Mesange){
        this.Mesange = Mesange;
        return this.Mesange;
    }
    public int getNumber(){
        return this.Number;
    }
    public int getNumber2(){
        return this.Number2;
    }
    public void SendText(int Number2, String Mesange, int Number ){
        System.out.println(    "Sending the message "+ Mesange+ "  " + Number + " to number "+ Number2 );
    }



}
