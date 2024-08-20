package com.bitwiseOperator;

public class OddEven {
    public static void main(String[] args) {
        int n = 22;
        boolean ans = isOdd(n);
        if (ans){
            System.out.println("its odd num");
        }else {
            System.out.println("its even num");
        }

    }
    static boolean isOdd(int n){
        return (n & 1) == 1; // if you don't know this have look at notes.
    }
}
