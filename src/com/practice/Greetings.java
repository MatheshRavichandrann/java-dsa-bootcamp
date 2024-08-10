package com.practice;

import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        greetings();
        int ans = sum1(20,30);
        System.out.println(ans);

        int ans1 = sum2(50,40);
        System.out.println(ans1);

        String sss = greet("Mosi mossss");
        System.out.println(sss);

        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Your Name :");
        String namee = scn.next();
        String name = MyName("Hello " + namee);
        System.out.println(name);

        String PCNM =PcName("HP");
        System.out.println(PCNM);
    }

    static String PcName(String p) {
        String PCN = p;
        return PCN;

    }

    static String MyName(String hello) {
        String name1= hello;
        return name1;
    }


    static void greetings(){
            System.out.println("Hello world");
       }

       static int sum1(int a, int b){
            int sum = a + b;
            return sum;
       }

       static int sum2(int a, int b){
        int sum = a - b;
        return sum;
       }

       static String greet(String s){
        String ss = s;
        return ss;
       }
}
