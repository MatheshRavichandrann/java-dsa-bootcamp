package com.practice;

public class ArrayEnhancedForLoop {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        for(int num : arr){
            System.out.print(num + " ");
        }
        try {
            System.out.println(arr[5]); // itll throw ArrayIndexOutOfBoundsException. index start with 0
        }
        catch (ArrayIndexOutOfBoundsException e){
            //e.printStackTrace();
            System.out.println("Errorrr");
        }

    }
}
