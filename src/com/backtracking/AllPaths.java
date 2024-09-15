package com.backtracking;

import java.util.Arrays;

public class AllPaths {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
//        allPaths("", maze, 0, 0);


        int[][] path = new int[maze.length][maze[0].length];
        allPathPrint("", maze, 0, 0, path, 1);
    }


    static void allPathPrint(String p, boolean[][] maze, int r, int c, int[][] path, int step){
        if (r == maze.length - 1 && c == maze[0].length - 1){
            path[r][c] = step;
            for (int[] arr : path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }

        if (!maze[r][c]){
            return;
        }

        maze[r][c] = false;
        path[r][c] = step;


        if (r < maze.length - 1){
            allPathPrint(p + 'D', maze, r+1, c, path, step+1);
        }

        if (c < maze[0].length - 1){
            allPathPrint(p + 'R', maze, r, c+1, path, step+1);
        }

        if (r > 0){
            allPathPrint(p + 'U', maze, r-1, c, path, step+1);
        }

        if (c > 0){
            allPathPrint(p + 'L', maze, r, c-1, path, step+1);
        }


        maze[r][c] = true;
        path[r][c] = 0;

    }
}
