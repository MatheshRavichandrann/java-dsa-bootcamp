package com.recursion.String;
import java.util.ArrayList;
public class Permutations {
    public static void main(String[] args) {
        // Uncomment the following lines to test different methods
        // permutations("", "abc");

        // Get and print all permutations of "abc"
        // ArrayList<String> ans = permutationList("", "abc");
        // System.out.println(ans);

        // Get and print the count of permutations for "abcd"
        System.out.println(permutationCount("", "abcd"));
    }

    /**
     * Prints all permutations of the input string.
     *
     * @param p Current permutation being built.
     * @param up Remaining characters to be used.
     */
    static void permutations(String p, String up) {
        // Base case: If no remaining characters, print the current permutation
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);  // Get the first character of the remaining characters
        for (int i = 0; i <= p.length(); i++) {
            // Insert the character at every possible position
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            permutations(f + ch + s, up.substring(1));
        }
    }

    /**
     * Returns a list of all permutations of the input string.
     *
     * @param p Current permutation being built.
     * @param up Remaining characters to be used.
     * @return List of all permutations.
     */
    static ArrayList<String> permutationList(String p, String up) {
        // Base case: If no remaining characters, return a list with the current permutation
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);  // Get the first character of the remaining characters
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 0; i <= p.length(); i++) {
            // Insert the character at every possible position and collect results
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            ans.addAll(permutationList(f + ch + s, up.substring(1)));
        }
        return ans;
    }

    /**
     * Returns the count of all permutations of the input string.
     *
     * @param p Current permutation being built.
     * @param up Remaining characters to be used.
     * @return Count of all permutations.
     */
    static int permutationCount(String p, String up) {
        // Base case: If no remaining characters, return 1 (one permutation)
        if (up.isEmpty()) {
            return 1;
        }

        int count = 0;
        char ch = up.charAt(0);  // Get the first character of the remaining characters
        for (int i = 0; i <= p.length(); i++) {
            // Insert the character at every possible position and accumulate count
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            count += permutationCount(f + ch + s, up.substring(1));
        }
        return count;
    }
}
