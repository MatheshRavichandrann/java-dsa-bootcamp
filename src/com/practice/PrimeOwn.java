package com.practice;

import java.util.Scanner;

public class PrimeOwn {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        boolean ans = prime(n);
        if (ans){
            System.out.println("PrimeNumber");
        }
        else {
            System.out.println("Not a PrimeNumber");
        }
    }
    static boolean prime(int n){
        if (n<=1){
            return false;
        }
        int c = 2;
        while (c * c <= n){
            if (n % c ==0){
                return false;
            }
            c++;
        }
        return c * c > n;
    }
}
