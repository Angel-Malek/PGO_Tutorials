package com.company;

public class Manager extends Employee {
    double bonus;

    public Manager(String firstname, String lastname, double birthdayYear, String companyName, double hireDate, double salary, double bonus) {
        super(firstname, lastname, birthdayYear, companyName, hireDate, salary);
        this.bonus = bonus;
    }

    @Override
    public double getSalary() {
     double Stonks = salary+bonus ;
     return  Stonks;
    }

    @Override
    public String toString() {
     //   return this.firstname + this.lastname + this.companyName +this.bonus +this.birthdayYear +this.salary +this.hireDate ;
        return "Manager with last name: " + this.lastname +" and age " +getAge() + " has salary " + getSalary();
    }
}
