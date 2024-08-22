package com.bitwiseOperator;
public class NoOfDigits {
    public static void main(String[] args) {
        int n = 9876; // Number to find the number of digits for
        int base = 2; // Base (binary in this case)

        // // Calculating the number of digits in base 2
        int ans = (int) (Math.log(n) / Math.log(base)) + 1;

        System.out.println(ans);
    }
}

/*

        No.of digits = [log_base (n)] + 1;
       1 => log_base (n) = log(n) / log(base)
       1 => then add +1 to it


 */
