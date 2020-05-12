package com.company;

public class Car {
    String Brand;
    String Color;
    int EngineCapacity;

    public Car(String Brand,String Color, int EngineCapacity ) {
        this.Brand = Brand;
        this.EngineCapacity = EngineCapacity;
        this.Color = Color;
    }
    public String getColor(){
        return Color;
    }
    public String getBrand(){
        return Brand;
    }
    public int getEngine(){
        return this.EngineCapacity;
    }
    public void setEngine(int EngineCapacity){
        this.EngineCapacity = EngineCapacity;
    }
    public void TypeEngine(){
    //boolean HighSpeed ;

        if(EngineCapacity>=21) {
            System.out.println("engine is high speed");
        } else {
            System.out.println("Thats wack crap" );
        } ;

    }



}
