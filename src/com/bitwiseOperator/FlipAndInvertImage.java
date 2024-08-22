package com.bitwiseOperator;
//https://leetcode.com/problems/flipping-an-image/description/
import java.util.Arrays;

class FlipAndInvertImage {
    public static void main(String[] args) {
        int[][] image = {
                {1,1,0},
                {1,0,1},
                {0,0,0}
        };
        System.out.println(Arrays.deepToString(flipAndInvertImage(image)));
    }

    static int[][] flipAndInvertImage(int[][] image) {
        for (int[] row : image){
            // Reverse the array
            for (int i = 0; i < (image[0].length + 1) / 2; i++) {
                // Swap
                int temp = row[i] ^ 1; // inverse it using XOR (^)
                row[i] = row[image[0].length - i - 1] ^ 1; // inverse it using XOR (^)
                row[image[0].length - i - 1] = temp;
            }
        }
        return image;
    }
}
/*
        Answer
        [1, 0, 0],
        [0, 1, 0],
        [1, 1, 1]
*/