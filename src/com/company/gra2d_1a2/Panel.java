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

        ImageIcon obr = new ImageIcon("src/com/company/gra2D/PNG/background/6.png");
        g.drawImage(obr.getImage(), 40,40, null);

        g.setColor(Color.gray);
        for(int i=0; i< 16; i++){
            g.drawLine(i*40,0,i*40,479);
        }
        for(int i=0; i< 12; i++){
            g.drawLine(0,i*40,639,i*40);
        }

        g.drawImage(obr.getImage(), 0,0,40,40, null);

    }
}
