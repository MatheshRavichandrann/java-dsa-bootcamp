package com.Problems;
import java.util.Arrays;
public class BuildArrayFromPermutation {
    public static void main(String[] args) {
        int[] arr = {5,0,1,2,3,4};
        System.out.println(Arrays.toString(bulidArray(arr)));
    }

    static int[] bulidArray(int[] nums){
        int[] ans = new int[nums.length];
        for (int i : nums){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
// Expected Output: [4,5,0,1,2,3]
