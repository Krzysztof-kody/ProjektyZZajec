package com.company.gra2D;

import org.w3c.dom.css.RGBColor;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Gra extends JPanel {
    boolean angry;
    ArrayList<Image> ikony = new ArrayList<>();
    public Gra(){
        angry = false;
        for(int i = 1; i<= 50 ; i++) {
            ikony.add(Toolkit.getDefaultToolkit().getImage("src/com/company/gra2D/PNG/background/" + i + ".png"));
        }
    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
/* włączenie antyaliasingu
b
        RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING,
                                            RenderingHints.VALUE_ANTIALIAS_ON);
        rh.put(RenderingHints.KEY_RENDERING,RenderingHints.VALUE_RENDER_QUALITY);
        g2d.setRenderingHints(rh);
*/
        double h = getSize().height;
        double w = getSize().width;
        System.out.println( w+ "x"+ h);
        board(g);
        g.setColor(Color.blue);
        g.drawLine(0,0,639,479);
        g.drawLine(639,0,0,479);
        g.drawOval(320-50,240-50,100,100);
    }

    void drawImage(Graphics g, int x, int y, String path){
        Image img = Toolkit.getDefaultToolkit().getImage(path);
        g.drawImage(img, x, y,50,50, null);
        Toolkit.getDefaultToolkit().sync();
        setAngry(g);
    }
    void drawImage2(Graphics g, int x, int y, Image img){
        g.drawImage(img, x, y,50,50, null);
        Toolkit.getDefaultToolkit().sync();
        setAngry(g);
    }
    public void setAngry(Graphics g) {
        if (this.angry == false) {
            this.angry = true;
            paint(g);
        }
    }
    void board(Graphics g){
        for(int i = 0; i< 50 ; i++) {
         //   System.out.println("x" + (i%10)*50+" y"+ ((i/10)+1)*50);
            g.drawImage(ikony.get(i), (i%10)*50, ((i/10)+1)*50, 50,50,null);
        }

    }
}
