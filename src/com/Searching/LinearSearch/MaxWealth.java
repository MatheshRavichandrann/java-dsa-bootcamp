// https://leetcode.com/problems/richest-customer-wealth/description/
//leetcode

package com.Searching.LinearSearch;
public class MaxWealth {
    public static void main(String[] args) {
        int[][] accounts = {
                {1, 2, 3},
                {3, 2, 1},
                {3, 2, 1, 3}
        };
        System.out.println(maximumWealth(accounts));
    }
    static int maximumWealth(int[][] accounts){
        // person = row
        // account = column
        int ans = Integer.MIN_VALUE;
        for (int row = 0; row < accounts.length; row++) {
            // when you take a new column, take a new sum of that row
            int sum = 0;
            for (int col = 0; col < accounts[row].length; col++) {
                sum = sum + accounts[row][col];
            }
            // now we have sum of accounts of person
            // check with overall answer
            if (sum > ans){
                ans = sum;
            }
        }
        return ans;
    }
}
