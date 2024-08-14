package com.Sorting.BubbleSort;
import java.util.Arrays;
public class BubbleSortAlgorithm {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        bubble(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void bubble(int[] arr){
        // run the steps n-1 times
        boolean swapped; // juz for knowing if its already sorted or not. // we can remove the boolean if we want.-
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            // for each step, the max element come at the last respective index
            for (int j = 1; j < arr.length - i; j++) {
                // swap if the element is smaller than the previous element
                if (arr[j] < arr[j-1]){
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            // if you didn't swap for a particular value of i, it means the array is sorted hence stop the program.
            if (!swapped) break; // its basically  if(swapped == false) { break; } // which means swap should be true. if its false we're giving sorted array as input.
        }
    }
}
