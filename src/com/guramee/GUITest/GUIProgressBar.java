package com.guramee.GUITest;

import javax.swing.*;
import java.awt.*;

public class GUIProgressBar extends JFrame {

    JProgressBar progressBar;

    GUIProgressBar() throws InterruptedException {
        progressBar = new JProgressBar(0, 100);
        progressBar.setBorderPainted(false);
        progressBar.setStringPainted(true);
        progressBar.setSize(400, 100);
        progressBar.setValue(0);

        this.setTitle("setTitle goes here");
        this.setSize(400, 500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
        this.getContentPane().setBackground(Color.GREEN);
        this.setLayout(null);

        this.add(progressBar);

        ImageIcon icon = new ImageIcon("icon.jpg");
        this.setIconImage(icon.getImage());


        int i = 1;
        while (i < 100) {
            progressBar.setValue(i);
            Thread.sleep(50);
            i++;
        }
        progressBar.setString("Done :D");
    }


    public static void main(String[] args) throws InterruptedException {
        new GUIProgressBar();
    }
}
