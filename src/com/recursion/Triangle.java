package com.recursion;
public class Triangle {
    public static void main(String[] args) {
//        triangle(10, 0);
//        triangle2(5, 0);
//        tri(4, 0);
        tri2(4, 0);
    }


    static void triangle(int row, int column){
        if (row == 0){
            return;
        }
        if (column < row){
            System.out.print("*  ");
            triangle(row, column+1);
        }else {
            System.out.println();
            triangle(row-1, 0);
        }
    }

    static void triangle2(int row, int col){
        if (row == 0){
            return;
        }
        if (col < row){
            triangle2(row, col+1);
            System.out.print("*  ");

        }else {
            triangle2(row-1, 0);
            System.out.println();

        }

    }

    static void tri(int row, int col){
        if (row == 0){
            return;
        }
        if (col < row){
            System.out.print("*  ");
            tri(row, col+1);
        }else {
            System.out.println();
            tri(row-1, 0);
        }
    }

    static void tri2(int row, int col){
        if (row == 0){
            return;
        }
        if (col < row){
            tri2(row, col+1);
            System.out.print("*  ");
        }
        else {
            tri2(row-1, 0);
            System.out.println();
        }

    }

}
/*
Output :
 * * * *
 * * *
 * *
 *


 */