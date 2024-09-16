package com.forInterview;
import java.util.Scanner;
public class NQueens {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the board: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("The size of the board must be a positive integer.");
            return;
        }

        boolean[][] board = new boolean[n][n];
        System.out.println("Number of solutions: " + queens(board, 0));
    }

    // Recursive function to place queens
    static int queens(boolean[][] board, int row) {
        if (row == board.length) {
            display(board);
            System.out.println();
            return 1;
        }
        int count = 0;
        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = true;  // Place the queen
                count += queens(board, row + 1);  // Recur to place the next queen
                board[row][col] = false;  // Backtrack
            }
        }
        return count;
    }

    // Check if it's safe to place a queen at board[row][col]
    private static boolean isSafe(boolean[][] board, int row, int col) {
        for (int i = 0; i < row; i++) {
            if (board[i][col]) {
                return false;
            }
        }
        int maxLeft = Math.min(row, col);
        for (int i = 0; i <= maxLeft; i++) {
            if (board[row - i][col - i]) {
                return false;
            }
        }
        int maxRight = Math.min(row, board.length - col - 1);
        for (int i = 1; i <= maxRight; i++) {
            if (board[row - i][col + i]) {
                return false;
            }
        }
        return true;
    }

    // Display the current board configuration
    private static void display(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean element : row) {
                System.out.print(element ? "Q " : "X ");
            }
            System.out.println();
        }
    }
}
