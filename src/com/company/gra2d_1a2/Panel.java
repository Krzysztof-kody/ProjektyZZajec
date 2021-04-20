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

    }
}
