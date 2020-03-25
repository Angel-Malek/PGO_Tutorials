package com.company;


public class Main {

    public static void main(String[] args) {
        //testing
        User A = new User("Angle", "Malek", "a@gmail.com", "1234567");
        User B = new User("obama@gmail.com"); //guest
        B.setLastName("Nada");
        B.setName("Abu");
        B.setPassword("123");
        boolean Guest = B.UserGuest();
        System.out.println("is user a guest: " + Guest); //now my user is registered

        User C = new User("ChineseBabyBitedByBat.com@gmail.com"); // -2nd guest

        Product Coronavirus = new Product("Coronavirus", 0, 001, 1000000);
        Product Hamburger = new Product("Hamburger", 10, 002);
        Product БлокПетраПорошенка = new Product("ВсеФигняДавайПоНовой", 0, 003, 10);

        //testing Quantity meter

        Hamburger.setQuantity(-2);
        long Quantity = Hamburger.getQuantity();
        System.out.println("quantity is: " + Quantity);

        // working i think so

        Coronavirus.setQuantity(5);
        БлокПетраПорошенка.setPrice(5);

        double Price = БлокПетраПорошенка.getPrice();
        double CoronavirusQantity = Coronavirus.getQuantity();

        System.out.println("Price is " + Price + "" + " quantity " + CoronavirusQantity);


        //evrything works


    }
}
