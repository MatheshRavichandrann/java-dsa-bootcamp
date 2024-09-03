package com.recursion;
import java.util.Arrays;
public class MergeSort {
    public static void main(String[] args) {
//        int[] arr = {5, 4, 3, 2, 1};
//        int[] ans = mergeSort(arr);
//        System.out.println(Arrays.toString(ans));

        int[] arr = {5, 4, 3, 2, 1};
        mergeSortInplace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));

    }

    static int[] mergeSort(int[] arr){
        if (arr.length == 1){ // Base case: if array has only one element, it is already sorted.
            return arr;
        }

        int mid = arr.length / 2; // Find the middle index of the array.
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));  // Recursively sort the left half.  // from is inclusive, to is exclusive
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length)); // Recursively sort the right half.

        return merge(left, right);  // Merge the sorted halves. 
    }

    static int[] merge(int[] first, int[] second){
        int[] mix = new int[first.length + second.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < first.length && j < second.length){
            if (first[i] < second[j]){
                mix[k] = first[i];
                i++;
            }else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }

        // it may be possible that one of the array is not completed
        // copy the remaining elements

        while (i < first.length){
            mix[k] = first[i];
            i++;
            k++;
        }

        while (j < second.length){
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }


    static void mergeSortInplace(int[] arr, int start, int end){
        if (end - start == 1){
            return;
        }

        int mid = start + (end - start) / 2;

        mergeSortInplace(arr, start, mid);
        mergeSortInplace(arr, mid, end);

        mergeInplace(arr, start, mid, end);
        
    }

    static void mergeInplace(int[] arr, int start, int mid, int end) {
        int[] mix = new int[end - start];
        int i = start;
        int j = mid;
        int k = 0;

        while (i < mid && j < end){
            if (arr[i] < arr[j]){
                mix[k] = arr[i];
                i++;
            }else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i < mid){
            mix[k] = arr[i];
            i++;
            k++;
        }

        while (j < end){
            mix[k] = arr[j];
            j++;
            k++;
        }

        for (int l = 0; l < mix.length; l++) {
            arr[start+l] = mix[l];
        }
    }

}
