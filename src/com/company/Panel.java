package com.company;

import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {
    public Panel(){}

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.gray);
        for(int i = 0; i < 64; i++){
            g.drawLine(i*10,0,i*10,479);
        }
// wyrysowanie linii poziomych

        g.setColor(Color.RED);
        for(int i=0; i< 3; i++) {
            g.drawLine(319+i, 0, 319+i, 479);
        }
        g.drawLine(320-10,20,320,0);
        g.drawLine(320+10,20,320,0);
    }
}
