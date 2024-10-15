package com.workout;
public class LinearSearch {
    private int linearSearch(int[] arr, int target){
        int num = 10;
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (target == element){
                return index;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 7, 88, 44, 33, 87, 70, 12, 3, 35, 6};
        LinearSearch search = new LinearSearch();
        System.out.println(search.linearSearch(arr, 69));

    }
}
