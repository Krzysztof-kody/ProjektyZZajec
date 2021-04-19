package com.company.grafika;

import javax.swing.*;
import java.awt.*;

public class Linia extends JPanel {


    public static void main(String[] args){

    }

    public void paint(Graphics g) {
        drawCoordinates(g);
    }
    private void drawCoordinates(Graphics g) {

        // get width & height here (w,h)

        // define grid width (dh, dv)
        int h = 100;
        int w = 100;
        int dh = 1;
        for (int x = 0; x < w; x += dh) {
            g.drawLine(x, 0, x, h);
        }
       // for (int y = 0; y < h; y += dv) {
       //     g.drawLine(0, y, w, y);
       // }
    }
}
