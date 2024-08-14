package com.String;

public class ToLowerCase {
    public static void main(String[] args) {
        String s ="LOVe";
        System.out.println(toLoerCase(s));

    }
    static String toLoerCase(String s){
        s = s.toLowerCase();
        return s;
    }
}

