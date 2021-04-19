package com.company.gra2D;

import javax.management.timer.Timer;
import javax.swing.*;
import java.awt.*;
import java.util.TimerTask;

public class Main{


    public static void main(String[] args){
        JFrame game = new JFrame();
        Gra gamePanel = new Gra();
        game.getContentPane().add(gamePanel); // dodanie JPanela do JFrame (elementu po którym będziemy rysować do gry)

        //game.setPreferredSize(new Dimension(400, 300));
        //game.pack();
        //game.setSize(640, 480); // pasek tytułowy ma około 25px
        game.setBounds(100,100,640+14, 480+37);
        game.setTitle("Gra2D"); // ustawienie tytułu aplikacji
        game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ustawienie by aplikacja się wyłączała gdy zamkniemy okno
        game.setLocationRelativeTo(null); // wypośrodkowanie aplikacji (uruchamia się na środku ekranu)
        game.setVisible(true); // ustawienie by JFrame był widoczny (pokazanie okna gry)
        for(int i = 0 ; i< 10 ; i++){
            game.revalidate();
            gamePanel.repaint();
            game.setVisible(true);
        }
    }


}
