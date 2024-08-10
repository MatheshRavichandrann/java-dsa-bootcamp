// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
package com.Searching.BinarySearch;
import java.util.Arrays;
public class        FirstAndLastPosition {
    public static void main(String[] args) {
        int[] nums ={3, 4, 6, 6, 6, 7, 7, 8, 9, };
        int target = 77;
        int[] ans = searchRange(nums, target);
        System.out.println(Arrays.toString(ans));

    }
     static int[] searchRange(int[] nums, int target){
        int[] ans ={-1, -1};
        ans[0] = search(nums, target, true);
        ans[1] = search(nums, target, false);
        return ans;
    }

     static int search(int[] nums, int target, boolean findIndex){
        int ans = -1;
        int start = 0;
        int end = nums.length-1;

        while (start <= end){
            int mid = start + (end - start) / 2;
            if (target < nums[mid]){
                end = mid -1;
            } else if (target > nums[mid]) {
                start = mid +1;
            }
            else {
                // Potential answer found
                ans = mid;
                if (findIndex){
                    end = mid -1;
                }else {
                    start = mid +1;
                }
            }
        }
        return ans;
    }
}
