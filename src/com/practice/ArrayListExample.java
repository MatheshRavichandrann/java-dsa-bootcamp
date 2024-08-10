package com.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
  
    public static void main(String[] args) {
        Scanner snc = new Scanner(System.in);

        // Syntax
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);  
        list.add(500);

        System.out.println(list.contains(400)); // it'll check whether the give value is present or not and give a boolean vale
        System.out.println(list.contains(600));
        System.out.println(list);
        list.set(0, 700); // it'll use to update the value
        System.out.println(list);
        list.remove(2); //it'll remove the given index number. 300 will be removed
        System.out.println(list);

        {
            ArrayList<Integer> list1 = new ArrayList<>(10);
            // Input
            for (int i = 0; i < 5; i++) {
                list1.add(snc.nextInt());
            }
            // Output
            for (int i = 0; i < 5; i++) {
                System.out.print(list1.get(i)+" "); // Pass Index  here, list[index] syntax will not work here.
            }
            System.out.println();
            System.out.println(list1);
            

        }

    }
}
