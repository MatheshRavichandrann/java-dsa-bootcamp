package com.practice;

public class Scope {
    public static void main(String[] args) {
        int a = 10; // Anything initialized outside the block can be used inside the block. also you can update.
        int b = 20; // Similarly, Anything initialized outside the block can't be again initialize inside the block. you cant reinitialize it.
        String name = "Zoro";

        { // basically, this is a block.
            int z = 10; // Anything initialized inside the block can't be used outside the block. Look at the 18th line its shows an error.
            a = 100;
            int h = 70; // outside block doesn't know h exist
            int x = 40; //  Also, Anything initialized inside the block can be again initialize outside the block. look at 19th line. outside block doesn't know this one exist so we can reinitialize it.
            System.out.println(a);
            name = "Robin";
            System.out.println(name);
        } // block ends here
        System.out.println(a);
        System.out.println(name);
//        System.out.println(z);
        int x = 50;
        System.out.println(x);
        int h = 90;


        //scope in loop
        for (int i = 0; i < 4; i++) {
            System.out.println(i);
//            int a = 10; // Already a initialized outside the block. as you know we can't Reinitialize again.
            a = 77; // but we can update the value.
        }

 //      System.out.println(i); // it can't be used outside the loop block




    }
}
