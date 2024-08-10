package com.Searching.LinearSearch;

public class FindingMaxValueIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {19, 12, -888}
        };
        System.out.println(maximum(arr));
        System.out.println(maximum_enhanced(arr));
    }
    static int maximum(int[][] arr) {
        int max = Integer.MIN_VALUE; //it'll give a minimum value. likely a -87654876 number
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] > max){
                    max = arr[row][col];
                }
            }
        }
        return max;
    }

    // Same logic with Enhanced for loop
    static int maximum_enhanced(int[][] arr) {
        int max = Integer.MIN_VALUE; //it'll give a minimum value. likely a -87654876 number
        for (int[] val : arr) {
            for (int elements : val) {
                if (elements > max) {
                    max = elements;
                }
            }
        }
        return max;
    }
}
