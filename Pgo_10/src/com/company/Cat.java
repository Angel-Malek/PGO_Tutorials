package com.company;

public class Cat extends Animal implements Moveable  {


    public Cat(String name) {
        super(name);
    }

    @Override
    public void start() {
        System.out.println("starts!!!!!");
    }

    @Override
    public void stop() {
        System.out.println("Stops! :C");
    }

    @Override
    String getType() {
        String Type = "Cat";
        return Type;
    }
}
