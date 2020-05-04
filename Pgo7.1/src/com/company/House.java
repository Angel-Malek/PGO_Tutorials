package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class House {
/*

    public List<Room> Roomlist;
    static int ROOMS_COUNT = 0;
    String adress;


    private House() {
    }
    public static House CreateHouse(String adress, List<Room> RoomList) {
        House newHouse = new House();
        newHouse.seadress(adress);
        return newHouse;
    }
    private void seadress(String adress) {
        this.adress = adress;
    }
    public void addRoom(List<Room> Roomlist) {

        Iterator interroomlist = Roomlist.iterator();
    }

    public List<Object> getRoomsList() {
        return this.Roomlist;
    }



    public void addRome(List<String> roomsList) {
        Iterator var2 = roomsList.iterator();

        while(var2.hasNext()) {
             Room = ()var2.next();
            this.Roomlist.add(com.company.Room);
        }
    }





    public List getroom(/*List<Room> Roomlist*///)

    //  {
    //       return Roomlist;
    //   }
/*
    public void getRoomlistt(List<Room> RoomList) {
        for (int i = 0; i < RoomList.size(); i++) {
            System.out.println("Furniture value is " + RoomList.get(i));
            //sum+= FurnitureList.get(i).gettingprice();
        }
    }

    public void getRoomlist(List<Room> RoomList) {
        for (int i = 0; i < RoomList.size(); i++) {
            System.out.println("Furniture value is " + RoomList.get(i));
            //sum+= FurnitureList.get(i).gettingprice();
        }
    }

    public String getAdress() {
        return adress;
    }

/*
}

 */

    private List<String> RoomsList = new ArrayList();
    static int ROOMS_COUNT = 0;
    String address;


    private House() {
    }


    public static House CreateHouse(String adress) {
        House NewHouse = new House();
        NewHouse.setaddress(adress);
        return NewHouse;
    }

    private void setaddress(String address) {
        this.address = address;
    }

    //одна комната
    public void addRoom(String room) {
        this.RoomsList.add(room);
    }

    //больше чем одна
    public void addRome(List<String> RoomsList) {
        Iterator var2 = RoomsList.iterator();
        while (var2.hasNext()) {
            String room = (String) var2.next();
            this.RoomsList.add(room);
        }
    }

    public Integer getRoomCount() {
        ROOMS_COUNT = this.RoomsList.size();
        return ROOMS_COUNT;
    }
    public static Integer getRoomsCount() {
        return ROOMS_COUNT;
    }

    public List<String> getRoomsList() {
        return this.RoomsList;
    }
    public void setRoomsList(List<String> roomsList) {
        this.RoomsList = roomsList;
    }
    public static void SET_ROOMS_COUNT(Integer ROOMS_COUNT) {
        House.ROOMS_COUNT = ROOMS_COUNT;
    }
    public String getAddress() {
        return this.address;
    }
    public void setAddress(String address) {
        this.address = address;
    }


}
