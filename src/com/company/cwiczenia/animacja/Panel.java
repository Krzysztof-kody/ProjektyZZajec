package com.company.cwiczenia.animacja;

import javax.swing.*;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Panel extends JPanel  implements KeyListener {
    ImageIcon run = new ImageIcon("src/com/company/cwiczenia/animacja/img/Run.png");
    int i;
    int x;
    int y;
    int kier;
    public Panel(){
        addKeyListener(this);
        setSize(64,64);
        i = 0;
        int x = 0;
        int y = 0;
        kier = 0;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        if(kier == 0)
            g.drawImage(run.getImage(), 0+x,0,35+x,44,0,0+(i*44),35,44+(i*44),null);
        else
            g.drawImage(run.getImage(), 35+x,0,0+x,44,0,0+(i*44),35,44+(i*44),null);
    }

        @Override
    public void keyTyped(KeyEvent e) {
        System.out.println(e.getKeyCode());
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(i < 5)
            i++;
        else
            i=0;
        // 39 ->
        // 37 <-
        //System.out.println(e.getKeyCode());
        if(e.getKeyCode()==39) {x+=2;kier=0;}
        if(e.getKeyCode()==37) {x-=2;kier=1;}
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {
        i=0;
        repaint();
    }
}
