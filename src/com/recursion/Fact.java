package com.recursion;

public class Fact {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println("Factorial of "+i+" is : "+fact(i));

        }
//        System.out.println(fact(5));
    }

    static int fact(int n){
        if (n <= 1){
            return 1;
        }
        return n * fact(n - 1);
    }
}
