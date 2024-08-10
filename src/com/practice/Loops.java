package com.practice;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        // print numbers from 1 to n
//        Scanner scn = new Scanner(System.in);
//        int n = scn.nextInt();
//        for (int num = 1; num <= n ; num++) {
//            System.out.print(num +" ");
//        }


        // print hello world n times using for loop
//        Scanner sn = new Scanner(System.in);
//        int z = sn.nextInt();
//        for (int numm = 1; numm <=z ; numm++) {
//            System.out.println(numm +") "+"Hello world");
//        }


//        // print 1 to 5 using while loop
//        int num = 1;
//        while (num<=5){
//            System.out.println(num);
//            num += 1;
//        }


        // do-while loop
        int n = 1;
        do {
            System.out.println("Hello world");
            //n++;
        } while (n != 1); //it'll execute at least one time even tho condition is false


    }
}
