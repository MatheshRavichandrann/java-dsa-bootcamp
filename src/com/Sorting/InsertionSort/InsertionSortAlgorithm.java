package com.Sorting.InsertionSort;
import java.util.Arrays;
public class InsertionSortAlgorithm {
    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 1, 2,};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    // it's sorting from the 0 th element to n th element. like index verse, 0-1, 0-2, 0-3, 0-4.
    static void insertionSort(int[] arr){
        for (int i = 0; i < arr.length -1; i++) { // we're looping through n-2 . we can give i <= arr.length -2 also
            for (int j = i+1; j > 0 ; j--) { // j should be i+1. we're traveling i+1 to 0 here which means we're checking left to right. in every iteration j goes and check the left side so we're giving j--
                if (arr[j] < arr[j-1]){ // checking j is less that j-1(the previous element). if its true then we've to swap the two elements.
                    swap(arr, j, j-1 );
                }else {
                    break;
                }
            }
        }
    }

    static void swap(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
// the time complexity in best case O(N)
// the time complexity in worst case O(N^2)
