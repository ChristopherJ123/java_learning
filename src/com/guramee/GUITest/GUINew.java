package com.guramee.GUITest;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class GUINew extends JFrame {

    GUINew() {

        //Src
        ImageIcon icon = new ImageIcon("C:\\Youtube\\Modding\\hello world\\src\\com\\guramee\\GUITest\\icon.jpg");
        ImageIcon iconSmall = new ImageIcon("C:\\Youtube\\Modding\\hello world\\src\\com\\guramee\\GUITest\\iconsmall.jpg");
        Border border = BorderFactory.createLineBorder(Color.BLUE, 5);

        //JLabel
        JLabel gurameeLabel = new JLabel();
        gurameeLabel.setText("Welcome");
        gurameeLabel.setIcon(iconSmall);
        gurameeLabel.setHorizontalTextPosition(JLabel.CENTER);
        gurameeLabel.setVerticalTextPosition(JLabel.NORTH);
        gurameeLabel.setForeground(Color.BLUE);
        gurameeLabel.setFont(new Font("Times new roman", Font.PLAIN, 36));
        gurameeLabel.setBackground(Color.BLACK);
        gurameeLabel.setOpaque(true);
        gurameeLabel.setBorder(border);
        gurameeLabel.setHorizontalAlignment(JLabel.CENTER);
        gurameeLabel.setVerticalAlignment(JLabel.CENTER);
        gurameeLabel.setBounds(0, 0, 150, 180);

        //JPanel
        JPanel redPanel = new JPanel();
        JPanel bluePanel = new JPanel();
        JPanel greenPanel = new JPanel();

        redPanel.setBackground(Color.RED);
        redPanel.setBounds(0, 0, 300, 300);
        redPanel.setLayout(new GridLayout(3, 3));

        bluePanel.setBackground(Color.BLUE);
        bluePanel.setBounds(300, 0, 300, 300);

        greenPanel.setBackground(Color.GREEN);
        greenPanel.setBounds(0, 350, 600, 300);

        //Frame settings
        this.setTitle("Guramee");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 800);
        this.setVisible(true);
        this.setResizable(true);
        this.setIconImage(icon.getImage());
        this.getContentPane().setBackground(Color.gray);
        this.setLayout(null);

        this.add(redPanel);
        redPanel.add(gurameeLabel);

        this.add(bluePanel);
        this.add(greenPanel);

    }

    public static void main(String[] args) {
        new GUINew();
    }
}
