package com.recursion;
public class PalindromeNormal {
    public static void main(String[] args) {
        int i = 23456;
        String val = String.valueOf(i);
        System.out.println(palindrome(val));

    }

    static boolean palindrome(String str){

        str = str.toLowerCase();
        for (int i = 0; i < str.length() / 2; i++) {
            int start = str.charAt(i);
            int end = str.charAt(str.length() -1 - i);
            if (start != end){
                return false;
            }
        }
        return true;
    }

}
