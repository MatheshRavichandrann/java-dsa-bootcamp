package com.practice;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // Array of Primitive
        int[] arr = new int[5];

        // taking input from user
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        //  print array using toString

        System.out.println(Arrays.toString(arr));


        //print the array elements using array

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

        System.out.println();

        // for each loop
        for (int num : arr) { //for every element in the array print the element
            System.out.print(num + " "); //here num represents element of the array
        }


        // Array of Object
        String[] str = new String[5];
        for (int i = 0; i < str.length; i++) {
            str[i] = scn.next();
        }
        System.out.println(Arrays.toString(str));

    }
}
