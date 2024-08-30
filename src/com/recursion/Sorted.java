package com.recursion;
public class Sorted {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(sort(arr, 0));
    }

    static boolean sort(int[] arr, int index){
        if (index == arr.length-1){ // arr[index] == arr[arr.length-1]
            return true;
        }
        return arr[index] < arr[index+1] && sort(arr, index+1);
    }
}
