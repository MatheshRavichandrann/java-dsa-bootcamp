package com.Searching.BinarySearch;

public class Mountain {
    public static void main(String[] args) {
        int[] arr = {0, 2, 4, 0};
        System.out.println(peakIndexInAMountainArray(arr));

    }
    static int peakIndexInAMountainArray(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while (start < end){ // while the start and end are same the ans could be in the start and end index. if we give <= we cant get the ans, so that we're giving < here.
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid+1]){
                // you're in ascending part of an array
                // this may be the ans, but look at left
                // this why end != mid -1
                end = mid; // since the mid+1 is smaller than the mid we can assume that mid is the large number. after mid there is the decreasing numbers.
            }
            else if((arr[mid] < arr[mid+1])){
                // you're in descending part of an array
                start = mid + 1; // you're in descending part of an array
            }
        }
        // in the end, start == end pointing to the largest number because of the 2 checks above
        // start and end are always trying to find the max element in the above 2 checks
        // hence, when they are juz pointing to juz one element, that is the max one because that is what the checks say
        // more elaboration : at every point of time for start and end, they have the best possible answer till that time
        // and if we're saying that only one item is remaining, hence coz of above line that is the best possible ans.
        return start; // in the end start and end are same we can return both start and end
    }

}
