package com.functionalProgramming.Frame;

import javax.swing.*;

public class MyFrame12 extends JFrame {
    JButton myButton = new JButton("MY BUTTON1");
    JButton myButton2= new JButton("MY BUTTON2");


    public MyFrame12(){
        myButton.setBounds(100, 100, 200, 100);
        myButton.addActionListener(
                (x) -> System.out.println("This is first button")
        );

        myButton2.setBounds(100, 200, 200, 100);
        myButton2.addActionListener(
                (x) -> System.out.println("This is second button")
        );

        this.add(myButton);
        this.add(myButton2);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(420, 420);
        this.setLayout(null);
        this.setVisible(true);

    }
}
