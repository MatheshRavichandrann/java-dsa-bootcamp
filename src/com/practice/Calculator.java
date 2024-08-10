package com.practice;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) throws InterruptedException {
        Scanner scn = new Scanner(System.in);
        int ans = 0;
        while(true){
            System.out.print("Enter the operator: + - * / % : ");
            char op = scn.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.print("Enter first Number : ");
                int num1 = scn.nextInt();
                System.out.print("Enter second Number : ");
                int num2 = scn.nextInt();
                if (op == '+') {
                    ans = num1 + num2;
                }
                if (op == '-') {
                    ans = num1 - num2;
                }
                if (op == '*') {
                    ans = num1 * num2;
                }
                if (op == '/') {
                    if (num2 !=0){
                        ans = num1 / num2;
                    }
                }
                if (op == '%') {
                    ans = num1 % num2;
                }
            } else if (op =='X' || op =='x') {
                System.out.print("Program closing in ");
                Thread.sleep(1000);
                System.out.print("3 ");
                Thread.sleep(1000);
                System.out.print("2 ");
                Thread.sleep(1000);
                System.out.print("1");
                break;
            }else {
                System.out.println("Invalid operation");
            }
            System.out.println("The answer is: " + ans);
        }
    }
}
