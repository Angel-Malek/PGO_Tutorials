package com.company;

public abstract class Person {
    String firstname;
    String lastname;
    double birthdayYear;

    public Person(String firstname, String lastname, double birthdayYear) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthdayYear = birthdayYear;
    }

   public double getAge(){
       double age = 2020 - birthdayYear;
        return age;
    }

}
