package com.Game;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {

        char[][] board = new char[3][3];
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                board[row][col] = ' ';
            }
        }

        char player = 'X';
        boolean gameOver = false;
        Scanner scanner = new Scanner(System.in);

        while (!gameOver){
            int row = 0;
            int col = 0;
            printBoard(board);
            System.out.println("Player " + player + " Enter: ");
           try {
                row = scanner.nextInt();
                col = scanner.nextInt();
           } catch (InputMismatchException e){
               System.out.println("Invalid character. Please enter integers only.");;
               scanner.nextLine();
               continue;
           }

            if (row < 0 || row >= 3 || col < 0 || col >= 3) {
                System.out.println("Invalid input. Please enter values between 0 and 2.");
                continue;
            }


            if (board[row][col] == ' '){
                // place the element
                board[row][col] = player;
                gameOver = haveWon(board, player);
                if (gameOver){
                    System.out.println("Player" + player + " has Won!!");
                }else {
//                    if (player == 'X'){
//                        player = 'O';
//                    }else {
//                        player = 'X';
//                    }
                    player = (player == 'X') ? 'O' : 'X';

                }

            }else {
                System.out.println("invalid move, Try again");
            }
        }
        printBoard(board);
    }

    private static boolean haveWon(char[][] board, char player) {

        // Check the row
        for (int row = 0; row < board.length; row++) {
            if (board[row][0] == player && board[row][1] == player && board[row][2] == player){
                return true;
            }
        }

        // Check for col
        for (int col = 0; col < board[0].length; col++) {
            if (board[0][col] == player && board[1][col] == player && board[2][col] == player){
                return true;
            }
        }

        // Check left Diagonal
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player){
            return true;
        }

        // Check left Diagonal
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player){
            return true;
        }
        return false;
    }

    private static void printBoard(char[][] board){
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                System.out.print(board[row][col] + " | ");
            }
            System.out.println();
        }
    }
}
