package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class Category {
    String name;
   ArrayList<String> Products ;

    public Category(){};

    public Category(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getProducts() {
        return Products;
    }

    public void setProducts(ArrayList<String> products) {
        Products = products;
    }

    public Category(String name, ArrayList<String> Product ) {
        this.name = name;
        this.Products = Products;
    }


    public void setProducts(String apple) {
    }
//   Products products = new Products();
//Products.add(Products);
//Products.add(new Products());
    //адд нихуя не работает нихуя вообще с этими йобаными стригами ареями листами не работает это плный пиздец какойто как я все это манал


}
