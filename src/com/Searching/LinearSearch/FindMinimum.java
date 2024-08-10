package com.Searching.LinearSearch;

public class FindMinimum {
    public static void main(String[] args) {
        int[] arr ={18, 12, -7, 3, 14, 28};
        System.out.println(min(arr));
    }
    // assume arr.length != 0
    // return the minimum value in the array
    static int min(int[] arr) {
        int ans = arr[0];
        for (int i = 1; i < arr.length ; i++) { // we already have 0th index as ans. so we're stating the loop from 1 and go till arr.length
            if (arr[i] < ans){ // 1) arr[i] < ans : arr[1] < ans : 12 < 18 condition becomes true and then.  ans = arr[i] :  ans = arr[1] :  ans = 12. 2)  arr[i] < ans : arr[2] < ans : -7 < 12 condition becomes true and then.  ans = arr[i] :  ans = arr[2] :  ans = -7 .it'll iterate the loop end
                ans = arr[i];
            }
        }
        return ans;
    }
}
