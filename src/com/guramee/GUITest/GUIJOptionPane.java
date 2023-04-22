package com.guramee.GUITest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIJOptionPane extends JFrame implements ActionListener {

    JOptionPane optionPane;
    JButton button;

    GUIJOptionPane() {
        optionPane = new JOptionPane("Hello there!", JOptionPane.INFORMATION_MESSAGE, JOptionPane.YES_NO_OPTION);

        button = new JButton("Open option pane");
        button.addActionListener(this);

        this.setTitle("setTitle goes here");
        this.setSize(400, 500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
        this.getContentPane().setBackground(Color.GREEN);
        this.add(button);

        ImageIcon icon = new ImageIcon("icon.jpg");
        this.setIconImage(icon.getImage());
    }

    public static void main(String[] args) {
        JOptionPane.showConfirmDialog(null, "test msg", "title goes here", JOptionPane.YES_NO_OPTION);
        new GUIJOptionPane();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            JOptionPane.showMessageDialog(null, "test message", "title goes here", JOptionPane.PLAIN_MESSAGE);
        }
    }
}
