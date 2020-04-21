package com.company;

import java.math.BigDecimal;
import java.util.List;

public class Multi {


    // Scanner keyboard = new Scanner(System.in);
    //  int x;
    // int y;
    //  int a;
   /* int b;
    int c;
    int d;
    double xx;
    double yy;
    BigDecimal xxx;
    BigDecimal yyy;

    public static void product(List<Integer> integerList) {

    }

    public Multi(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Multi(int x, double yy) {
        this.x = x;
        this.yy = yy;
    }

    public Multi(double xx, double yy) {
        this.xx = xx;
        this.yy = yy;
    }

    public int multiply(int a, int b){ return a*b;}
    public Multi(int a, int b, int c, int d){
        int i = a * b * c * d;
        return i;}






//  ArrayList<Integer> intArray = new ArrayList<>();
 //   int input = keyboard.nextInt();
   // intArray.add(input);
}


    */
    public void twoArgumentMethod(int firstArg, int secondArg) {
        System.out.println("Accepting as arguments two variables of type int");
        System.out.println("firstArg value is: " + firstArg);
        System.out.println("secondArg value is: " + secondArg);
        System.out.println("------------------------------");
        System.out.println("multiplication: of both " + firstArg * secondArg);
    }

    public void fourIntArgumentMethod(int firstArg, int secondArg, int thirdArg, int forthArg) {
        System.out.println("Accepting arguments are 1st " + firstArg + " 2nd " + secondArg + " 3rd " + thirdArg + " 4th " + forthArg);
        System.out.println("---------------------------");
        System.out.println("multiplication equals: " + firstArg * secondArg * thirdArg * forthArg);
    }

    public void twoArgumentMethod(double firstArg, double secondArg) {
        System.out.println("Accepting as arguments two variables of type int");
        System.out.println("firstArg value is: " + firstArg);
        System.out.println("secondArg value is: " + secondArg);
        System.out.println("------------------------------");
        System.out.println("multiplication: of both " + firstArg * secondArg);
    }

    public void listInt(List<Integer> integerList) {
        for (int i = 0; i < integerList.size(); i++) {
            System.out.println("value is " + integerList.get(i));
        }
        //пиздец как же я ебашил стаковерфлоу ради одной этой фигни, не вдупляю эти листы шо пипец +  я забыл как сохранять из лупа ай и умножать друг на друга но думаю, всеравно никто кроме моих демонов в голове читать это не будет так что мои крики о помощи никто не увидет и все нормас :)
    }

    public static void twoArgumentMethod(BigDecimal firstArgObj, BigDecimal secondArgObj) {
        System.out.println("Accepting two BigDecimal objects as arguments");
        System.out.println("firstArgObj value is: " + firstArgObj);
        System.out.println("secondArgObj value is: " + secondArgObj);
        System.out.println("------------------------------");
        //System.out.println("multiplication: of both " + firstArgObj * secondArgObj);
    }
}


