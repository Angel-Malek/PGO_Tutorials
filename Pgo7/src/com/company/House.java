package com.company;

import java.util.List;

public class House {
    String Adress ;
    List<Room> RoomList;
//building house //
    private House(String adress, List<Room> roomList) {
        Adress = adress;
        RoomList = roomList;
    }

    public static void CreateHouse(String adress, List<Room> roomList){

    }
//Adding room//
    public void AddRoom(List<Room> roomList) {
     //   RoomList.add
    }


    public void gt (List<Room> RoomList) {
        for (int i = 0; i < RoomList.size(); i++) {
            System.out.println("Furniture value is " + RoomList.get(i));
            //sum+= FurnitureList.get(i).gettingprice();
        }
    }




}
