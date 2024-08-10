package com.practice;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) throws InterruptedException , IllegalStateException {
        Scanner scn = new Scanner(System.in);
//        while (true){
//            System.out.println("Enter the F for know about fruits!");
//            System.out.print("Press X to exit : ");
//            char op = scn.next().trim().charAt(0);
//            if (op == 'F' || op =='f'){
//                System.out.println("Which Fruits details you wanna know?");
//                System.out.println("Apple Mango Orange Grapes");
//                String fruit = scn.next().toLowerCase();
//                switch (fruit) {
//                    case "apple" -> System.out.println("A sweet red fruit");
//                    case "mango" -> System.out.println("A sweet yellow fruit");
//                    case "orange" -> System.out.println("A sweet Orange fruit");
//                    case "grapes" -> System.out.println("A sweet purple fruit");
//                    default -> System.out.println("Invalid input");
//                }
//            } else if (op == 'X' || op =='x') {
//                System.out.print("Program closing in ");
//                Thread.sleep(1000);
//                System.out.print("3 ");
//                Thread.sleep(1000);
//                System.out.print("2 ");
//                Thread.sleep(1000);
//                System.out.print("1");
//                break;
//
//            }
//        }
//        // Enhanced SwitchCase
//        int day = scn.nextInt();
//        switch (day){
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thursday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Saturday");
//            case 7 -> System.out.println("Sunday");
//
//        }

//        int day1 = scn.nextInt();
//        switch (day1){
//            case 1 :
//            case 2 :
//            case 3 :
//            case 4 :
//            case 5 :
//                System.out.println("Weekdays");
//                break;
//            case 6 :
//            case 7 :
//                System.out.println("Weekends");
//                break;
//        }
//        int day1 = scn.nextInt();
//        switch (day1){
//            case 1 :
//            case 2 :
//            case 3 :
//            case 4 :
//            case 5 :
//                System.out.println("Weekdays");
//                break;
//            case 6 :
//            case 7 :
//                System.out.println("Weekends");
//                break;
//            default:
//                // it's an unwanted exception handling. I had juz wrote it coz I know exception handling
////                try{
//                    System.out.println("Unexpected value: "+day1 + " Give value 1 to 7");
////                }
////                catch (IllegalStateException e){
////                    e.printStackTrace();
////                }
//        }
        // Enhanced SwitchCase
        int day1 = scn.nextInt();
        switch (day1) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekdays");
            case 6, 7 -> System.out.println("Weekends");
            default ->
                    System.out.println("Unexpected value: " + day1 + " Give value 1 to 7");
        }
    }
}
