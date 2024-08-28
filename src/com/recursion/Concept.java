package com.recursion;

public class Concept {
    public static void main(String[] args) {
        concept(5);
    }
    static void concept(int n){
        if (n == 0){
            return;
        }
        System.out.println(n);
//        concept(n--);     n--: This is a post-decrement operation, the current value of n is passed to the next recursive call before n is decremented. This means that the value of n passed to the next call is always the same as the current one, leading to infinite recursion because n never decreases.
        concept(--n);
    }

}
