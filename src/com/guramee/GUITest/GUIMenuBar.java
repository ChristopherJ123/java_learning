package com.guramee.GUITest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;

public class GUIMenuBar extends JFrame implements ActionListener {

    JMenuBar menuBar = new JMenuBar();

    JMenu file = new JMenu("File");
    JMenu edit = new JMenu("Edit");
    JMenu view = new JMenu("View");

    JMenuItem loadItem = new JMenuItem("Load");
    JMenuItem saveItem = new JMenuItem("Save");
    JMenuItem exitItem = new JMenuItem("Exit");

    JFileChooser fileChooser;

    GUIMenuBar() {
        file.add(loadItem);
        file.add(saveItem);
        file.add(exitItem);

        loadItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);

        file.setMnemonic(KeyEvent.VK_F); // Alt + L
        edit.setMnemonic(KeyEvent.VK_E);
        view.setMnemonic(KeyEvent.VK_V);

        loadItem.setMnemonic(KeyEvent.VK_L);
        saveItem.setMnemonic(KeyEvent.VK_S);
        exitItem.setMnemonic(KeyEvent.VK_E);

        menuBar.add(file);
        menuBar.add(edit);
        menuBar.add(view);

        this.setTitle("setTitle goes here");
        this.setSize(400, 500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
        this.getContentPane().setBackground(Color.GREEN);
        this.setLayout(new FlowLayout());

        this.setJMenuBar(menuBar);

        ImageIcon icon = new ImageIcon("icon.jpg");
        this.setIconImage(icon.getImage());
    }

    public static void main(String[] args) {
        new GUIMenuBar();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loadItem) {
            System.out.println("load");
            fileChooser = new JFileChooser();
            int response = fileChooser.showOpenDialog(null);

            if (response == JFileChooser.APPROVE_OPTION) {
                File file1 = fileChooser.getSelectedFile();
                System.out.println(file1.getAbsolutePath());
            }
        } else if (e.getSource() == saveItem) {
            System.out.println("save");
        } else if (e.getSource() == exitItem) {
            this.dispose();
        }
    }
}
