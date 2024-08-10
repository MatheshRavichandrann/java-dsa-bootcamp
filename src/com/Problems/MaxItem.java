package com.Problems;

import java.util.Scanner;

public class MaxItem {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] arr = {1, 3, 23, 99, 18, 6, 888};
        System.out.println(max(arr));
        System.out.println(maxRange(arr, 1, 6)); // it'll check in between the index of 1 and 3, index 1 = 3 , index 2 = 23 , index 3 =99.
        // find the max in between the user input.
        System.out.println("Give two range between 0 and 6." + " Don't give other than this if you give you'll end up get ArrayInndexOutOfBoundsException ");
        int st = scn.nextInt(); // line 12 - 14 written by me. if you can't understand this juz ignore this.
        int en = scn.nextInt();
        System.out.println(maxRange(arr, st, en));
    }

    // imagine that array is not empty
    static int max(int[] arr) {
        if (arr.length == 0){
            return -1;
        }
        int maxVal = arr[0]; // we're considering the 0 th index value as max value
        for (int i = 1; i < arr.length ; i++) { // we've already known that the 0 th index, so were iterating from index 1. arr.length will give the length as 5
            if (arr[i] > maxVal){ // it'll check this 1) arr[i] > maxVal : arr[1] > maxVal : 3 > 1 its true. next iteration 2) arr[i] > maxVal : arr[2] > maxVal : 23 > 3 its true. 3)arr[i] > maxVal : arr[3] > maxVal : 9 > 23 its false. 4) arr[i] > maxVal : arr[4] > maxVal : 18 > 23 its false
                maxVal = arr[i]; // maxVal = arr[i] : MaxVal = arr[1] : maxVal = 3. then the MaxVal is updated to 3. 2)  maxVal = arr[i] : MaxVal = arr[2] : maxVal = 23. then the MaxVal is updated to 23.
            }
        }
        return maxVal;
    }

    // Work on edge case here, like array being null
    static int maxRange(int[] arr, int start , int end){
        if(start > end){
            return -1;
        }
        if (arr == null){
            return -1;
        }
        int maxVal = arr[start]; //  maxVal = arr[start] : maxVal = arr[1] : maxVal = 3.
        for (int i = start; i <= end; i++) {  //  int i = start; i <= end :  i = 1; 1 <= 3 condition true; we're going 1st index to 3rd index so that were giving <= . so that we can compare 3rd index with the index itself.
            if (arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

}
