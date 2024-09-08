package com.bitwiseOperator;
// Brian Kernighan's Algorithm
// This program finds how many 1 is in the binary of n (1111).
public class SetBits {
    public static void main(String[] args) {
        int n = 15;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(setBits(n));
    }

    private static int setBits(int n) {
        int count = 0;
        while (n > 0){
            count++;
            n = n & (n-1);
        }
        return count;
    }
}
