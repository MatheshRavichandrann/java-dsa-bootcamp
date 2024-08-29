package com.recursion;
// https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
public class Steps {
    public static void main(String[] args) {
        System.out.println(steps(41));
    }

    static int steps(int n){
        return helper(n, 0);
    }

    static int helper(int n, int step){
        if (n == 0){
            return step;
        }
        if (n % 2 == 0){
            return helper(n/2, step+1);
        }
        return helper(n-1, step+1);
    }
}
