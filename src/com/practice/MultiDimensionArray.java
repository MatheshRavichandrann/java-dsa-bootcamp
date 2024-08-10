package com.practice;
import java.util.Arrays;
import java.util.Scanner;
public class MultiDimensionArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        /*
            1 2 3
            4 5 6
            7 8 9
         */
        int[][] arr1 = new int[3][];

        int[][] arr2d = {
                {1, 2, 3},
                {4, 5},
                {6, 7, 8, 9},
        };
        int[][] arr =  new int[3][3];
        //System.out.println(arr.length);
        // Input
        // adding value in 2D array
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = scn.nextInt();
                
            }
        }
        System.out.println();
        // Output
        // Printing the values
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }
        // using toString
        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }

        // Enhanced for loop
        for (int[] a : arr){
            System.out.println(Arrays.toString(a));
        }


    }
}