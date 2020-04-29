package com.company;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /*
        List<Room> toilet = new LinkedList<>();
        Room Toilet = new Room(20);
        List<Room> kitchen = new LinkedList<>();
//  House one = new House("Sasanki",toilet);
        House One = new House("Sasanki", toilet);
        One.addRoom(toilet);
        One.getRoomlist(toilet);
        One.addRoom(kitchen);
        System.out.println(One.getroom());


         */
        Room toilet = new Room(40);
        List<Room> Toilet = new LinkedList<>();
        Toilet.add(toilet);

        House.CreateHouse("Sasnki",Toilet);
     //   System.out.println( я тут хочу вывести комнаты командой гетрумлис (любой из всех) а не одна не вызываеться);



    }
}
