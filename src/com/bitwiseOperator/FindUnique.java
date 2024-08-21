package com.bitwiseOperator;

public class FindUnique {
    public static void main(String[] args) {
        int[] arr = {2, 3 ,3 ,4, 2, 6, 4};
        System.out.println(ans(arr));
    }

    static int ans(int[] arr){
        int unique = 0;

        for (int n : arr){
//            unique = unique ^ n;
            unique ^= n; // shorthand
//          b += a; (line 15 and 16 for reference)
//          b = b + a;
        }
        return unique;
    }
}
