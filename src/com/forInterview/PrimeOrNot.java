package com.forInterview;

public class PrimeOrNot {
    public static void main(String[] args) {
        System.out.println(isPrime(7));
    }

    static boolean isPrime(int n){
        if (n <= 1){
            return false;
        }

        int c = 2;
        while (c * c <= n){
            if (n % c == 0){
                return false;
            }
            c++;
        }
        return true;
    }
}
