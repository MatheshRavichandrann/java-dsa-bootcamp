package com.Searching.BinarySearch.Matrix;
// if you don't understand the code watch this vide. start from 22:41  https://www.youtube.com/watch?v=enI_KyGLYPo&list=PL9gnSGHSqcnr_DxHsP7AW9ftq0AtAyYqJ&index=16
import java.util.Arrays;
public class SortedMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(Arrays.toString(search(arr, 5)));

    }

    static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target){
        while(cStart <= cEnd){
            int mid = cStart + (cEnd - cStart) / 2;
            if (matrix[row][mid] == target){
                return new int[] {row, mid};
            }
            if (matrix[row][mid] > target){
                cStart = mid + 1;
            } else if (matrix[row][mid] < target) {
                cEnd = mid - 1;
            }
        }
        return new int[] {-1, -1};
    }

    static int[] search(int[][] matrix, int target){
        int rows = matrix.length;
        int col = matrix[0].length;

        if (rows == 1){
            return binarySearch(matrix, 0, 0, col-1, target);
        }

        int rStart = 0;
        int rEnd = rows -1;
        int cMid = col / 2;

        while (rStart < rEnd - 1){
            int mid = rStart + (rEnd - rStart) / 2;
            if (matrix[mid][cMid] == target){
                return new int[]{mid, cMid};
            }
            if (matrix[mid][cMid] < target){
                rStart = mid;
            } else if (matrix[mid][cMid] > target) {
                rEnd = mid;
            }
        }
        // now we have two rows

        if (matrix[rStart][cMid] == target){
            return new int[]{rStart, cMid};
        }

        if (matrix[rStart + 1][cMid] == target){
            return new int[]{rStart + 1, cMid};
        }


        // Search 1st in half
        if (target <= matrix[rStart][cMid -1]){
            return binarySearch(matrix, rStart, 0, cMid -1, target);
        }
        // Search 2nd in half
        if (target >= matrix[rStart][cMid +1] && target <= matrix[rStart][col -1]){
            return binarySearch(matrix, rStart, cMid +1, col-1, target);
        }
        // Search 3rd in half
        if (target <= matrix[rStart + 1][cMid -1]){
            return binarySearch(matrix, rStart +1, 0, cMid -1, target);

        }
        // Search 4th in half
        else {
            return binarySearch(matrix, rStart +1, cMid +1, col-1, target);
        }
    }
}
