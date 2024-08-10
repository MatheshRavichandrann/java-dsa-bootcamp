package com.Searching.BinarySearch;
public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 8, 0, 1, 2};
        int ans = search(arr, 6);
        System.out.println(ans);
    }
    static int search(int[] nums, int target){
        int pivot = findPivot(nums);
        // if you didn't find a pivot, it means the array isn't rotated
        if (pivot == -1){
            // juz do normal binary search
            return binarySearch(nums, target, 0, nums.length-1);
        }
        // if pivot is found , you've found 2 shorted arrays
        if(nums[pivot] == target){
            return pivot;
        }
        if (target >= nums[0]){
            return binarySearch(nums, target, 0, pivot-1);
        }
        return binarySearch(nums, target, pivot+1, nums.length-1);
    }

    static int binarySearch(int[] arr, int target, int start, int end){
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (target < arr[mid]){
                    end = mid -1;
            } else if (target > arr[mid]) {
                start = mid +1;
            }else {
                return mid;
            }
        }
        return -1;
    }


    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length -1;
        while (start <= end){
            int mid = start + (end - start) / 2;
            // 4 case over here
            // case 1
            if (mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            //case 2
            if (mid > start && arr[mid] < arr[mid-1]){
                return mid -1;
            }
            // case 3
            if (arr[mid] <= arr[start]){
                end = mid -1;
            }
            // case 4
            if (arr[mid] >= arr[end]){
                start = mid +1;
            }
        }
        return -1;
    }
}
