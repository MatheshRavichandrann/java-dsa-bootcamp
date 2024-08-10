package com.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiArrayList {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>(); // Declaration

        // initialisation // its likely writing [3][] on multiDimension array. in arraylist we cant do thant directly so that were doing it manually using for loop
        for (int i = 0; i < 3; i++) {  // if we don't initialise this for-loop we'll end up getting IndexOutOfBoundsException
            list.add(new ArrayList<>());
        }

        // Add Elements
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <3 ; j++) {
                list.get(i).add(scn.nextInt());
            }
        }

        System.out.println(list); // we can directly print list

    }
}
