package com.OOPs;
public class GarbageCollector {
    public static void main(String[] args) {

        Draft obj;
        for (long i = 0; i < 2000000000; i++) {
            obj = new Draft("zoro");
        }
    }
}

class Draft{
    String name;

    public Draft(String name) {
        this.name = name;
    }

    // it can do this on its own, we don't need implement this.
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object Destroyed");
    }
}