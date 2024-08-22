package com.bitwiseOperator;

public class NoOfSetBits { // which means number of 1s
    public static void main(String[] args) {
        int n = 4567890;
        int count = 0;
        while (n > 0){
            if ((n & 1) == 1){  // Check if the least significant bit is set
                count++;
            }
            n = n >> 1;  // Right shift by 1 bit
        }
        System.out.println(count);
    }
}

/*

    1001  (binary of 9)
    0001  (binary of 1)
  & ----
    0001  (result of n & 1)

 */
