package com.String;
public class Palindrome {
    public static void main(String[] args) {
        String str = "Malayalam";
        System.out.println(isPalindrome(str));
    }

    static boolean isPalindrome(String str){

        if (str == null || str.length() == 0){ // juz covering edge cases.
            return false;
        }

        str = str.toLowerCase(); // we're changing all elements to lower case.
        for (int i = 0; i <= str.length() / 2; i++) { // we only need to check /2. if we don't put /2 it'll throw StringIndexOutOfBoundsException
            char start = str.charAt(i);
            char end = str.charAt(str.length() -1 -i); // we're decreasing the end after every integration with -i.
            if (start != end){ // if its palindrome the start and end should be same
                return false;
            }
        }
        return true; // the both start and end element are same till the middle.
    }
}
