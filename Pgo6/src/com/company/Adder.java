package com.company;

import java.math.BigDecimal;
import java.util.List;


public class Adder {

    public void add(int firstArg, int secondArg) {
        System.out.println("Taking as arguments two variables of type int");
        System.out.println("firstArg value is: " + firstArg);
        System.out.println("secondArg value is: " + secondArg);
        System.out.println("adding of both: " + firstArg + secondArg);
    }


    public static void add(List<BigDecimal> bigDecList) {
        System.out.println("Taking as argument a list of BigDecimal objects");
        for (BigDecimal value : bigDecList) {
            System.out.println("foreach value is: " + value);
        }
    }


}


