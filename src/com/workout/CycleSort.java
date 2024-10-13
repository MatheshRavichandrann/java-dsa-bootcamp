package com.workout;
import java.util.Arrays;
public class CycleSort {
    private int[] cycleSort(int[] arr){
        int i = 0;
        while (i < arr.length){
            int correct = arr[i] - 1;
            if (arr[correct] != arr[i]){
                swap(arr, i, correct);
            } else i++;
        }
        return arr;
    }

    private void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args) {
        CycleSort sort = new CycleSort();
        int[] arr = {9, 7, 5, 3, 4, 1, 2, 6, 8};
        System.out.println(Arrays.toString(sort.cycleSort(arr)));
    }
}
