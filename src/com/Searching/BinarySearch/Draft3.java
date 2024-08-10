package com.Searching.BinarySearch;

public class Draft3 {
    public static void main(String[] args) {
        int[] arr = {0, 2, 4, 6, 2, 0};
        System.out.println(mountain(arr));

    }

    static int mountain(int[] arr){
        int start =- 0;
        int end = arr.length-1;

        while (start < end){
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid+1]){
                end = mid;
            }else {
                start = mid + 1;
            }
        }
        return start;
    }

}
