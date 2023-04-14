package com.guramee.GUITest;

import javax.swing.*;
import java.awt.*;

public class GUIBorderLayout extends JFrame {

    GUIBorderLayout() {
        this.setSize(500, 500);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout(10, 10));

        //Panels
        JPanel panelTop = new JPanel();
        JPanel panelLeft = new JPanel();
        JPanel panelBottom = new JPanel();
        JPanel panelRight = new JPanel();
        JPanel panelMiddle = new JPanel();

        panelTop.setPreferredSize(new Dimension(100, 100));
        panelLeft.setPreferredSize(new Dimension(100, 100));
        panelBottom.setPreferredSize(new Dimension(100, 100));
        panelRight.setPreferredSize(new Dimension(100, 100));
        panelMiddle.setPreferredSize(new Dimension(100, 100));

        panelTop.setBackground(Color.RED);
        panelLeft.setBackground(Color.GREEN);
        panelBottom.setBackground(Color.BLUE);
        panelRight.setBackground(Color.YELLOW);
        panelMiddle.setBackground(Color.GRAY);

        this.add(panelTop, BorderLayout.NORTH);
        this.add(panelRight, BorderLayout.EAST);
        this.add(panelBottom, BorderLayout.SOUTH);
        this.add(panelLeft, BorderLayout.WEST);
        this.add(panelMiddle, BorderLayout.CENTER);
        this.pack();
    }

    public static void main(String[] args) {
        new GUIBorderLayout();
    }
}
