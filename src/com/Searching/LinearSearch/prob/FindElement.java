package com.Searching.LinearSearch.prob;

public class FindElement {
    public static void main(String[] args) {
        int[] nums = {2, 32, 43, 8, 9, 88, 2, -83, -3, 28};
        int target = 88;
        System.out.println(find(nums, target));
    }

    static int find(int[] arr, int target){
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target){
                return index;
            }
        }
        return -1;
    }
}
