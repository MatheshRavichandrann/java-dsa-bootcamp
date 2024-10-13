package com.Searching.BinarySearch;

public class BinarySearchImplementation {
    public static void main(String[] args) {
        int[] arr = {2, 23, 34, 45, 67, 79, 88, 98, 99};
        int target = 1;
        int ans = binarySearch(arr, target);
//        System.out.println(ans);
        if (ans == -1){ // cause I'm only returning the -1 haha (if we cant find element)
            System.out.println("Item not exist");
        }
        else {
            System.out.println("Item Exist in "+ans+"th index");

        }
    }
    // it'll only work on sorted array
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
         while (start <= end){

             // first find the middle element
//           int mid = (start + end) / 2; // might be possible that the (start + end) exceeds the range of integer
             int mid = start + (end - start) / 2; // it's the same 14 th line formula in a better way.
             if (target < arr[mid]){
                 end = mid - 1;
             }
             else if (target > arr[mid] ) {
                 start = mid + 1;
             }
             else { // basically the if and if-else gets false. which means the target == mid or target != mid.
                 // ans found
                 return mid; // it'll execute if the target is == mid.
             }
             // we can also write the  else like else-if (target == mid) {return mid;} that's unnecessary
         }
         return -1; // it'll execute if the target != mid.
    }
}
