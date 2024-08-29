package com.recursion;
// https://leetcode.com/problems/palindrome-number/
public class isPalindrome {
    public boolean isPali(int x) {
        // Edge case for negative numbers and multiples of 10 (except 0)
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        // Compute the reversed number
        int reversed = reverseNumber(x);
        
        // Compare the reversed number with the original number
        return x == reversed;
    }

    // Function to reverse the digits of a number
    private int reverseNumber(int n) {
        int digit = (int) (Math.log10(n)) + 1; // Find the number of digits
        return reverseHelper(n, digit);
    }

    // Recursive helper function to reverse the digits
    private int reverseHelper(int n, int digit) {
        // Base case: if n is a single digit, return n
        if (n < 10) {
            return n;
        }

        // Extract the last digit
        int rem = n % 10;
        // Compute the reversed number by appending the last digit
        return rem * (int) Math.pow(10, digit - 1) + reverseHelper(n / 10, digit - 1);
    }
}
