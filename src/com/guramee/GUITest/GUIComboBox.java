package com.guramee.GUITest;

import com.guramee.F;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GUIComboBox extends JFrame {

    JComboBox<String> comboBox;

    GUIComboBox() {

        String[] items = {"dog", "cat", "hamster"};
        comboBox = new JComboBox<>(items);
        comboBox.addKeyListener(new KeyListener() {
            public void keyTyped(KeyEvent e) {

            }
            public void keyPressed(KeyEvent e) {

            }
            public void keyReleased(KeyEvent e) {
                if (e.getKeyCode() == 10) {
                    int choice = comboBox.getSelectedIndex();
                    System.out.println(choice);
                }
            }
        });

        this.setTitle("setTitle goes here");
        this.setSize(400, 500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
        this.getContentPane().setBackground(Color.GREEN);
        this.setLayout(new FlowLayout());
        this.add(comboBox);

        ImageIcon icon = new ImageIcon("icon.jpg");
        this.setIconImage(icon.getImage());
    }

    public static void main(String[] args) {
        new GUIComboBox();
    }
}
