package com.company.gra2d_1a2;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame gra = new JFrame();
        Panel p = new Panel();
        gra.add(p);
        gra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gra.setTitle("Gra Test");
        gra.setBounds(200,200, 640 + 14, 480 + 37);
        /*
        gra.setSize(250+14, 250+14+23);
        gra.setLocationRelativeTo(null);
        */
        gra.setVisible(true);

    }
}
