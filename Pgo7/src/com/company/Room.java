package com.company;

import java.util.ArrayList;
import java.util.List;

public class Room {
    int RoomArea;
    List<Furniture> FurnitureList;

    public Room(int roomArea, List<Furniture> furnitureList) {
        RoomArea = roomArea;
        FurnitureList = furnitureList;
    }

    public void GetVat(List<Furniture> Furniture) {

        for (int i = 0; i < FurnitureList.size(); i++) {
            System.out.println("Furniture value is " + FurnitureList.get(i));
        }


    }
}
