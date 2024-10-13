package com.workout;
public class BinarySearch {
    private int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (target < arr[mid]){
                end = mid - 1;
            } else if (target > mid) {
                start = mid + 1;
            } else return mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearch search = new BinarySearch();
        int[] arr = {2, 23, 34, 45, 67, 79, 88, 98, 99};
        System.out.println(search.binarySearch(arr, 99));
    }
}
