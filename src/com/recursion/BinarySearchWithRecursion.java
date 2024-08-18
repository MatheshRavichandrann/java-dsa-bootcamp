package com.recursion;
// find the target element's index with BS and Recursion.
public class BinarySearchWithRecursion {
    public static void main(String[] args) {
        int[] arr = {1, 2, 33, 45, 67, 88, 90, 99};
        int target = 55;
        System.out.println(search(arr, target, 0, arr.length - 1));
    }
    static int search(int[] arr, int target, int start, int end){
        if (start > end){
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (arr[mid] == target){
            return mid;
        }
        if (target < arr[mid]){
            return search(arr, target, start, mid - 1);
        }
        return search(arr, target, mid + 1, end);
    }
}
