package com.guramee;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator implements ActionListener {

    private final JTextField displayField;
    private double num1;
    private double result;
    private String operator;

    public Calculator() {
        JFrame frame = new JFrame("Calculator");
        frame.setLayout(new BorderLayout());

        displayField = new JTextField();
        displayField.setHorizontalAlignment(JTextField.RIGHT);
        frame.add(displayField, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4));

        String[] buttonLabels = {"7", "8", "9", "+", "4", "5", "6", "-", "1", "2", "3", "*", "C", "0", "=", "/"};

        for (int i = 0; i < buttonLabels.length; i++) {
            JButton button = new JButton(buttonLabels[i]);
            button.addActionListener(this);
            buttonPanel.add(button);
        }

        frame.add(buttonPanel, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent event) {
        String command = event.getActionCommand();

        if (command.equals("+")) {
            num1 = Double.parseDouble(displayField.getText());
            operator = "+";
            displayField.setText("");
        }
        else if (command.equals("-")) {
            num1 = Double.parseDouble(displayField.getText());
            operator = "-";
            displayField.setText("");
        }
        else if (command.equals("*")) {
            num1 = Double.parseDouble(displayField.getText());
            operator = "*";
            displayField.setText("");
        }
        else if (command.equals("/")) {
            num1 = Double.parseDouble(displayField.getText());
            operator = "/";
            displayField.setText("");
        }
        else if (command.equals("=")) {
            double num2 = Double.parseDouble(displayField.getText());
            if (operator.equals("+")) {
                result = num1 + num2;
            }
            else if (operator.equals("-")) {
                result = num1 - num2;
            }
            else if (operator.equals("*")) {
                result = num1 * num2;
            }
            else if (operator.equals("/")) {
                result = num1 / num2;
            }
            displayField.setText(Double.toString(result));
        }
        else if (command.equals("C")) {
            displayField.setText("");
        }
        else {
            String currentText = displayField.getText();
            displayField.setText(currentText + command);
        }
    }

    public static void main(String[] args) {
        new Calculator1();
    }
}
