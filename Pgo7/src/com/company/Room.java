package com.company;

import java.util.ArrayList;
import java.util.List;

public class Room {
    int RoomArea;
    List<Furniture> FurnitureList;
    //List<Furniture> FurnitureIT;

    public Room(int roomArea, List<Furniture> furnitureList) {
        RoomArea = roomArea;
        FurnitureList = furnitureList;
    }

    public void GetVat(List<Furniture> Furniture) {
        double sum = 0;

        for (int i = 0; i < FurnitureList.size(); i++) {
            System.out.println("Furniture value is " + FurnitureList.get(i).gettingprice());
            sum+= FurnitureList.get(i).gettingprice();
        }
        System.out.println("sum of all furniture with VAT: "+sum);;
    }

}
