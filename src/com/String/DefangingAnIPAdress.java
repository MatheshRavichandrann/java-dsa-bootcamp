package com.String;

public class DefangingAnIPAdress {
    public static void main(String[] args) {
//        String sc = "1.1.1.1";
        String sc = "G()()()()(al)";
        System.out.println(defang(sc));

    }
    static String defang(String add){
        return add.replace("()", "o").replace("(al)", "al");

    }
}
