package com.Maths;
// Euclidean Algorithm
public class GCD_LCM {
    public static void main(String[] args) {
        System.out.println(gcd(4, 8));
        System.out.println(lcm(2, 7));
    }
    static int gcd(int a, int b){
        if (a == 0){
            return b;
        }
        return gcd(b%a, a);
    }

    static int lcm(int a, int b){
        return  a * b / gcd(a, b);
    }
}

/*
    GCD (Greatest Common Divisor) Formula :
    GCD(a, b) = GCD(b%a, b);

        Where:
        a and b are the two integers.
        % represents the modulus operation, which gives the remainder when a is divided by b.
        The algorithm continues to apply this formula recursively until b becomes 0. At this point, the GCD is the value of a.


    LCM (Least Common Multiple )Formula :
    LCM(a, b) = (a * b) / GCD(a, b)
        Where:

        a and b are the two integers.
        GCD(a, b) is the Greatest Common Divisor of a and b.

 */
