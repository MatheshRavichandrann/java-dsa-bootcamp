package com.practice;

import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        int[] arr = {1,2,34,56};
        Change(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void Change(int[] nums) {
        nums[0] = 88; // if you make a change to the object via this reference variable same object will be changed
    }
}
