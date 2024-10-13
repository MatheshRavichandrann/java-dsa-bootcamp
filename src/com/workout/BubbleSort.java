package com.workout;
import java.util.Arrays;
public class BubbleSort {
    private int[] bubbleSort(int[] arr){
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = !true;
            for (int j = 1; j < arr.length-i; j++) {
                if (arr[j] < arr[j-1]){
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = !false;
                }
            }
            if (!swapped) break;
        }
        return arr;
    }

    public static void main(String[] args) {
        BubbleSort sort = new BubbleSort();
        int[] arr = {5, 4, 2, 7, 55, 44, 12, 89, 34, 11, 69, 36};
        System.out.println(Arrays.toString(sort.bubbleSort(arr)));
    }
}
