package com.company;

import org.w3c.dom.ls.LSOutput;

public class Address {
    String country;
    String city;
    int postalCode;
    String streetname;
    int appartmentNumber;


    public Address(String country) {
        this.country = country;
    }

    public Address(String country, String city) {
        this.country = country;
        this.city = city;
    }

    public Address(String country, String city, int postalCode) {
        this.country = country;
        this.city = city;
        this.postalCode = postalCode;
    }

    public Address(String country, String city, int postalCode, String streetname) {
        this.country = country;
        this.city = city;
        this.postalCode = postalCode;
        this.streetname = streetname;
    }

    public Address(String country, String city, int postalCode, String streetname, int appartmentNumber) {
        this.country = country;
        this.city = city;
        this.postalCode = postalCode;
        this.streetname = streetname;
        this.appartmentNumber = appartmentNumber;
    }

    public String createAddress(String country, int postalCode) {
        return String.format("Country %s, postal code %d", country, postalCode);
    }

    public String createAddress(String country, String city, int postalCode) {
        return String.format("Country %s, postal code %d", country, postalCode);
    }

    public String createAddress(/*String country, String city, int postalCode, String streetname, int appartmentNumber*/) {
        return String.format("Country %s,City %s, postal code: %d, Street name %s, Appartment number %d", country, city, postalCode, streetname, appartmentNumber);
    }

    //не вдуплило что нужно делать с этим??? но вроде работает и так и сяк, на любой выбор
}
