package com.recursion;
public class PalindromeUsingRecursion {
    public static void main(String[] args) {
        System.out.println(isPalindrome(1221));
    }

    static boolean isPalindrome(int n){
        return n == rev(n);
    }

    static int rev(int n){
        int digit = (int) (Math.log10(n)) + 1; // Number of digit
        return helper(n, digit);
    }

    static int helper(int n, int digit){
        if (n%10 == n){
            return n;
        }

        int rem = n % 10;
        return rem * (int) (Math.pow(10, digit - 1)) + helper(n/10, digit - 1);
    }
}
