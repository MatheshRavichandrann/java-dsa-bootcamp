package com.bitwiseOperator;

public class MagicNumber {
    public static void main(String[] args) {

        int n = 6;
        int ans = 0;
        int base = 5;
        while(n > 0){
            int last = n & 1;
            n = n >> 1;
            ans += last * base;
            base = base * 5;
        }
        System.out.println(ans);
    }
}

/*

juz make the n as binary and do,
we're taking 6 here, 6 in binary 110

            5^3   5^2   5^1
            1     1     0

            ans = (5^3 + 5^2)
            ans = 150.


 */
