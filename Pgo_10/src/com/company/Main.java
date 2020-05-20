package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        double radius = 3d;
        Figure circle = new Circle(radius);

        double baseSide = 10d;
        double side = 5d;
        double height = 8d;
        Figure parallelogram = new Parallelogram(baseSide, side, height);

        double sideA = 15d;
        double sideB = 10;
        Figure rectangle = new Rectangle(sideA, sideB);

        List<Figure> figures = new ArrayList<>(3);
        figures.add(circle);
        figures.add(parallelogram);
        figures.add(rectangle);

        for (Figure figure : figures) {
            System.out.println(figure.getType());
            System.out.println("Area: " + figure.getArea() + " units.");
            System.out.println("Perimeter: " + figure.getPerimeter() + " units.\n");
        }



        //all works in ex 1
        //*playing music from даша путешественница: у нас получилось ура ура мы сделали это ура ура
        //doing ex 2

        Cat mruczek = new Cat("Mruczek");
        mruczek.start();
        System.out.println(mruczek.getType()+" - "+mruczek.getName());
        mruczek.stop();

        //done
        //making ex3

        Manager manager = new Manager("Jan", "Kowalski", 1990, "PJATK", 2010, 2000d, 100d);
        System.out.println(manager);


// я в шоке но как-то быстро сделал
        

    }

}

