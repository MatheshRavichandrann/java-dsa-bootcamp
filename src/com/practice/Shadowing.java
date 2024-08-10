package com.practice;

public class Shadowing {
    static  int x = 80; // this will be shadowed at line 9
    public static void main(String[] args) {
        System.out.println(x); // x=90
        int x ; //the class variable at line 4 shadowed by this
//      System.out.println(x); //scope will begin when the value initialized
        x = 40; //x=40
        System.out.println(x);
        fun();
    }
    static void fun() {
        System.out.println(x);
    }

}
