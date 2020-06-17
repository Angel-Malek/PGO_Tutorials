package com.company;

import java.util.*;

public class Main {
    private static int[] intArray = new int[10];

    public static void main(String[] args) {

        //        firstTaskExecute();      //1st task
        //   secondTaskExecute();         //2nd task
        //        thirdTaskExecute();    //3rd task
        //      fourthTaskExecute();    //4th task
    }

    private static void firstTaskExecute() {

        //увидел на ютубе как это классно все выглдяит

        Car car1 = new Car("Audi A7", 2010);
        Car car2 = new Car("BMW X5", 2017);
        Car car3 = new Car("Audi A6", 2011);
        Car car4 = new Car("Audi Q8", 2015);
        Car car5 = new Car("Audi A5", 2012);
        Car car6 = new Car("Audi RS7", 2014);
        Car car7 = new Car("BMW 328", 2016);
        Car car8 = new Car("Audi A4", 2013);
        Car car9 = new Car("BMW 328 GT", 2016);
        Car car10 = new Car("BMW X7", 2019);
        List<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        cars.add(car6);
        cars.add(car7);
        cars.add(car8);
        cars.add(car9);
        cars.add(car10);

        System.out.println("---------Before sorting--------");
        for (Car car : cars) {
            System.out.println(car);
        }

        Collections.sort(cars);
        System.out.println("---------After sorting--------");
        for (Car car : cars) {
            System.out.println(car);
        }
    }

    private static void secondTaskExecute() {
        Item item1 = new Item(1, "Hat");
        Item item2 = new Item(2, "Jacket");
        Item item3 = new Item(3, "Boots");
        Item item4 = new Item(4, "Red cucumber");
        Item item5 = new Item(5, "Oil tank");
        Item item6 = new Item(6, "Whiskey");

        List<Item> items = new ArrayList<>();
        items.add(item1);
        items.add(item2);
        items.add(item3);
        items.add(item4);
        items.add(item5);
        items.add(item6);

        for (int i = 0; i < items.size(); i++) {
            items.get(i).show();
        }
        Map<Integer, String> map = new HashMap();
        for (Item item : items) {
            map.put(item.getId(), item.getName());
        }

        for (Map.Entry entry : map.entrySet()) {
            System.out.println("KEY: " + entry.getKey() + " VALUE: " + entry.getValue());
        }
    }

    private static void thirdTaskExecute() {
        Item item1 = new Item(1, "Microwave");
        Item item2 = new Item(2, "Phone");
        Item item3 = new Item(3, "Bananas");
        Item item4 = new Item(4, "Carrot");
        Item item5 = new Item(5, "LPG");
        Item item6 = new Item(6, "Whiskey");
        Item item7 = new Item(7, "Rock & Roll");
        Item item8 = new Item(8, "Work");
        Item item9 = new Item(9, "Manifest");
        Item item10 = new Item(10, "Little horse");

        List<Item> items = new ArrayList<>();
        items.add(item1);
        items.add(item2);
        items.add(item3);
        items.add(item4);
        items.add(item5);
        items.add(item6);
        items.add(item7);
        items.add(item8);
        items.add(item9);
        items.add(item10);
        List<Item> subList = items.subList(0, 5);
        Set<Item> itemSet = new HashSet<>(subList);

        for (Item item : itemSet) {
            System.out.println(item.getName());
        }
    }

    public static void fourthTaskExecute() {
        fillArray();
    }


    private static int readNumber() throws NegativeNumberException {
        System.out.println("Please enter value:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number < 0) {
            throw new NegativeNumberException("Negative numbers are not allowed");
        } else {
            return number;
        }
    }

    private static void fillArray() {
        for (int i = 0; i < intArray.length; i++) {
            try {
                intArray[i] = readNumber();
            } catch (NegativeNumberException e) {
                intArray[i] = 0;
                e.printStackTrace();
            }
        }

        //for see array entries
        System.out.println("Entered user values:");
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }
}











