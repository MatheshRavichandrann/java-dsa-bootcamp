package com.Maths;
public class NewtonSQRT {
    public static void main(String[] args) {
        System.out.print(sqrt(40));
    }
    static double sqrt(double n){
        double x = n; // Initial guess for the square root
        double root;  // Variable to hold the new approximation
        while (true){
            // Update the approximation using Newton's method formula
           root = 0.5 * (x + (n/x));

           // Check if the approximation is close enough to the previous guess
           if (Math.abs(root - x) < 0.5){
               break;
           }
            // Update the guess for the next iteration
           x = root;
        }
        return root;
    }
}

/*

  1) x_new = (x + (n / x)) / 2
  2) x_new = 0.5 * (x + (n/x))     =>  root =  0.5 * (x + (n/x))
  1) & 2)are same.

 */
