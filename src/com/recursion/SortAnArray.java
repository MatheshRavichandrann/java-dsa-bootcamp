package com.recursion;
// https://leetcode.com/problems/sort-an-array/
class SortAnArray {
    public int[] sortArray(int[] nums) {
        // Use the in-place merge sort method
        mergeSortInplace(nums, 0, nums.length);
        return nums;
    }

    // In-place merge sort implementation
    static void mergeSortInplace(int[] arr, int start, int end) {
        if (end - start <= 1) {
            return; // Base case: array is already sorted
        }

        int mid = start + (end - start) / 2;

        // Recursively sort the two halves
        mergeSortInplace(arr, start, mid);
        mergeSortInplace(arr, mid, end);

        // Merge the sorted halves
        mergeInplace(arr, start, mid, end);
    }

    // In-place merge implementation
    static void mergeInplace(int[] arr, int start, int mid, int end) {
        int[] mix = new int[end - start];
        int i = start;
        int j = mid;
        int k = 0;

        // Merge the two sorted halves into mix
        while (i < mid && j < end) {
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements from the left half, if any
        while (i < mid) {
            mix[k] = arr[i];
            i++;
            k++;
        }

        // Copy remaining elements from the right half, if any
        while (j < end) {
            mix[k] = arr[j];
            j++;
            k++;
        }

        // Copy the sorted elements back to the original array
        for (int l = 0; l < mix.length; l++) {
            arr[start + l] = mix[l];
        }
    }
}
