package com.Problems;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayReverse {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();;
        }
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while (start < end){
            swap(arr, start, end); //its juz swapping the first and last vale.
            start++; // start value go like 0, 1, 2,
            end--; // end value go like 4, 3, 2
        }
    }
    // we're using swap method here
    static void swap(int[] arr, int index1, int index2){ // if you don't know how its working have a look at SwapUsingArray Class.
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

}
