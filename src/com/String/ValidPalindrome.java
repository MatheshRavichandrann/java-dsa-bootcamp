package com.String;
// https://leetcode.com/problems/valid-palindrome/description/
class ValidPalindrome {
    public boolean isPalindrome(String s) {
        
        s = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        if (s == null || s.length() == 0){
            return true;
        }

         for (int i = 0; i <= s.length() / 2; i++) { 
            char start = s.charAt(i);
            char end = s.charAt(s.length() -1 -i);
            if (start != end){
                return false;
            }
        }
        return true;

    }
}