package com.Sorting.SelectionSort;

import java.util.Arrays;

public class Draft {
    public static void main(String[] args) {
        int[] arr = {6, 5, 4, 2, 1};
        selecSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selecSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length -i -1;
            int Max = getMaxIndex(arr, 0, last);
            swap(arr, Max, last);

        }
    }

    static void swap(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    static int getMaxIndex(int[] arr, int start, int end){
        int max = start;
        for (int i = start; i <= end ; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }
}
