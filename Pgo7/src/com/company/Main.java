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


        //making second room

        Furniture table = new Furniture("table", 70);
        Furniture computer = new Furniture("computer", 400);
        Furniture map = new Furniture("map", 10);
        List<Furniture> FurnitureIt = new LinkedList<>();
        FurnitureIt.add(map);
        FurnitureIt.add(table);
        FurnitureIt.add(computer);
        Room Itroom = new Room(40, FurnitureIt);
        Itroom.GetVat(FurnitureIt);

        //made 2nd It room
        //making 3rd room for future tasks

        Furniture toilet = new Furniture("toilet", 79);
        Furniture toiletPaper = new Furniture("toiletPaper", 999);
        List<Furniture> FurnitureToilet = new LinkedList<>();
        FurnitureToilet.add(toilet);
        FurnitureToilet.add(toiletPaper);
        Room Toilet = new Room(40, FurnitureToilet);

        //did it
        /*
        List<Room> RoomOne = new LinkedList<>();
        RoomOne.add(Toilet);
        List<Room> Roomtwo = new LinkedList<>();
        Roomtwo.add(Itroom);
        List<Room> Roomtree = new LinkedList<>();
        Roomtree.add(bedroom);


         */
        // made 3 room arrays
        List<Room> HouseOne = new LinkedList<>();

        House NumberOneHouse = new House("Alchevski st. 141",HouseOne);
        HouseOne.add(bedroom);








    }
}
