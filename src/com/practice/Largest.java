package com.practice;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        // Find the largest number
//        int max = a;
//        if (b > max){
//            max = b;
//        }
//        if (c > max){
//            max = c;
//        }
//        System.out.println(max  );

        // using Math class
        int max = Math.max(c, Math.max(a, b));
        System.out.println("Max : " + max);

    }
}
