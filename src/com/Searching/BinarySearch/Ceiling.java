package com.Searching.BinarySearch;
// juz reapplying the binary search concept
public class Ceiling {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16 ,18};
        int target = 7;
        System.out.println(ceiling(arr, target));
    }
    // we're applying the same binarySearch algorithm here. in the end we're returning start

    // return the index of smallest number which is >= target
    static int ceiling(int[] arr, int target){
        if (target > arr[arr.length-1]){
            return -1; // it'll execute when we give target which is greater than the greatest number in array.
        }
        int start = 0;
        int end = arr.length-1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            if (target > arr[mid]){
                start = mid + 1;
            }
            else if (target < arr[mid]) {
                end = mid - 1;
            }
            else {
                return mid;
            }
        }
        return start; // the while loop violated with start > end. so the possible answer could be start
    }
}
