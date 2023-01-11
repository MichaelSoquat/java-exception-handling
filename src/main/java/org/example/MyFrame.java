package org.example;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    MyPanel panel = new MyPanel();
    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }


}
