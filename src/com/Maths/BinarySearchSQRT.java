package com.Maths;
 // Time : O(log(n))
public class BinarySearchSQRT {
    public static void main(String[] args) {
        int n = 40;  // Number to find the square root of
        int p = 3;  // Number of decimal places of precision
        System.out.printf("%.3f", sqrt(n, p));   // Output the result with 3 decimal place
    }
    // Method to calculate the square root
    static double sqrt(int n, int p){
        int start = 0;
        int end = n;

        double root = 0.0;
        // Binary search to find the integer part of the square root
        while (start <= end){
            int mid = start + (end - start) / 2;

            if (mid * mid == n){
                return mid;
            }
            if (mid * mid > n){
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }

        // Incremental search for fractional part
        double incr = 0.1;   // Start with the first decimal place
        for (int i = 0; i < p; i++) {
            // Increment the root value until the square of the root exceeds n
            while (root * root <= n){
                root += incr;
            }
            // Step back to the previous value where the square of root was less than or equal to n
            root -= incr;
            // Reduce the increment to move to the next decimal place
            incr /= 10;
        }
        return root;
    }
}
