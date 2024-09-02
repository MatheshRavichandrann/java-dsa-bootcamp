package com.recursion;
import java.util.Arrays;
public class SelectionUsingRecursion {
    public static void main(String[] args) {
        int[] arr = {4, 5, 3, 6, 1, 2};
        selec(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr, int row, int col, int max) {
        // Base case: If no more rows are left, the array is sorted
        if (row == 0) {
            return;
        }

        // Recursively find the maximum element in the current row
        if (col < row) {
            if (arr[col] > arr[max]) {
                selection(arr, row, col + 1, col);  // Update max index
            } else {
                selection(arr, row, col + 1, max);  // Continue searching
            }
        } else {
            // Swap the maximum element found with the last element in the current row
            int temp = arr[max];
            arr[max] = arr[row - 1];
            arr[row - 1] = temp;

            // Recursive call for the next row, reducing the unsorted portion
            selection(arr, row - 1, 0, 0);
        }
    }

    static void selec(int[] arr, int row, int col, int max){
        if (row == 0){
            return;
        }
        if (col < row){
            if (arr[col] > arr[max]){
                selec(arr, row, col+1, col);
            }else {
                selec(arr, row, col+1, max);
            }
        }else {
            int temp = arr[max];
            arr[max] = arr[row-1];
            arr[row-1] = temp;
        }
        selec(arr, row-1, 0, 0);
    }
}
