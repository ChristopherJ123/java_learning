package com.guramee.GUITest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUIButton extends JFrame implements ActionListener, KeyListener {

    JButton button1;
    JButton button2;
    JLabel gurameeLabel;

    GUIButton() {

        //JButton
        button1 = new JButton("1");
        button1.setBounds(0, 0, 200, 200);
        button1.addActionListener(this);
        button1.setFocusable(false);
        button1.setBorder(BorderFactory.createEtchedBorder());
        button1.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                button1.setBackground(Color.GREEN);
            }
            public void mouseExited(MouseEvent e) {
                button1.setBackground(Color.RED);
            }
        });

        button2 = new JButton("2");
        button2.setBounds(300, 0, 200, 200);
        button2.addActionListener(this);
        button2.setFocusable(false);

        //JLabel
        gurameeLabel = new JLabel();
        gurameeLabel.setBounds(200, 250, 100, 100);
        ImageIcon gurameeIcon = new ImageIcon(new ImageIcon("C:\\Youtube\\Modding\\hello world\\src\\com\\guramee\\GUITest\\icon.jpg").getImage().getScaledInstance(gurameeLabel.getWidth(), gurameeLabel.getHeight(), Image.SCALE_DEFAULT));
        gurameeLabel.setIcon(gurameeIcon);
        gurameeLabel.setVisible(false);

        //JFrame
        this.setTitle("Title goes here");
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setVisible(true);

        this.add(button1);
        this.add(button2);
        this.add(gurameeLabel);
    }

    public static void main(String[] args) {
        new GUIButton();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {
            gurameeLabel.setVisible(true);
        }
        if (e.getSource() == button2) {
            gurameeLabel.setVisible(false);
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println("keyTyped");

    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("keyPressed");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("keyReleased");

    }
}
