package com.guramee.GUITest;

import javax.swing.*;
import java.awt.*;

public class GUIJLayeredPane extends JFrame {

    GUIJLayeredPane() {

        JLabel redSquare = new JLabel();
        JLabel greenSquare = new JLabel();
        JLabel blueSquare = new JLabel();

        redSquare.setBounds(50,50,200,200);
        redSquare.setBackground(Color.RED);
        redSquare.setOpaque(true);

        greenSquare.setBounds(100,100,200,200);
        greenSquare.setBackground(Color.GREEN);
        greenSquare.setOpaque(true);

        blueSquare.setBounds(150,150,200,200);
        blueSquare.setBackground(Color.BLUE);
        blueSquare.setOpaque(true);

        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setBounds(0, 0, 500, 500);
        layeredPane.add(redSquare, Integer.valueOf(0));
        layeredPane.add(greenSquare, Integer.valueOf(1));
        layeredPane.add(blueSquare, Integer.valueOf(2));

        this.setTitle("Guramee");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(new Dimension(500, 500));
        this.setVisible(true);
        this.setResizable(true);
        this.getContentPane().setBackground(Color.gray);
        this.setLayout(null);

        this.add(layeredPane);
    }

    public static void main(String[] args) {
        new GUIJLayeredPane();
    }
}
