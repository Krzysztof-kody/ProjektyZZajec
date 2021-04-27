package com.company.cwiczenia.animacja;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame okno = new JFrame();
        Panel p = new Panel();
        okno.add(p);
        okno.addKeyListener(p);
        okno.setBounds(100,100,500,100);
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        okno.setVisible(true);
    }
}
