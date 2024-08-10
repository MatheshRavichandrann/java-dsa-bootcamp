package com.Searching.LinearSearch;

public class CheckTheElementIsExistOrNot {
    public static void main(String[] args) {
        int[] nums = {};
        int target = -33;
        boolean ans = linearSearch(nums, target);
        System.out.println(ans);

    }
    // Search the target and return true or false
    static boolean linearSearch(int[] arr, int target) {
        if (arr.length == 0){ // we're juz covering the edge
            return false;
        }
        // run a for loop for iteration
        // it's storing the arr[i] the value in the element variable
        for (int element : arr) {
            if (element == target) {
                return true;
            }
        }
        // this line will execute if none of the return statements above have executed
        // hence the target not found
        return false;
    }
}
