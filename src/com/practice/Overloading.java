package com.practice;

import java.util.Arrays;

public class
Overloading {
    public static void main(String[] args) {
        fun(30);
        fun("zoro");
        int ans = sum(10,20);
        int ans1 = sum(20,10,20);
        System.out.println(ans);
        System.out.println(ans1);
        demo(36, 66, 69);
        demo("Ryuk", "Light");
    }
    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String s){
        System.out.println(s);
    }

    static int sum(int a, int b){
        return a + b;
    }
    static int sum(int a, int b, int c){
        return a + b +c;
    }

    static void demo(int ...i){
        System.out.println(Arrays.toString(i));
    }

    static void demo(String ...j){
        System.out.println(Arrays.toString(j));
    }
}
