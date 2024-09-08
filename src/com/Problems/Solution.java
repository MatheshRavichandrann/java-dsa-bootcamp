package com.Problems;
// https://leetcode.com/problems/sort-an-array/ 
public class Solution {
    public int[] sortArray(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
        return nums;
    }

    private void quickSort(int[] arr, int low, int high) {
        if (low >= high) {
            return; // Base case: single element or no element
        }

        int start = low;
        int end = high;
        int pivot = arr[low + (high - low) / 2]; // Choosing the middle element as the pivot

        while (start <= end) {
            // Move the start pointer to the right until an element >= pivot is found
            while (arr[start] < pivot) {
                start++;
            }

            // Move the end pointer to the left until an element <= pivot is found
            while (arr[end] > pivot) {
                end--;
            }

            if (start <= end) {
                // Swap elements at start and end pointers
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }

        // Recursively sort the left and right partitions
        quickSort(arr, low, end);  // Left side
        quickSort(arr, start, high);  // Right side
    }
}
