package com.practice;

import java.util.Arrays;

public class PassingValuesInFunctionUsingArray {
    public static void main(String[] args) {
        int[] nums = {2, 5, 7, 8};
        System.out.println(Arrays.toString(nums));
        change(nums); // calling the method and passing the value
        System.out.println(Arrays.toString(nums)); // since the both nums and arr reference variabls pointing to the same value, the change will also impact to the arr as well.

    }
    static void change(int[] arr){ //it'll get the {2, 5, 7, 8} as value
        arr[0] = 11; // change the 0 th index as 11.
    }
    // the both arr and nums pointing to the same object.
    // we can change arrays values as we want thats why arrays are Mutable.
}
