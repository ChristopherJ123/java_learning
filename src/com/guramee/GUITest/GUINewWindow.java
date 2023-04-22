package com.guramee.GUITest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUINewWindow extends JFrame implements ActionListener {

    JButton button;

    GUINewWindow() {
        button = new JButton("Calculator");
        button.addActionListener(this);
        button.setBounds(150,150,200,100);

        this.setSize(new Dimension(500,500));
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);

        this.add(button);
    }

    public static void main(String[] args) {
        new GUINewWindow();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            System.out.println("Success");
            this.dispose();
            new GUICalculatorTry1Upgrade3();
        }
    }
}
