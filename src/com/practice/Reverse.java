package com.practice;
public class Reverse {
    public static void main(String[] args) {
        int num = 123456; //were gonna reverse this num
        int ans = 0; // initially the ans is 0
        while (num > 0){
            int rem = num%10; // it'll give the reminder
            num = num/10; //it's used to end the loop. in last iteration 1/10 = 0.1 then (n>0) condition will get failed
            ans = ans * 10 + rem; //it'll add the number one byb one. 0*10+6=6  6*10+5=65  65*10+4=654  654*10+3=6543  6543*10+2=65432  65432*10+1=654321
        }
        System.out.println(ans);

    }
}
