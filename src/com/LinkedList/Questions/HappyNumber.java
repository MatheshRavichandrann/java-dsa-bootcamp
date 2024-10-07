package com.LinkedList.Questions;

public class HappyNumber {

    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        do {
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        }while (fast != slow);
        if (slow == 1){
            return true;
        }
        return false;
    }

    private int findSquare(int number){
        int ans = 0;
        while (number > 0){
            int rem = number % 10;
            ans += rem * rem;
            number /= 10;
        }
        return ans;
    }

    public static void main(String[] args) {
        HappyNumber number = new HappyNumber();
        System.out.println(number.isHappy(19));
        System.out.println(number.isHappy(2));
    }

}


