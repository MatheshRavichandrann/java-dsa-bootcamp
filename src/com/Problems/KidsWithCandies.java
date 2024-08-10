package com.Problems;
import java.util.ArrayList;
import java.util.List;

public class KidsWithCandies {
    public static void main(String[] args) {
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;
        System.out.println(kidsWithCandies(candies, 3));

    }

    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies){
//        int n = candies.length;
//        List<Boolean> result = new ArrayList<>();
//        int maxCandy = 0;
//
//        // find the max value
//        for (int i=0; i<n; i++){
//            maxCandy = Math.max(maxCandy, candies[i]);
//        }
//
//        // compare the max value with other
//        for (int i=0; i<n; i++){
//            if ((candies[i] + extraCandies) >= maxCandy){
//                result.add(i, true);
//            }
//            else {
//                result.add(i, false);
//            }
//        }
//        return result;


        int maxCandies = Integer.MIN_VALUE;
        List<Boolean> result = new ArrayList<>();

        // Find the maximum number of candies
        for (int candy : candies) {
            if (candy > maxCandies) {
                maxCandies = candy;
            }
        }

        // Determine if each kid can have the maximum candies with extraCandies
        for (int candy : candies) {
            result.add(candy + extraCandies >= maxCandies);
        }

        return result;

    }
}
