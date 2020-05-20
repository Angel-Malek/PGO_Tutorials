package com.company;

public class Rectangle implements Figure {
    double Perimetr;

    public double getPerimeter() {
       Perimetr = (SideA+SideB)*2;
       return Perimetr;
    }

    double Surface;

    @Override
    public double getArea() {
        Surface = SideA * SideB ;
        return Surface;
    }

    double SideA;
    double SideB;

    public Rectangle(double sideA, double sideB) {
        SideA = sideA;
        SideB = sideB;
    }
    public String getType() {
        String name = "rectangle";
        return name ;
    }
}
