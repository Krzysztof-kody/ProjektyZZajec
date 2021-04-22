package com.company;

import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {
    public Panel(){}

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        ImageIcon obr =  new ImageIcon("src/com/company/gra2D/PNG/background/1.png");

        g.setColor(Color.gray);
        for(int i = 0; i < 64; i++){
            g.drawLine(i*10,0,i*10,479);
        }
        for(int i = 0; i < 48; i++){
            g.drawLine(0,i*10,640,i*10);
        }
// wyrysowanie linii poziomych

        g.setColor(Color.RED);
        for(int i=1; i< 3; i++) {
            g.drawLine(319+i, 0, 319+i, 479);
        }
        g.drawLine(320-10,20,320,0);
        g.drawLine(320+10,20,320,0);
        g.drawImage(obr.getImage(),10, 10,null);


        g.drawImage(obr.getImage(),20,20,50,50,null);


    }
// strzałka X

}
