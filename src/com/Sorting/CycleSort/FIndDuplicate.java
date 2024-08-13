package com.Sorting.CycleSort;
public class FIndDuplicate {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 2};
        System.out.println(findDuplicate(arr));
    }
    // if you don't understand how its works, juz copy paste this code in chatgpt and ask how its works.
    static int findDuplicate(int[] arr){
        int i = 0;
        while(i < arr.length){

            if (arr[i] != i + 1){ // we're checking if the element = element
                int correct = arr[i] -1; // we're starting from 1
                if (arr[i] != arr[correct]){
                    swap(arr, i, correct);
                }else {
                    return arr[i]; // if the arr[i] == arr[correct] which means the both element are same. it could possibly be the duplicate element.
                }
            }else {
                i++; // if elements are in the correct index. it'll move to next index.
            }
        }
        return -1;
    }


    static void swap(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

}
