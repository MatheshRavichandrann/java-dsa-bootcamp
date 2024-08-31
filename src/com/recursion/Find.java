package com.recursion;
import java.util.ArrayList;
public class Find {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 5, 8};
        System.out.println(find(arr, 5, 0));
        System.out.println(findIndex(arr, 5, 0));
        System.out.println(findIndexFromLast(arr, 5, arr.length-1));
        // Static list method
        findAllIndex(arr, 5, 0);
        System.out.println(list);



        // Dynamic list method
        ArrayList<Integer> list1 = new ArrayList<>();
        System.out.println(findAllIndex(arr, 5, 0, list1));

        // Creating ArrayList in every function call
        System.out.println(finALlIndexApproach2(arr, 5, 0));

    }

    // Method to find if the target exists in the array
    static boolean find(int[] arr, int target, int index ){
        if (index == arr.length-1){
            return false;
        }

        return arr[index] == target || find(arr, target, index+1);
    }

    // Method to find the first index of the target
    static int findIndex(int[] arr, int target, int index){
        if (index == arr.length){
            return -1;
        }
        if (arr[index] == target){
            return index;
        }
        else {
            return findIndex(arr, target, index+1);
        }
    }

    // Method to find the last index of the target by searching backward
    static int findIndexFromLast(int[] arr, int target, int index){
        if (index == -1){
            return -1;
        }
        if (arr[index] == target){
            return index;
        }
        else {
            return findIndexFromLast(arr, target, index-1);
        }
    }

    // Static list for findAllIndex
    static ArrayList<Integer> list = new ArrayList<>();
    // Method to find all indices of the target and store in the static list
    static void findAllIndex(int[] arr, int target, int index){
        if (index == arr.length){
            return;
        }
        if (arr[index] == target){
            list.add(index);
        }
        findAllIndex(arr, target, index+1);
    }

    // Method to find all indices of the target and store in a dynamic list passed as an argument
    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list1){
        if (index == arr.length){
            return list1;
        }
        if (arr[index] == target){
            list1.add(index);
        }
        return findAllIndex(arr, 5, index+1, list1);
    }

    static ArrayList<Integer> finALlIndexApproach2(int[] arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<>();

        if (index == arr.length){
            return list;
        }
        if (arr[index] == target){
            list.add(index);
        }

        ArrayList<Integer> ansFromBelowCalls = finALlIndexApproach2(arr, 5, index+1);
        list.addAll(ansFromBelowCalls);
        return list;
    }
}
