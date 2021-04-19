package com.company.graTest;

import com.company.gra2D.Gra;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;

public class View {
    JFrame frame;
    ArrayList<ImageIcon> ikony = new ArrayList<>();
    JPanel mainPanel;

    public View() throws IOException {
        frame = new JFrame();
        frame.setBounds(100,100,640+14, 480+37);
        frame.setTitle("Gra2D"); // ustawienie tytułu aplikacji
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ustawienie by aplikacja się wyłączała gdy zamkniemy okno
        frame.setLocationRelativeTo(null); // wypośrodkowanie aplikacji (uruchamia się na środku ekranu)
        frame.setVisible(true); // ustawienie by JFrame był widoczny (pokazanie okna gry)
        for(int i = 1; i<= 50 ; i++) {
            ikony.add(new ImageIcon("src/com/company/gra2D/PNG/background/" + i + ".png"));
        }
        mainPanel = new JPanel();
        mainPanel.setLayout(null);
        frame.add(mainPanel);
    }

    public void paintMainWindow(){
        JButton a = new JButton();
        for(int i = 0; i< 50 ; i++) {
            //   System.out.println("x" + (i%10)*50+" y"+ ((i/10)+1)*50);
            a = new JButton();
            ImageIcon imageIcon = ikony.get(i); // load the image to a imageIcon
            Image image = imageIcon.getImage(); // transform it
            Image newimg = image.getScaledInstance(50, 50,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
            imageIcon = new ImageIcon(newimg);
            a.setBounds((i%10)*50, ((i/10)+1)*50, 50,50);
            a.setIcon(imageIcon);
            mainPanel.add(a);
        }
        frame.revalidate();
        frame.repaint();
        frame.setVisible(true);
    }


}
