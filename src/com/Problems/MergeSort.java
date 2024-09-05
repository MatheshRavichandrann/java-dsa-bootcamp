package com.Problems;

public class MergeSort {

    // Function to sort the array using merge sort
    public static int[] mergeSort(int[] array) {
        if (array.length <= 1) {
            return array;
        }

        int mid = array.length / 2;

        // Split the array into two halves
        int[] left = new int[mid];
        int[] right = new int[array.length - mid];

        // Copy data to left and right arrays
        System.arraycopy(array, 0, left, 0, mid);
        System.arraycopy(array, mid, right, 0, array.length - mid);

        // Recursively sort both halves
        left = mergeSort(left);
        right = mergeSort(right);

        // Merge the sorted halves and return
        return merge(left, right);
    }

    // Function to merge two sorted arrays
    private static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int i = 0; // Pointer for left array
        int j = 0; // Pointer for right array
        int k = 0; // Pointer for result array

        // Merge the two arrays
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }

        // Copy any remaining elements from the left array
        while (i < left.length) {
            result[k++] = left[i++];
        }

        // Copy any remaining elements from the right array
        while (j < right.length) {
            result[k++] = right[j++];
        }

        return result;
    }

    // Main function to test merge sort
    public static void main(String[] args) {
        int[] array = {38, 27, 43, 3, 9, 82, 10};
        
        System.out.println("Unsorted array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        array = mergeSort(array);

        System.out.println("Sorted array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
