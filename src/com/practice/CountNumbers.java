package com.practice;

public class CountNumbers {
    public static void main(String[] args) {
            int n = 45565; // the 5 is repeating 3 times
            int count = 0; // we're using this for to print how many times its repeating
            while(n>0){
                int rem = n%10; // it'll give the reminder
                if (rem==5){ // it'll check if the reminder and rem is same
                    count++; //if its same count +1 will be added
                }
                n=n/10; //its used to end the loop. in last iteration 1/10 = 0.1 then (n>0) condition will get failed
            }
        System.out.println(count);
    }
}
