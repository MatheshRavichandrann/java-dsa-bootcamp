package com.recursion.String;
public class Stream {
    public static void main(String[] args) {
//        skip("", "bcdaahadea");
//        System.out.println(skip("dsaasdsa"));
        System.out.println(skipApple("asdsapplesdfd"));
    }

    static void skip(String processed , String unprocessed){
        if (unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        char ch = unprocessed.charAt(0);

        if (ch == 'a'){
            skip(processed, unprocessed.substring(1));
        }
        else {
            skip(processed + ch, unprocessed.substring(1));

        }
    }

    static String skip(String up){
        if (up.isEmpty()){
            return "";
        }
        char ch = up.charAt(0);

        if (ch == 'a'){
            return skip(up.substring(1));
        }else {
            return ch + skip(up.substring(1));
        }
    }

    static String skipApple(String unprocesses){
            if (unprocesses.isEmpty()){
                return "";
            }

            if (unprocesses.startsWith("apple")){
                return skipApple(unprocesses.substring(5));
            }
            else {
                return unprocesses.charAt(0) + skipApple(unprocesses.substring(1));
            }

    }

    static String skipAppleNotApple(String unprocessed){
        if (unprocessed.isEmpty()){
            return "";
        }
        if (unprocessed.startsWith("app") && !unprocessed.startsWith("apple")){
            return skipAppleNotApple(unprocessed.substring(3));
        }else {
            return unprocessed.charAt(0) + skipAppleNotApple(unprocessed.substring(1));
        }
    }
}
