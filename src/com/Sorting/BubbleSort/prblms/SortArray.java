package com.Sorting.BubbleSort.prblms;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] arr = {74, 45, 66, 34, 12, 89, 4, 5, 2, 1};
        sort(arr);
        System.out.println(Arrays.toString(arr ));
    }

    static void sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i ; j++) {
                if (arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
}
