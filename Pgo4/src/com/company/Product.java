package com.company;

public class Product {
    String NameProduct;
    double Price;
    double Code;
    long Quantity;


    public Product(String nameProduct, double price, double code, long quantity) {
        NameProduct = nameProduct;
        Price = price;
        Code = code;

        Quantity = quantity;


    }

    public Product(String nameProduct, double price, double code) {
        NameProduct = nameProduct;
        Price = price;
        Code = code;
    }

    public String getNameProduct() {
        return NameProduct;
    }

    public void setNameProduct(String nameProduct) {
        NameProduct = nameProduct;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public double getCode() {
        return Code;
    }

    public void setCode(double code) {
        Code = code;
    }

    public long getQuantity() {
        if (Quantity >= 0) {
            return Quantity;
        } else {
            Quantity = 0;
            //  do {Quantity =+ 1;
            //  }while (Quantity < 0 );

            return Quantity;
        }
    }

    public void setQuantity(long quantity) {
        Quantity = quantity;
    }
}
