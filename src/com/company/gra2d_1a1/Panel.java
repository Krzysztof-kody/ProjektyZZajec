package com.company.gra2d_1a1;

import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {
    public Panel(){}

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        System.out.println(g.getClipBounds().width + " "+g.getClipBounds().height);
        g.setColor(Color.gray);
        for(int i = 0; i < 32; i++)
            g.drawLine(i*20,0,i*20,479);

    }
}
