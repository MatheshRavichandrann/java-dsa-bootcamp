package com.forInterview;

public class Amstrong {
    public static void main(String[] args) {
        int n = 153;
        System.out.println(isAmstorng(n));
    }

    static boolean isAmstorng(int n){
        int correct = n;
        int sum = 0 ;
        while (n > 0){
            int rem = n % 10;
            n = n / 10;
            sum = sum + rem*rem*rem;
        }
         return correct == sum;
    }
}
