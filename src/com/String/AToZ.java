package com.String;
public class AToZ {
    public static void main(String[] args) {
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('A' + i);
            System.out.print(ch + " ");
        }

        System.out.println();

        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            series = series + ch;
        }
        System.out.println(series);

    }
}
