package com.company.gra2d_1a1;

import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {
    public Panel(){}

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        ImageIcon obrazek = new ImageIcon("src/com/company/gra2D/PNG/background/17.png");
        ImageIcon obrazekBT = new ImageIcon("src/com/company/gra2D/PNG/noBackground/17.png");
        System.out.println(g.getClipBounds().width + " "+g.getClipBounds().height);
        g.setColor(Color.gray);
        for(int i = 0; i < 32; i++)
            g.drawLine(i*20,0,i*20,479);
        for(int i = 0; i < 24; i++)
            g.drawLine(0,i*20,639,i*20);

        //g.drawImage(obrazek.getImage(),20,20, null );
        g.drawImage(obrazek.getImage(),20,20,80,80, null );
        g.drawImage(obrazekBT.getImage(),100,100,80,80, null );


    }
}
