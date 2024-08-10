package com.practice;

public class ColNotFixed {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4}, // it'll print like, arr row [0] col [0] , arr row [0] col [1] , arr row [0] col [2] , arr row [0] col [3]
                {5, 6}, // arr row [1] col [0] , arr row [1] col [1]
                {7, 8, 9} // arr row [2] col [0] , arr row [2] col [1]
        };

        for (int row = 0; row < arr.length; row++) { // it'll iterate nineteen the rows
            for (int col = 0; col < arr[row].length; col++) { // arr[row] it'll give arr[0] th length. arr[0] = {1, 2, 3, 4} it has the length of 4. we're using less than 4 here. col < arr[row].length : col < 4
                System.out.print(arr[row][col] + " "); // wonder how its print look at line 6
            }
            System.out.println(); // its juz used to output look like a matrix
        }

    }
}
