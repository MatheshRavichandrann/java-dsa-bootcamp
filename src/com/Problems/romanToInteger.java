package com.Problems;
public class romanToInteger {
    public static void main(String[] args) {
        String s = "IV";
        System.out.println(romanToInt(s));
    }
    public static int romanToInt(String s) {
        int result = 0;
        int prevValue = 0;

        for (char c : s.toCharArray()) {
            int currValue = getRomanValue(c);

            if (prevValue < currValue) {
                result += currValue - 2 * prevValue;
            } else {
                result += currValue;
            }

            prevValue = currValue;
        }

        return result;
    }

    private static int getRomanValue(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: throw new IllegalArgumentException("Invalid Roman numeral character: " + c);
        }
    }
}
