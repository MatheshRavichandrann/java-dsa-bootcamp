package com.practice;
import java.util.Scanner;
public class Temprature {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter temprature in C");
        float tempF = scn.nextFloat();
        float tempC = (tempF * 9/5) +32;
        System.out.println(tempC);
    }
}
