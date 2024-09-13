package com.backtracking;

import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
//        System.out.println(count(3, 3));
//        path("", 3, 3);
//        System.out.println(  pathReturn("", 3, 3));
//        System.out.println(pathReturnDiagonal("", 3, 3));

        boolean[][] maze = {
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };
        pathReturnRestriction("", maze, 0, 0);
    }

    static int count(int r, int c){
        if (r == 1 && c == 1){
            return 1;
        }

        int left = count(r-1, c);
        int right = count(r, c-1);
        return left+right;
    }

    static void path(String p, int r, int c){
        if (r == 1 && c == 1){
            System.out.println(p);
            return;
        }

        if (r > 1){
            path(p + 'D', r-1, c);
        }
        if (c > 1){
            path(p + 'R', r, c-1);

        }
    }

    static ArrayList<String> pathReturn(String p, int r, int c){
        if (r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();
        if (r > 1){
            list.addAll(pathReturn(p + 'D', r-1, c));
        }
        if (c > 1){
            list.addAll(pathReturn(p + 'R', r, c-1));
        }
        return list;
    }


    static ArrayList<String> pathReturnDiagonal(String p, int r, int c){
        if (r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;

        }

        ArrayList<String> list = new ArrayList<>();
        if (r > 1){
            list.addAll(pathReturnDiagonal(p + 'V', r-1, c));
        }
        if (c > 1){
            list.addAll(pathReturnDiagonal(p + 'H', r, c-1));
        }
        if (r>1 && c>1){
            list.addAll(pathReturnDiagonal(p + 'D', r-1, c-1));
        }
        return list;
    }


    static void pathReturnRestriction(String p, boolean[][] maze, int r, int c ){
        if (r == maze.length -1 && c == maze[0].length-1){
            System.out.println(p);
            return;
        }

        if (!maze[r][c]){  // (maze[r][c] == false) both are same
            return;
        }

        if (r < maze.length -1){
            pathReturnRestriction(p + 'D', maze, r+1, c);
        }
        if (c < maze.length -1){
            pathReturnRestriction(p + 'R', maze, r, c+1);

        }

    }


















}
