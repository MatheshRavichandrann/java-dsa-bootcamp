package com.stack.Questions;

import java.util.Arrays;
import java.util.Scanner;

public class TwoStacks {
    public int twoStacks(int x, int[] a, int[] b){
        return twoStacks(x, a, b, 0, 0) - 1;
    }

    private int twoStacks(int x, int[] a, int[] b, int sum, int count){
        if (sum > x){
            return count;
        }

        if (a.length == 0 || b.length == 0){
            return count;
        }

        int ans1 = twoStacks(x, Arrays.copyOfRange(a, 1, a.length), b, sum + a[0], count + 1);
        int ans2 = twoStacks(x, a, Arrays.copyOfRange(b, 1, b.length), sum + b[0], count + 1);

        return Math.max(ans1, ans2);
    }

    public static void main(String[] args) {
        TwoStacks stacks = new TwoStacks();
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int x = scanner.nextInt();
            int[] a = new int[n];
            int[] b = new int[m];
            for (int j = 0; j < n; j++) {
                a[j] = scanner.nextInt();
            }
            for (int j = 0; j < m; j++) {
                b[j] = scanner.nextInt();
            }
            System.out.println(stacks.twoStacks(x, a, b));
        }
    }
}
