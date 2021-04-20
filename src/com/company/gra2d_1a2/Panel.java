package com.company.gra2d_1a2;

import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {
    public Panel() {
        setSize(640,480);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.blue);
        g.drawLine(0,0, 639, 479);

        g.setColor(Color.gray);
        for(int i=0; i< 64; i++){
            g.drawLine(i*10,0,i*10,479);
        }
        for(int i=0; i< 48; i++){
            g.drawLine(0,i*10,639,i*10);
        }
        g.setColor(Color.red);
        g.drawLine(320,0, 320, 479);
        g.drawLine(319,0, 319, 479);
        g.drawLine(321,0, 321, 479);

        g.drawLine(320-20,30, 320, 0);



    }
}
