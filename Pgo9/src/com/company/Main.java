package com.company;

public class Main {

    public static void main(String[] args) {
        Car newCar = new Car();
        newCar.start();
        newCar.stop();
//caling methods again? for task 2
        newCar.start();
        newCar.stop();

        // next task
        Cat cat = new Cat();
        cat.makeNoise();
        Wolf wolf = new Wolf();
        Lion lion = new Lion();
        Dog dog = new Dog();
   //     wolf.makeNoise();
        //working

//task 4

cat.roam();
    }
}
