package com.Searching.LinearSearch;
public class SearchInRange {
    public static void main(String[] args) {
        int[] arr ={18, 12, -7, 3, 14, 28};
        int target =12;
        System.out.println(searchInRange(arr, target, 1,3));
    }
    static int searchInRange(int[] arr, int target, int start, int end) {
        if (arr.length == 0){ // we're juz covering the edge
            return -1;
        }
        // run a for loop for iteration
        for (int index = start; index < end; index++) {
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
