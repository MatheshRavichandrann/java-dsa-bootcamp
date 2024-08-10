package com.practice;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
//        int n = scn.nextInt();
//        boolean sol = armstrong(n);
//        if (sol){                        // this will print the given num is armstrong or not
//            System.out.println("Its Armstrong");
//        }
//        else System.out.println("Its Not Armstrong");
        for (int i = 100; i < 1000 ; i++) { // this for loop will print the armstrong numbers in between 100 - 1000
            if (armstrong(i)){
                System.out.print(i+ " ");

            }
        }
    }

    static boolean armstrong(int n){
        int original = n; // in the end we're going to check the original and sum are same
        int sum = 0;
        while (n>0){
            int rem = n % 10; // it'll give the reminder . so that we can cube it and add. if you give 153 as input when we perform modules 153%10 it'll give the last digit as ans (3) next 15%10 = 5 next 1%10 = 1 ;
            n = n / 10; // it'll remove the last digit tho its int after the (15.3) will omit and after this n consider as 15 after again doing this n will consider as 1 after that n>0 condition gets fails and loop will end also used to end the loop
            sum = sum + rem*rem*rem; // we've to find the cubes and add it together
        }
        return sum == original; // it would check whether the sum and original are same. if its same it'll pass boolean value as true . or else it'll pass boolean value as fale.
    }

}
