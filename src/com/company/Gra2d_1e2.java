package com.company;

import javax.swing.*;

public class Gra2d_1e2 {
    public static void main(String[] args) {
        JFrame game = new JFrame();
        Panel p = new Panel();
        game.add(p);
        p.setBounds(0,0,640,480);
        game.setTitle("Grafika");
        game.setBounds(100,100,640+14, 480+37);
        /*
        game.setSize(640, 480);
        game.setLocationRelativeTo(null);
        */
        game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        game.setVisible(true);
    }
}
