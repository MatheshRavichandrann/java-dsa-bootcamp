package com.Sorting.CycleSort;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {3,0,1};
        System.out.println();
        System.out.println(missingNumber(arr));

    }

    static int missingNumber(int[] nums){
        int i = 0;
        while (i < nums.length){
            int correct = nums[i]; // cause it starting from 0th index
            if (nums[i] < nums.length && nums[i] != nums[correct]){ // ith index element shouldn't cross the arr.length. it'll end up in ArrayIndexOutOfBoundException
                swap(nums, i, correct);
            }else {
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));

        // Search for thr missing number
        // case 1
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index){
                return index;
            }
        }
        // case 2
        return nums.length; // which means we're retuning the N. the missing number might be n
    }

    static void swap(int[] arr, int start, int second){
        int temp = arr[start];
        arr[start] = arr[second];
        arr[second] = temp;

    }
}
