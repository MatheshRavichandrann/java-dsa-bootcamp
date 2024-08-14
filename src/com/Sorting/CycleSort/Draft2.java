package com.Sorting.CycleSort;

public class Draft2 {
    public static void main(String[] args) {
        int[] arr = {3, 4, 2, 2, 1};
        System.out.println(fd(arr));

    }

    static int fd(int[] arr){
        int i = 0;
        while (i < arr.length){
            if (arr[i] != i + 1){
                int correct = arr[i] - 1;
                if (arr[i] != arr[correct]){
                    swap(arr, i, correct);
                }
                else {
                    return arr[i];
                }
            }else {
                i++;
            }
        }
        return -1;
    }

    static void swap(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
