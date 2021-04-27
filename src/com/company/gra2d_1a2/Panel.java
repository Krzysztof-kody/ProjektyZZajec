package com.company.gra2d_1a2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class Panel extends JPanel  implements MouseListener {
    Polygon poligon = new Polygon();
    ArrayList<Point> bangi = new ArrayList<>();
    ImageIcon obr = new ImageIcon();
    ImageIcon bang = new ImageIcon();
    int i;
    public Panel() {
        setSize(640,480);
        addMouseListener(this);
        i = 0;
        add(new JLabel("Jakiś tekst"));
        this.setLayout(null);
        this.getComponent(0).setBounds(100,10,100,30);
        bang = new ImageIcon("src/0.png");
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);


        g.drawImage(obr.getImage(), 40,40, null);

        g.setColor(Color.gray);
        for(int i=0; i< 16; i++){
            g.drawLine(i*40,0,i*40,479);
        }
        for(int i=0; i< 12; i++){
            g.drawLine(0,i*40,639,i*40);
        }


            g.drawImage(obr.getImage(), 0,0,40,40, null);

        for(Point b: bangi){
            g.drawImage(bang.getImage(), b.x-20,b.y-20,40,40, null);
        }
        g.fillPolygon(poligon);
    }


    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println(e.getX() + " " + e.getY());
        if(e.getX()>=0 && e.getX()<=40)
            if(e.getY()>=0 && e.getY()<=40){
                System.out.println("trafiony");
            }
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
