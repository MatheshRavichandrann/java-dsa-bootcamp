package com.workout;
import java.util.Arrays;
public class SelectionSort {
    private int[] selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int start = 0;
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, start, last);
            swap(arr, maxIndex, last);
        }
        return arr;
    }

    private int getMaxIndex(int[] arr, int start, int end){
        int max = start;
        for (int i = start; i <= end ; i++) {
            if (arr[i] > arr[max]){
                max = i;
            }
        }
        return max;
    }

    private void swap(int[] arr, int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }


    public static void main(String[] args){
        SelectionSort sort = new SelectionSort();
        int[] arr = {5, 7, 4, 78, 23, 87, 23, 45, 1, 98, 69};
        System.out.println(Arrays.toString(sort.selectionSort(arr)));
    }
}
