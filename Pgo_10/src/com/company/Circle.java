package com.company;

public class Circle implements Figure {
    double Perimetr;
    double Surface;
    double radius;



    public Circle(double radius) {
        this.radius = radius;
    }

    public double getPerimeter() {

        Perimetr = 2* radius * 3.14 ;
        return Perimetr;
    }

    @Override
    public double getArea() {
//ненавижу геометрия и даже тут она аааааа
        Surface = radius * radius * 3.14;
        return Surface;

    }

    @Override
    public String getType() {
       String name = "Circle";
       return name ;
    }
}
