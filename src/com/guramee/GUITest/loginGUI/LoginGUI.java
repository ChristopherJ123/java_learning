package com.guramee.GUITest.loginGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class LoginGUI extends JFrame implements ActionListener, KeyListener {

    JPanel usernamePanel;
    JPanel passwordPanel;
    JPanel signinPanel;
    JButton signinButton;
    JTextField userNameTextField;
    JPasswordField passwordTextField;
    JLabel staticLabel;

    LoginGUI() {
        userNameTextField = new JTextField();
        userNameTextField.setPreferredSize(new Dimension(250,40));
        userNameTextField.setFont(new Font("Arial", Font.PLAIN, 16));

        passwordTextField = new JPasswordField();
        passwordTextField.setPreferredSize(new Dimension(250,40));
        passwordTextField.setFont(new Font("Arial", Font.PLAIN, 16));

        usernamePanel = new JPanel();
        usernamePanel.setLayout(new FlowLayout());
        staticLabel = new JLabel("Username");
        usernamePanel.add(staticLabel);
        usernamePanel.add(userNameTextField, BorderLayout.EAST);

        passwordPanel = new JPanel();
        passwordPanel.setLayout(new FlowLayout());
        staticLabel = new JLabel("Password");
        passwordPanel.add(staticLabel);
        passwordPanel.add(passwordTextField, BorderLayout.EAST);

        signinPanel = new JPanel();
        signinPanel.setLayout(new FlowLayout());
        signinButton = new JButton("Login");
        signinButton.addActionListener(this);
        signinPanel.add(signinButton);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setLayout(new GridLayout(3,1));

        this.add(usernamePanel);
        this.add(passwordPanel);
        this.add(signinPanel);
        this.addKeyListener(this);
        this.pack();
    }

    public static void main(String[] args) {
        new LoginGUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == signinButton) {
            System.out.println(userNameTextField.getText());
            System.out.println(passwordTextField.getPassword());
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println(e.getKeyChar());
    }
}
