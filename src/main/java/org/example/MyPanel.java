package org.example;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {

    MyPanel() {
        this.setPreferredSize(new Dimension(500,500));

    }

    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setStroke(new BasicStroke(5));
        g2d.setPaint(Color.red);
        g2d.fillArc(0,0,100,100,0,180);
        g2d.setPaint(Color.white);
        g2d.fillArc(0,0,100,100,180,180);

    }
}
