package com.String;
class ShuffleString {


    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3}; // c goes to 4th index , o goes to 5th index and so on.
        System.out.println(suffleString(s, indices));
    }//shuffle

    static String suffleString(String s, int[] arr){
        int arrLength = s.length();
        char[] ans = new char[arrLength];

        for (int i = 0; i < arrLength; i++) {
            ans[arr[i]] = s.charAt(i);
        }
        return new String(ans);
    }
}