package com.recursion;

public class ReverseFullyRecursion {
    public static void main(String[] args) {

        System.out.println(rev2(1234));
    }

    static int rev2(int n){
        int digit = (int) (Math.log10(n)) + 1; // used to find how many digits are there in the n
        return helper(n, digit);
    }

    private static int helper(int n, int digit) {
        if (n % 10 == n){
            return n;
        }
        int rem = n % 10;
        return rem * (int) (Math.pow(10, digit-1)) + helper(n/10, digit-1); // 4 * 10^3 + helper(123 ; 3) , 3 * 10^2 + helper(12 , 2) ; 2 * 10^1 + helper(1 , 1)
    }

}
