package org.example;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    JEditorPane iframe;
    MyFrame(){
        
        this.setTitle("My GUI!");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(420,420);
        this.setVisible(true);

        ImageIcon image = new ImageIcon("logo.png");
        this.setIconImage(image.getImage());
        iframe = new JEditorPane();
        iframe.setEditable(false);

        // Add the JEditorPane to your frame
        this.add(iframe);
        String textContent = "Hello and welcome to my nice GUI!";
        iframe.setText(textContent);

    }

}
