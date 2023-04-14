package com.guramee.GUITest;

import javax.swing.*;
import java.awt.*;

public class GUIOtherWay extends JFrame {

    GUIOtherWay() {
        this.setTitle("setTitle goes here");
        this.setSize(400, 500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
        this.getContentPane().setBackground(Color.GREEN);

        ImageIcon icon = new ImageIcon("icon.jpg");
        this.setIconImage(icon.getImage());
    }

    public static void main(String[] args) {
        new GUIOtherWay();
    }
}
