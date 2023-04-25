package com.guramee.GUITest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

public class GUIKeyBind {

    JFrame frame;
    JLabel label;

    Action upAction;
    Action rightAction;
    Action downAction;
    Action leftAction;

    GUIKeyBind() {
        frame = new JFrame();
        frame.setTitle("setTitle goes here");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.GREEN);
        frame.setLayout(null);

        label = new JLabel();
        label.setBackground(Color.RED);
        label.setSize(100,100);
        label.setBounds(100,100,100,100);
        label.setOpaque(true);

        upAction = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setLocation(label.getX(), label.getY()-10);
            }
        };
        rightAction = new RightAction();
        downAction = new DownAction();
        leftAction = new LeftAction();

        label.getInputMap().put(KeyStroke.getKeyStroke("UP"), "upAction");
        label.getActionMap().put("upAction", upAction);
        label.getInputMap().put(KeyStroke.getKeyStroke("RIGHT"), "rightAction");
        label.getActionMap().put("rightAction", rightAction);
        label.getInputMap().put(KeyStroke.getKeyStroke("DOWN"), "downKey");
        label.getActionMap().put("downKey", downAction);
        label.getInputMap().put(KeyStroke.getKeyStroke("LEFT"), "leftAction");
        label.getActionMap().put("leftAction", leftAction);

        frame.add(label);
    }

    public static void main(String[] args) {
        new GUIKeyBind();
    }

    public class UpAction extends AbstractAction {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }
    public class RightAction extends AbstractAction {
        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX()+10, label.getY());
        }
    }
    public class DownAction extends AbstractAction {
        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX(), label.getY()+10);
        }
    }
    public class LeftAction extends AbstractAction {
        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX()-10, label.getY());
        }
    }
}
