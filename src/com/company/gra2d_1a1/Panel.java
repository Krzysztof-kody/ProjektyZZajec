package com.company.gra2d_1a1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Panel extends JPanel implements MouseListener {
    public Panel(){
        addMouseListener(this);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        ImageIcon obrazek = new ImageIcon("1.png");
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

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getX()>=20 && e.getX()<=100)
            if(e.getY()>=20 && e.getY()<=100)
                System.out.println(e.getX() + " " + e.getY());
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
