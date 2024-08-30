package com.recursion;

public class Fibonacci {
    public static void main(String[] args) {
//        int ans = fibo(3);
//        System.out.println(ans);
//        System.out.println(fiboFormula(4));
        System.out.println(fibo(10));
    }

    static long fiboFormula(int n){
//        return (int) ((Math.pow(((1 + Math.sqrt(5)) / 2), n) - (Math.pow(((1 - Math.sqrt(5)) / 2), n)) / Math.sqrt(5)));
        return (long) (Math.pow((1 + Math.sqrt(5)) / 2, n) / Math.sqrt(5));
    }

    // F(n) = F(n - 1) + F(n - 2)
    static int fibo(int n){
        // Base Condition
        if (n < 2){
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
}
