package com.Problems;

import java.util.Arrays;

public class SwapUsingArray {
    public static void main(String[] args) {
        int[] arr = {1, 3 , 23 , 9 , 800};
        System.out.println("Before swapping :"+Arrays.toString(arr));
        swap(arr, 0, 4);
        System.out.println("After swapping :"+Arrays.toString(arr));
    }
    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
