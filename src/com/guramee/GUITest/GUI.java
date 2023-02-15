package com.guramee.GUITest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {

    //Variables
    int clicks = 0;
    JLabel label;
    JFrame frame;
    JButton button;
    JPanel panel;

    public GUI() {

        frame = new JFrame();

        button = new JButton("Button.");
        button.addActionListener(this);

        label = new JLabel("Hello World!");

        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(200, 300, 200, 300));
        panel.setLayout(new GridLayout(0 ,1));
        panel.add(label);
        panel.add(button);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("GUI Test");
        frame.pack();
        frame.setVisible(true);
    }

    public static void main (String[] args) {
        new GUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        clicks++;
        frame.setTitle("Number of clicks: " + clicks);
        label.setText("You have clicked " + clicks + " times.");
    }
}
