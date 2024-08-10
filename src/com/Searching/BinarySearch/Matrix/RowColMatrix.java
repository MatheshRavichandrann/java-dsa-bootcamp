package com.Searching.BinarySearch.Matrix;
import java.util.Arrays;
public class RowColMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {20, 29, 37, 49},
                {33, 34, 38, 50}
        };
        int target = 37;
        System.out.println(Arrays.toString(search(arr, target)));
    }

    static int[] search(int[][] matrix, int target){
        int row = 0;
        int col = matrix.length-1; // we're starting form the 1st row's last column. (0,3) // its 40

        while( row < matrix.length && col >= 0){ // in the start row is 0 while looping throw the loop in the end row become 4 so the row<matrix.length become false and loop will get terminate.  also in the start the row would be matrix.length-1 : 4-1 = 3. which means the last element of the respective row. when we loop over the loop in the end col become -1. so col >= 0 gets false.
            if (matrix[row][col] == target){
                return new int[]{row, col}; // we're sending the value in array form so, we're creating an Array here.
            }
            if (matrix[row][col] < target){
                row ++;
            }
            else if (matrix[row][col] > target){
                col--;
            }
        }
        return new int[] {-1, -1}; // if we aren't find the element then we rerun {-1, -1};
    }
}