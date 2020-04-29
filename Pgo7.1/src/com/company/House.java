package com.company;

import java.util.List;

public class House  {


    public List<Room> Roomlist;
    String adress;


    private House(String adress, List<Room> RoomList) {
        this.adress = adress;
        RoomList = RoomList;
    }
  //  House a= new House("sas",null);

    public static void CreateHouse(String adress, List<Room> RoomList)  {
        //taking adress as string parametr - ok
        // returning house object что это вообще значит
        // this.adress = adress;
        //  this.Roomlist = RoomList;
        //     House number = new House(this.adress,this.Roomlist);
    }

    public void addRoom(List<Room> RoomList) {
        Roomlist = RoomList;
    }


    public List getroom(/*List<Room> Roomlist*/) {
        return Roomlist;
    }

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


}
