package com.guramee.GUITest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GUIKeyListener extends JFrame implements KeyListener {

    GUIKeyListener() {
        this.setTitle("setTitle goes here");
        this.setSize(400, 500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
        this.getContentPane().setBackground(Color.GREEN);
        this.addKeyListener(this);

        ImageIcon icon = new ImageIcon("icon.jpg");
        this.setIconImage(icon.getImage());
    }

    public static void main(String[] args) {
        new GUIKeyListener();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
