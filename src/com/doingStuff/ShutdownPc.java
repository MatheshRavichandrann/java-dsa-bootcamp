package com.doingStuff;
import java.io.IOException;
public class ShutdownPc {
    public static void main(String[] args) {
        try {
            // For Windows
            Runtime.getRuntime().exec("shutdown -s -t 0");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

