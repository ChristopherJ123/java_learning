package com.guramee.GUITest.loginGUI;

import com.guramee.GUITest.GUICalculatorTry1Upgrade3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Arrays;


public class LoginGUI extends JFrame implements ActionListener, KeyListener {

    JPanel usernamePanel;
    JPanel passwordPanel;
    JPanel signinPanel;
    JButton signinButton;
    JTextField userNameTextField;
    JPasswordField passwordTextField;
    JLabel staticLabel;

    char[] password = {'t', 'o', 't', 'o'};

    LoginGUI() {
        userNameTextField = new JTextField();
        userNameTextField.setPreferredSize(new Dimension(250,40));
        userNameTextField.setFont(new Font("Arial", Font.PLAIN, 16));

        passwordTextField = new JPasswordField();
        passwordTextField.setPreferredSize(new Dimension(250,40));
        passwordTextField.setFont(new Font("Arial", Font.PLAIN, 16));
        passwordTextField.addKeyListener(this);

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
        this.pack();
        this.addKeyListener(this);
    }

    public void login() {

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
        if (e.getKeyCode() == 10) {
            if (userNameTextField.getText().equals("christopherj") && Arrays.equals(passwordTextField.getPassword(), password)) {
                JOptionPane.showMessageDialog(null, "Welcome user", "Login success", JOptionPane.PLAIN_MESSAGE);
                this.dispose();
                new GUICalculatorTry1Upgrade3();
            } else
                JOptionPane.showMessageDialog(null, "Login failed", "Login failed", JOptionPane.WARNING_MESSAGE);
        }
    }
}
