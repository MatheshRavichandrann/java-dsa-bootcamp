package com.recursion;
import java.util.Arrays;
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        // {1, 4, 3, 2, 5}
        sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr, int low, int high){
        if (low >= high){ // Base case: When the array segment has one or no elements
            return;
        }

        int start = low;
        int end = high;
        int mid = start + (end - start) / 2;
        int pivot = arr[mid];

        while (start <= end){
            while (arr[start] < pivot){
                start++;  // Move start pointer to the right until an element >= pivot is found
            }

            while (arr[end] > pivot){
                end--;   // Move end pointer to the left until an element <= pivot is found
            }

            if (start <= end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        // Recursively sort the left and right partitions
        sort(arr, low, end);  // Sort the left side of the partition
        sort(arr, start, high);  // Sort the right side of the partition
    }
}
