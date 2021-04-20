package com.company.gra2d_1e1;

import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {
    public Panel(){}

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        System.out.println(g.getClipBounds().width + " " + g.getClipBounds().height);
        // 299 x 299
        g.setColor(Color.blue);
        g.drawLine(0,0,639,479);
        g.setColor(Color.gray);
        for(int i=0; i< 32; i++){
            g.drawLine(i*20,0,i*20,479);
        }
        for(int i=0; i< 24; i++){
            g.drawLine(0,i*20,639,i*20);
        }
        g.setColor(Color.red);
        g.drawLine(320,0,320,479);
        g.drawLine(321,0,321,479);

        g.drawLine(320-10,20,320,0);

    }
}
