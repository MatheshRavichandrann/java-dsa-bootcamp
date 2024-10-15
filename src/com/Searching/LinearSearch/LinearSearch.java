package com.Searching.LinearSearch;

public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = {2, 32, 43, 8, 9, 88, 2, -83, -3, 28};
        int target = -3;
        LinearSearch search = new LinearSearch();
        int ans = search.linearSearch(nums, target);
        System.out.println("The element "+target+" is lies on index no : "+ans);
    }

     int linearSearch(int[] arr, int target) {
        if (arr.length == 0)
        { // we're juz covering the edge
            return -1;
        }
        // run a for loop for iteration
        for (int index = 0; index < arr.length; index++) {
            // check for every element at every index if its equals to target
            int element = arr[index]; // it's storing the arr[i] the value in the element variable
            if(element == target){ // it's checking the element and target are same if its same it'll return the respective index value
                return index;
            }
        }
        // this line will execute if none of the return statements above have executed
        // hence the target not found
        return -1;
    }
}
