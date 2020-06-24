package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Admin extends Employee {
    private List<Employee> employeeList = new ArrayList();

    public Admin(String name, String surname, Random id) {
        super(name, surname);

    }

    public Employee createEmployee(String name, String surname){
        Employee newEmployee = new Employee(name, surname);
        employeeList.add(newEmployee);
        return newEmployee;
    }
    public void removeEmployee (Employee newEmployee){
        employeeList.remove(newEmployee);
    }




}
