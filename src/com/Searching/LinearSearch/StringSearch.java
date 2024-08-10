package com.Searching.LinearSearch;

import java.util.Arrays;

public class StringSearch {
    public static void main(String[] args) {
        String name = "luffy";
        char target = 'z';
        System.out.println(search(name, target));
        System.out.println(search2(name, target));
        System.out.println(Arrays.toString(name.toCharArray())); //
    }
    static boolean search(String str, char target) {
        if (str.length() == 0){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)){ // it'll check the i th index char in String. target == str.charAt(i) : target == str.charAt(0) : y == l if
                // condition gets false so the i++ happens and i value becomes 1, and it'll go till the i < str.length() gets false.
                return true;
            }
        }
        return false;
    }

    // the same logic using foreach loop
    static boolean search2(String str, char target) {
        if (str.length() == 0){
            return false;
        }
       for (char ch : str.toCharArray()){ //  with the use of str.toCharArray() method we're converting String to array so that we can use foreach loop. for each loop iterates 0th index to last index.
           if (ch == target){
               return true;
           }
       }
       return false;
    }
}
