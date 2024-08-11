package com.Problems;
// https://leetcode.com/problems/number-of-good-pairs/description/
public class NumberOfGoodPairs {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 1, 3};
        int ans = numIdenticalPairs(arr);
        System.out.println(ans);

    }

    static int numIdenticalPairs(int[] nums){
       int count = 0;
        for (int i = 0; i < nums.length ; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i < j && nums[i] == nums[j]){
                    count++;
                }
            }
        }
        return count;
    }
}
