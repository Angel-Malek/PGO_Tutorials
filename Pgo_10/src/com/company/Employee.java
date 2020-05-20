package com.company;

public class Employee extends Person {


    String companyName;
    double hireDate;
    double salary;

    public Employee(String firstname, String lastname, double birthdayYear, String companyName, double hireDate, double salary) {
        super(firstname, lastname, birthdayYear);
        this.companyName = companyName;
        this.hireDate = hireDate;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
    public double getJobSeniority(){
        double salarySenior = 10;
        return salarySenior;
    }
}
