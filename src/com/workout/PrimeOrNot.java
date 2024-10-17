package com.workout;
public class PrimeOrNot {
    private boolean isPrimeOrNot(int num){
        if (num <= 1){
            return false;
        }

        int div = 2;
        while (div * div <= num){
            if (num / div == 0){
                return false;
            }
            div++;
        }
        return true;
    }

    public static void main(String[] args) {
        PrimeOrNot not = new PrimeOrNot();
        System.out.println(not.isPrimeOrNot(7));
    }
}
