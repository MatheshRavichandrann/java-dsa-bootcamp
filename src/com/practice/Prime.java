package com.practice;
import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        boolean ans =isPrime(n);
        //System.out.println(ans);
        if (ans){
            System.out.println("PrimeNumber");
        }
        else {
            System.out.println("Not a PrimeNumber");
        }
    }
    static boolean isPrime(int n){
        if(n <= 1){ // if n=1  1 is not a prime number
            return false;
        }
        int c = 2; // we've already counted 1 so were starting from 2 // lets take 7 as n
        while (c * c <= n){ // it's a square root formula to reduce time by half // 2*2<=7 4<=7 true
            if(n % c == 0){ // if the given number quotient is 0 it's not a prime //7%2=
                return false; // so it returns as false
            }
            c++; //if the quotient is 1 then the c irritated to c=c+1 ; c=2 ;
        }
        return c * c > n; // if the n is quotient is not 0 and c is square root greater than n then its prime
    }
}
