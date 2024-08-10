package com.practice;

public class Swap {
    public static void main(String[] args) {
        int a , b;
        a = 10;
        b = 20;
        System.out.println(a);
        System.out.println(b);

        int x = 70;
        int y = 77;
        System.out.println(x);
        System.out.println(y);

        //Swap Values
        int temp =a;
        a = b;
        b = temp;
        System.out.println(a);
        System.out.println(b);

        int temp1= x;
        x = y;
        y = temp1;
        System.out.println(x);
        System.out.println(y);


    }
}
