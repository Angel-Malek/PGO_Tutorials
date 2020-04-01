package com.company;

public class Products {
    String Name;
    double price;
    int ProductCode;
    int NumOfItems;

    public Products(String name, double price, int productCode, int numOfItems) {
        Name = name;
      this.price = price;
       this.ProductCode = productCode;
        this.NumOfItems = numOfItems;
    }
    Products apples = new Products("яблоки",10,10,10);

    public Products(String name) {
        this.Name = name;
    }
    Products Apple = new Products ("apple", 10, 10, 10);
    Products Banana = new Products("banana",9,9,9);


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getProductCode() {
        return ProductCode;
    }

    public void setProductCode(int productCode) {
        ProductCode = productCode;
    }

    public int getNumOfItems() {
        return NumOfItems;
    }

    public void setNumOfItems(int numOfItems) {
        NumOfItems = numOfItems;
    }





}

