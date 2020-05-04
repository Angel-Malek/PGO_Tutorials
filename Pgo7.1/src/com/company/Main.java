package com.company;

import java.util.ArrayList;
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
    /*    Room toilet = new Room(40);
        List<Room> Toilet = new LinkedList<>();
        Toilet.add(toilet);

        House.CreateHouse("Sasnki",Toilet);
     //   System.out.println( я тут хочу вывести комнаты командой гетрумлис (любой из всех) а не одна не вызываеться);

House newHouse = House.CreateHouse("Sasanki",Toilet);
        System.out.println(newHouse.getroom());
       List<Room> Roomlist = new ArrayList<>();
        Roomlist.add(toilet);
        newHouse.addRoom(Toilet);
        System.out.println(newHouse);

        List<Room> HouseRoom = newHouse.getroom();
   //     HouseRoom.add(toilet);
        System.out.println(HouseRoom);
        newHouse.addRoom(Toilet);
        Toilet.add(toilet);
        System.out.println(newHouse.getRoomsList());






     */


        //делаю последний раз не заработает - я блять себя убью
        String homeAddress = "Sasanki";
        House newHouse = House.CreateHouse(homeAddress);
        System.out.println(newHouse.getAddress());
        newHouse.addRoom("Toilet");
        List<String> roomsList = new ArrayList();
        System.out.println(newHouse.getRoomCount()); //одна комната, все мне плевать на мебель и её сумму это все задание один


        roomsList.add("Kitchen");
        roomsList.add("Bathroom");
        roomsList.add("It room");
        newHouse.addRome(roomsList);
        Integer roomCount = newHouse.getRoomCount();
        System.out.println(roomCount);// тепреь 4 комнаты, я сделал задание

    }
}
