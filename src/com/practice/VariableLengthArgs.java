package com.practice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class VariableLengthArgs {
    public static void main(String[] args) {
        fun(1, 2, 3, 45, 67, 80);
        fun1("zoro", "robin", "luffy", "nami");
        multiple(30, 40, "chopper", "sanji", "brook");

    }
    static void fun(int ...v){ // its basically stores values as array
        System.out.println(Arrays.toString(v));
    }

    static void multiple(int a, int b, String ...v){ // Variable length always comes at the end
        System.out.print(a+" ");
        System.out.print(b+" ");
        System.out.print(Arrays.toString(v));
    }

    static void fun1(String ...s){ // its also stores values as array
        System.out.println(Arrays.toString(s));

    }
}
