package com.Sorting.SelectionSort;

import com.practice.Array;

import java.util.Arrays;

public class SelectionSortAlgorithm {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            // find the max item in the remaining array and swap with correct index
            int last = arr.length -i -1; // we're juz ignoring the right end sorted elements with -i
            int MaxIndex = getMatIndex(arr, 0, last);
            swap(arr, MaxIndex, last);
        }
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first]; // its juz swapping the elements
        arr[first] = arr[second];
        arr[second] = temp;

    }

    static int getMatIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end ; i++) { // the end in this program 4, so we're checking till 4. 4 <= 4
            if (arr[i] > arr[max]){
                max = i; // its juz update the max elements index.
            }
        }
        return max;
    }
}
