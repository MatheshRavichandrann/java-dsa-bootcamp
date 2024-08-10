package com.practice;
public class if_else_statments {
    public static void main(String[] args) {
        int salary = 900;
        if (salary > 10000){
            salary  += 2000; // salary = salary + 2000
        } else if (salary > 20000) {
            salary += 3000;
        } else {
            salary += 1000;
        }
        System.out.println(salary);
    }
}
