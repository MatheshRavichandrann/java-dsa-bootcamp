    package com.recursion;
    import java.util.Arrays;
    public class Bubble {
        public static void main(String[] args) {
            int[] arr = {5, 3, 8, 4, 2};
//            bubble(arr, arr.length-1, 0);
//            System.out.println(Arrays.toString(arr));
            bbl(arr, arr.length-1, 0);
            System.out.println(Arrays.toString(arr));

        }

        static void bubble(int[] arr, int length, int index){
            if (length == 0){
                return;
            }
            if (index < length){
                // Swap arr[col] and arr[col + 1]
                if (arr[index] > arr[index+1]){
                    int temp = arr[index];
                    arr[index] = arr[index+1];
                    arr[index+1] = temp;
                }
                // Move to the next column
                bubble(arr, length, index+1);
            }else {
                // Move to the next row (decrease the row size)
                bubble(arr, length-1, 0);
            }
        }


        static void bbl(int[] arr, int length, int index){
            if (length == 0){
                return;
            }
            if (index < length){
                if (arr[index] > arr[index+1]){
                    //Swap
                    int temp = arr[index];
                    arr[index] = arr[index+1];
                    arr[index+1] = temp;
                }
                bbl(arr, length, index+1);
            }else {
                bbl(arr, length-1, 0);
            }
        }
    }
