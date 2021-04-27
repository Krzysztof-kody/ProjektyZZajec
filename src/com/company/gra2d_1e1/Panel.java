package com.company.gra2d_1e1;

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
        ImageIcon obr = new ImageIcon("src/com/company/gra2D/PNG/noBackground/6.png");
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
       // g.drawImage(obr.getImage(),0,0, null);
        for(int i = 0; i <  10; i++) {
            g.drawImage(obr.getImage(), i*40, 0, 40, 40, null);
        }

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getX()>=0 && e.getX() <=40)
            if(e.getY()>=0 && e.getY() <=40)
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
