package com.Sorting.BubbleSort;
import java.util.Arrays;
public class Draft {
    // if you don't understand this one have a look at BubbleSortAlgorithm
    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5};
        int[] arr = {-123, -1, 0, 1, 2, 3, 4, 5, 6, 8, 10, 43}; // 5, 4, 3, 2, 1, 6, 8, 10, 0, -1, -123, 43
        bS(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bS(int[] arr){
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if (!swapped){
                break;
            }

        }
    }
    
}
