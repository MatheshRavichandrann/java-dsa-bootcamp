package com.Problems;
public class StringReversal {
    public static String reverseString(String s) {
        char[] arr = s.toCharArray(); // Convert the string to a character array
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            swap(arr, start, end); // Swap characters at the start and end indices
            start++; // Move the start index to the right
            end--; // Move the end index to the left
        }

        return new String(arr); // Convert the character array back to a string
    }

    // Helper method to swap characters in the array
    private static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        String s = "hello";
        String reversed = reverseString(s);
        System.out.println("Reversed string: " + reversed); // Output: "olleh"
    }
}
