package com.company.gra2d_1e1;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame gra = new JFrame();
        Panel p = new Panel();
        gra.add(p);
        p.setSize(640,480);
        gra.setTitle("Gra 2D");
        gra.setBounds(200,200,640 + 14,480+14+23);
        /*
        gra.setSize(300 + 14,300 + 14 + 23);
        gra.setLocationRelativeTo(null);
         */
        gra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gra.setVisible(true);
    }
}
