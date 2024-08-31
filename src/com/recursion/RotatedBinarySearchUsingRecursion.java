package com.recursion;

import java.util.Arrays;
import java.util.Scanner;

public class RotatedBinarySearchUsingRecursion {
    public static void main(String[] args) {
//        Scanner scn = new Scanner(System.in);         IGNORE THE LINES 8 TO 22. THESE AREN'T IMPORTANT, I'M JUZ PLAYING IN THESE LINES.
//        int[] arr = new int[7]; // 5 6 8 9 1 2 3
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = scn.nextInt();
//        }
////        int[] arr = {5, 6, 8, 9, 1, 2, 3};
//        System.out.println(Arrays.toString(arr));
//        System.out.print("Enter number to find the index : ");
//        int target = scn.nextInt();
//        int ans = search(arr, target, 0, arr.length-1);
//        if (ans < 0){
//            System.out.println("The number you give is not in the array");
//        }else {
//            System.out.println("The given number lies in index num : " + ans);
//        }

        int[] arr1 = {5, 6, 8, 9, 1, 2, 3};
        System.out.println(search(arr1, 8, 0, arr1.length-1));

    }

//    static int search(int[] arr, int target, int start, int end){
//        if (start > end){
//            return -1;
//        }
//
//        int mid = start + (end - start) / 2;
//        if (arr[mid] == target){
//            return mid;
//        }
//
//        if (arr[start] <= arr[mid]){
//            if (target >= arr[start] && target <= arr[mid]){
//                return search(arr, target, start, mid-1);
//            }else {
//                return search(arr, target, mid+1, end);
//            }
//        }
//
//        if (target >= arr[mid] && target <= arr[end]){
//            return search(arr, target, mid+1, end);
//        }
//        return search(arr, target, start, mid-1);
//    }>

    static int search(int[] arr, int target, int start, int end){
        if (start > end){
            return -1;
        }

        int mid = start + (end - start) / 2;
        if (arr[mid] == target){
            return mid;
        }

        if(arr[start] <= arr[mid]){
            if (target >= arr[start] && target <= arr[mid]){
                return search(arr, target, 0, mid-1);//end = mid -1;
            }else {
                return search(arr, target, mid+1, end); //start = mid +1;
            }
        }

        if (target >= arr[mid] && target <= arr[end]){
            return search(arr, target, mid+1, end); //start = mid +1;
        }else {
            return search(arr, target, start, mid-1);//end = mid -1;
        }
    }

}
