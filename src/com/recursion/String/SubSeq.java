package com.recursion.String;

import java.util.ArrayList;

public class SubSeq {
    public static void main(String[] args) {
//        subseq("", "abc");
        System.out.println(subseqRet("", "abc"));
    }

    static void subseq(String processed, String unprocessed){
        if (unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }
        // Recursive case:
        // 1. Include the first character of unprocessed in processed
        char ch = unprocessed.charAt(0);
        subseq(processed + ch, unprocessed.substring(1));
        // 2. Exclude the first character of unprocessed
        subseq(processed, unprocessed.substring(1));
    }

    static ArrayList<String> subseqRet(String p, String up) {
        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> left = subseqRet(p + ch, up.substring(1));
        ArrayList<String> right = subseqRet(p, up.substring(1));

        left.addAll(right);
        return left;
    }
}