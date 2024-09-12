package com.recursion.String;
import java.util.ArrayList;
public class Dice {
    public static void main(String[] args) {
        // Uncomment the following line to print the combinations for a target sum of 10
        // dice("", 10);

        // Print all dice combinations that sum up to 3
        System.out.println(diceReturn("", 3));
    }

    /**
     * Recursive method to print all possible dice roll combinations that sum up to the target.
     *
     * @param p Current combination of dice rolls represented as a string.
     * @param target The remaining target sum to achieve with dice rolls.
     */
    static void dice(String p, int target) {
        // Base case: If the target is 0, print the current combination
        if (target == 0) {
            System.out.println(p);
            return;
        }

        // Iterate through possible dice values (1 to 6)
        // and recursively call dice with updated parameters
        for (int i = 1; i <= 6 && i <= target; i++) {
            dice(p + i, target - i);
        }
    }

    /**
     * Recursive method to return all possible dice roll combinations that sum up to the target.
     *
     * @param p Current combination of dice rolls represented as a string.
     * @param target The remaining target sum to achieve with dice rolls.
     * @return An ArrayList containing all valid dice roll combinations as strings.
     */
    static ArrayList<String> diceReturn(String p, int target) {
        // Base case: If the target is 0, create a new list with the current combination and return it
        if (target == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        // List to store all combinations for the current state
        ArrayList<String> list = new ArrayList<>();

        // Iterate through possible dice values (1 to 6)
        // and recursively call diceReturn with updated parameters
        for (int i = 1; i <= 6 && i <= target; i++) {
            list.addAll(diceReturn(p + i, target - i));
        }

        // Return the list of combinations
        return list;
    }
}
