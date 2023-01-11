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

        g2d.drawArc(0,0,100,100,0,180);
    }
}
