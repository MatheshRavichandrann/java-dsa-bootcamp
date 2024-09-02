package com.recursion;

import java.util.Arrays;

class SortArrayy {

    public static void main(String[] args) {
        int[] nums = {4, 5, 2, 7, 8, 6, 3};
        int[] ans = sortArray(nums);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] sortArray(int[] nums) {
        bubbleSort(nums, nums.length - 1, 0);
        return nums;
    }

    private static void bubbleSort(int[] arr, int length, int index) {
        if (length == 0) {
            return; // Base case: When no elements are left to sort
        }

        if (index < length) {
            // Compare and swap if necessary
            if (arr[index] > arr[index + 1]) {
                int temp = arr[index];
                arr[index] = arr[index + 1];
                arr[index + 1] = temp;
            }
            // Continue to the next index in the current pass
            bubbleSort(arr, length, index + 1);
        } else {
            // End of current pass; decrease the length of the unsorted portion
            bubbleSort(arr, length - 1, 0); // Reset index and reduce length
        }
    }
}
