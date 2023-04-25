package com.guramee.GUITest;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class GUISlider extends JFrame {

    JLabel label;

    JSlider slider;

    GUISlider() {
        slider = new JSlider(0, 100);
        slider.setPaintTicks(true);
        slider.setMinorTickSpacing(5);
        slider.setPaintTrack(true);
        slider.setMajorTickSpacing(25);
        slider.setPaintLabels(true);
        slider.setFocusable(false);

        this.setTitle("setTitle goes here");
        this.setSize(400, 500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
        this.getContentPane().setBackground(Color.GREEN);
        this.setLayout(new FlowLayout());

        this.add(slider);
        slider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                label.setText("Value is = " + slider.getValue());
            }
        });
        label = new JLabel("Value is = " + slider.getValue());
        this.add(label);

        ImageIcon icon = new ImageIcon("icon.jpg");
        this.setIconImage(icon.getImage());
    }

    public static void main(String[] args) {
        new GUISlider();
    }
}
