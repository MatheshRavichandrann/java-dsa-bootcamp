package com.Searching.BinarySearch;
public class FindElementInAInfiniteArray {
    public static void main(String[] args) {
        int[] arr = {1, 14, 24, 34, 46, 78, 89, 90, 91, 94, 99};
        int target = 34;
        System.out.println(ans(arr, target));
    }

    static int ans(int[] arr, int target){
        // Find the range
        // First start with the box of size 2
        int start = 0;
        int end = 1;

        // condition for target to lie im the range
        while (target > arr[end]){
            int newStart = end +1;
            // double the box value
            // end = end + previous end + sizeof box * 2
            end = end + (end - start +1) * 2;
            start = newStart;
        }
        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] arr, int target, int start, int end){
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (target < arr[mid]){
                end = mid -1;
            } else if (target > arr[mid]) {
                start = mid +1;
            } else {
                return mid;
            }
        }
    return -1;
    }
}