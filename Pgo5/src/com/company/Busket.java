package com.company;

import java.util.ArrayList;

public class Busket {
    String Name;
    ArrayList<Products> Products;

    public Busket(){}
    public Busket(String name) {
        Name = name;
    }

    public Busket(String name, ArrayList<com.company.Products> products) {
        Name = name;
        Products = products;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public ArrayList<com.company.Products> getProducts() {
        return Products;
    }

    public void setProducts(ArrayList<com.company.Products> products) {
        Products = products;
    }





}
