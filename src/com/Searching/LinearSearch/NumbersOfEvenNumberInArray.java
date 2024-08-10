// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
// leetcode
package com.Searching.LinearSearch;
// use debugger for clear understanding
public class NumbersOfEvenNumberInArray {
    public static void main(String[] args) {
        int[] nums = {12, 345, 22, 6,7896};
        System.out.println(findNumbers(nums));
    }
    // break array into single elements with the use of enhanced for loop
    static int findNumbers(int[] nums){
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }
    // check the number id even or not
    static boolean even(int num) {
        int numberOfDigits = digits(num);

        return numberOfDigits % 2 == 0; // it's enhanced.
          // same logic without if-else statment.
//        if (numberOfDigits % 2 ==0){
//            return true;
//        }
//        return false;
    }
    // count number of digit in a number
    static int digits(int num) {
        if (num < 0){  // for negative number
            num = num * -1;
        }

        int count = 0;
        while (num > 0){
            count++;
            num = num / 10;
        }
        return count;
    }
}
