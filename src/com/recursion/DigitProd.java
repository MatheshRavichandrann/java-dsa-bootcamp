package com.recursion;
public class DigitProd {
    public static void main(String[] args) {
        int ans = prod(132);
        System.out.println(ans);
    }

    static int prod(int n){
        if (n == 0){
            return 1;
        }
        return (n%10) * prod(n/10);
    }
}
