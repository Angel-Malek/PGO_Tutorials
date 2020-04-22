package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Furniture frogchair = new Furniture("frogchair", 300);
        frogchair.getPrice();
        frogchair.gettingprice();
//working
        Furniture window = new Furniture("window", 50);


        List<Furniture> Furniture = new LinkedList<>();
        Furniture.add(frogchair);
        Furniture.add(window);
        Room bedroom = new Room(146, Furniture);
        bedroom.GetVat(Furniture);

    }
}
