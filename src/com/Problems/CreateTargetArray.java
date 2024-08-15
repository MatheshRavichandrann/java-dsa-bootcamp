package com.Problems;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class CreateTargetArray {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        System.out.println(Arrays.toString(createTargetArray(nums, index)));
    }
    public static int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> ans = new ArrayList<>();
        // Iterate through the nums array
        for (int i = 0; i < nums.length; i++) {
          // Insert the element from nums into the position specified by index
         ans.add(index[i], nums[i]);
    }
    // Convert List<Integer> to int[]
        int[] result = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
          result[i] = ans.get(i);
        }
        return result;
    }
}