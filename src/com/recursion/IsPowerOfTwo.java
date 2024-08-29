    package com.recursion;
    //
    class IsPowerOfTwo {
        public static void main(String[] args) {
            boolean ans = isPowerOfTwo(3);
            System.out.println(ans);
        }
        static boolean isPowerOfTwo(int n) {
            return n > 0 && (n & (n - 1)) == 0;
        }
    }