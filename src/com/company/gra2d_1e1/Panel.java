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
    }
}
