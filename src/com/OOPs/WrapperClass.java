package com.OOPs;

public class WrapperClass {
    public static void main(String[] args) {
        Integer a = 10;
        Integer b = 20;
        swap(a, b);
        System.out.println(a +" "+b);

//        final int num = 2;
//        num = 3; // we cant reassign the value, when its final


        A zoro =  new A("Nami");
        zoro.name = "Robin"; // this is allowed you can change the value

        // When a non primitive is final, you can't reassign it.
        zoro = new A("other name"); // this is not allowed, you can't reassign it.

    }
    // it cant change the value. cause, Integer a final class
    static void swap(Integer a, Integer b){
        Integer temp = a;
        a = b;
        b = temp;

    }

}

class  A{
    final int num = 10;
    String name;

    public A(String name) {
        this.name = name;
    }
}