package com.Sorting.CycleSort;
import java.util.Arrays;
public class CycleSortAlgorithm {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        cycleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    // NOTE : this one, only work on 1-N array.
    static void cycleSort(int[] arr){
        int i = 0;
        while (i < arr.length){
            int correct = arr[i] - 1; // the elemnt should be in the correct index. arr[i] -1 : arr[0] -1: 1 -1 = 0. which means the 0th element's value must be 1. if its not then swap it. it'll go till arr.length-1. likely 4th index must hold the value of 5.
            if (arr[i] != arr[correct]){
                swap(arr, i, correct);
            }else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int first, int second){ // normal swapping nothings new
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
