package com.Sorting.CycleSort;

class Draft1 {

    public static void main(String[] args) {
        int[] arr ={3,0,1};
        missingNumber(arr);
        System.out.println(missingNumber(arr));
    }


    public static int missingNumber(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int correct = nums[i];
            if(nums[i] < nums.length && nums[i] != nums[correct]){
                swap(nums, i, correct);
            }else{
                i++;
            }
        }

        for(int index = 0; index < nums.length; index++){
            if(nums[index] != index){
                return index;
            }
        }
        return nums.length;
    }

    static void swap(int[] arr, int start, int second){
        int temp = arr[start];
        arr[start] = arr[second];
        arr[second] = temp;
    }
}