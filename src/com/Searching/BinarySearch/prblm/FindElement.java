package com.Searching.BinarySearch.prblm;

public class FindElement {
    public static void main(String[] args) {
        int[] arr = {1, 23, 34, 45, 67, 79, 88, 98, 99};
        int target = 88;
        System.out.println(find(arr, target));
    }

    static int find(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (target == arr[mid]){
                return mid;
            }else if (target < arr[mid]) {
                end = mid - 1;
            }else if (target > arr[mid]){
                start = mid + 1;
            }
        }
        return -1;
    }

}
