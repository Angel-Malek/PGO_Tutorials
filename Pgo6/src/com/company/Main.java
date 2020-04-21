package com.company;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Multi multi = new Multi();
        multi.twoArgumentMethod(1, 10);
//working trying next shit
        multi.fourIntArgumentMethod(1, 10, 5, 3);
        //working too
        multi.twoArgumentMethod(10.2, 13.2);
//working
        List<Integer> integerList = new ArrayList<>();
        integerList.add(10);
        integerList.add(18);
        integerList.add(3);
        multi.listInt(integerList);
        //работает на 99%

        Multi.twoArgumentMethod(new BigDecimal("1.1"), new BigDecimal("2.2"));


        Adder adder = new Adder();
        adder.add(1, 1);
        //working

        List<BigDecimal> bigDecimalList = new ArrayList<>();
        bigDecimalList.add(new BigDecimal("1.1"));
        bigDecimalList.add(new BigDecimal("1.2"));
        bigDecimalList.add(new BigDecimal("1.3"));
        bigDecimalList.add(new BigDecimal("1.4"));
        bigDecimalList.add(new BigDecimal("1.5"));

        Adder.add(bigDecimalList);

//я короче все вот рип писец за два бала три часа тупо собирание франкенштейна со стаковерфлоу , это прикол какой-то

        Address home = new Address("Ukraine");
        Address homeFriend = new Address("Ukraine", "Kharkiv");
        Address homeMama = new Address("Ukraine", "Kharkiv", 228);
        Address homePapa = new Address("Ukraine", "Kharkov", 228, "Sumskaya");
        Address McDonalds = new Address("Ukraine", "Prypyat", 420, "Puskinskaya", 13);
//у меня комп лагает от всего выше капец помогите

        //  homeMama.createAddress("Kharkiv", 14);
        //   System.out.println(homeMama.postalCode+13); тут я проверял стало ли инт посталкод или стрингом, все еще инт....
        System.out.println(homeMama.createAddress("Slovakia",10));
        System.out.println(McDonalds.createAddress());

    }
}
