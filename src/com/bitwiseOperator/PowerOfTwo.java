package com.bitwiseOperator;

public class PowerOfTwo {
    public static void main(String[] args) {
        int n = 16;
        boolean ans = (n & (n-1))  == 0;
        System.out.println(ans);
    }
}

/*

  16_2 = 10000
  15_2 = 01111

  10000
& 01111
--------
  00000


 */
