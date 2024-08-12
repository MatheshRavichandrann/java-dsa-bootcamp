package com.Sorting.CycleSort;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class FindDisappearedNumbers {
// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 3, 2, 1};
        System.out.println(findDisappearedNumbers(arr));
    }

    static List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while (i < nums.length){
            int correct = nums[i] -1; //it's starting from 1
            if (nums[i] != nums[correct]){
                swap(nums, i, correct);
            }else {
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
        // finding missing number
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index +1){ // 0th index value reload be 1. goes till 7th index value should be 8.
                ans.add(nums[index]+1);
            }
        }
        return ans;
    }

    static void swap(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }


}