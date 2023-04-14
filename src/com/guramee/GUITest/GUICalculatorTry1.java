package com.guramee.GUITest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUICalculatorTry1 extends JFrame implements ActionListener {

    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    JButton button5;
    JButton button6;
    JButton button7;
    JButton button8;
    JButton button9;
    JButton button0;
    JButton buttonDecimal;
    JButton plusButton;
    JButton minusButton;
    JButton multiplyButton;
    JButton divideButton;
    JButton equalButton;
    JButton backwardButton;
    JButton clearButton;

    JLabel displayLabel;

    String input = "";
    String inputDisplay = "";
    double value1;
    double value2;
    double answer;
    char expression;
    boolean input1Complete;

    GUICalculatorTry1() {

        //JButton
        button1 = new JButton("1");
        button1.setPreferredSize(new Dimension(150, 150));
        button1.addActionListener(this);

        button2 = new JButton("2");
        button2.setPreferredSize(new Dimension(150, 150));
        button2.addActionListener(this);

        button3 = new JButton("3");
        button3.setPreferredSize(new Dimension(150, 150));
        button3.addActionListener(this);

        button4 = new JButton("4");
        button4.setPreferredSize(new Dimension(150, 150));
        button4.addActionListener(this);

        button5 = new JButton("5");
        button5.setPreferredSize(new Dimension(150, 150));
        button5.addActionListener(this);

        button6 = new JButton("6");
        button6.setPreferredSize(new Dimension(150, 150));
        button6.addActionListener(this);

        button7 = new JButton("7");
        button7.setPreferredSize(new Dimension(150, 150));
        button7.addActionListener(this);

        button8 = new JButton("8");
        button8.setPreferredSize(new Dimension(150, 150));
        button8.addActionListener(this);

        button9 = new JButton("9");
        button9.setPreferredSize(new Dimension(150, 150));
        button9.addActionListener(this);

        button0 = new JButton("0");
        button0.setPreferredSize(new Dimension(150, 150));
        button0.addActionListener(this);

        buttonDecimal = new JButton(",");
        buttonDecimal.setPreferredSize(new Dimension(150, 150));
        buttonDecimal.addActionListener(this);

        plusButton = new JButton("+");
        plusButton.setPreferredSize(new Dimension(100, 100));
        plusButton.addActionListener(this);

        minusButton = new JButton("-");
        minusButton.setPreferredSize(new Dimension(100, 100));
        minusButton.addActionListener(this);

        multiplyButton = new JButton("*");
        multiplyButton.setPreferredSize(new Dimension(100, 100));
        multiplyButton.addActionListener(this);

        divideButton = new JButton("/");
        divideButton.setPreferredSize(new Dimension(100, 100));
        divideButton.addActionListener(this);

        equalButton = new JButton("=");
        equalButton.setPreferredSize(new Dimension(100, 100));
        equalButton.addActionListener(this);

        backwardButton = new JButton("<-");
        backwardButton.setPreferredSize(new Dimension(100, 100));
        backwardButton.addActionListener(this);

        clearButton = new JButton("C");
        clearButton.setPreferredSize(new Dimension(100, 100));
        clearButton.addActionListener(this);

        //JLabel
        displayLabel = new JLabel();
        displayLabel.setText("");
        displayLabel.setPreferredSize(new Dimension(24 * displayLabel.getText().length(), 100));
        displayLabel.setLayout(new BorderLayout());
        displayLabel.setFont(new Font("Times New Roman", Font.BOLD, 48));
        displayLabel.setBackground(Color.RED);
        displayLabel.setOpaque(true);

        //JPanel

        JPanel calcBodyPanel = new JPanel();
        calcBodyPanel.setPreferredSize(new Dimension(400, 600));
        calcBodyPanel.setBackground(Color.GREEN);
        calcBodyPanel.setOpaque(true);
        calcBodyPanel.setLayout(new GridLayout(4, 3, 15, 15));
        calcBodyPanel.add(button1);
        calcBodyPanel.add(button2);
        calcBodyPanel.add(button3);
        calcBodyPanel.add(button4);
        calcBodyPanel.add(button5);
        calcBodyPanel.add(button6);
        calcBodyPanel.add(button7);
        calcBodyPanel.add(button8);
        calcBodyPanel.add(button9);
        calcBodyPanel.add(buttonDecimal);
        calcBodyPanel.add(button0);

        JPanel expressionBodyPanel = new JPanel();
        expressionBodyPanel.setPreferredSize(new Dimension(200, 600));
        expressionBodyPanel.setBackground(Color.ORANGE);
        expressionBodyPanel.setOpaque(true);
        expressionBodyPanel.setLayout(new GridLayout(4, 2, 8, 8));
        expressionBodyPanel.add(plusButton);
        expressionBodyPanel.add(equalButton);
        expressionBodyPanel.add(minusButton);
        expressionBodyPanel.add(backwardButton);
        expressionBodyPanel.add(multiplyButton);
        expressionBodyPanel.add(clearButton);
        expressionBodyPanel.add(divideButton);

        JPanel bodyDown = new JPanel();
        bodyDown.setPreferredSize(new Dimension(600,600));
        bodyDown.setLayout(new FlowLayout(FlowLayout.LEFT,0,0));
        bodyDown.add(calcBodyPanel, BorderLayout.WEST);
        bodyDown.add(expressionBodyPanel, BorderLayout.EAST);

        JPanel bodyUp = new JPanel();
        bodyUp.setPreferredSize(new Dimension(600, 100));
        bodyUp.setLayout(new BorderLayout());
        bodyUp.setBackground(Color.CYAN);
        bodyUp.add(displayLabel, BorderLayout.EAST);

        JPanel body = new JPanel();
        body.setLayout(new BorderLayout());
        body.add(bodyUp, BorderLayout.NORTH);
        body.add(bodyDown, BorderLayout.SOUTH);

        //JFrame
        this.setTitle("Calculator");
        this.setSize(600, 700);
        this.setVisible(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());

        //Design
        this.add(body);
        this.pack();
    }

    public void updateDisplay() {
        displayLabel.setText(inputDisplay);
        displayLabel.setPreferredSize(new Dimension(25 * displayLabel.getText().length(), 100));
    }

    public void expression() {

        if (input1Complete) {
            value2 = Double.parseDouble(input.replace(',', '.'));

            if (expression == '+') answer = value1 + value2;
            else if (expression == '-') answer = value1 - value2;
            else if (expression == '*') answer = value1 * value2;
            else if (expression == '/') answer = value1 / value2;

            inputDisplay = Double.toString(answer);
            updateDisplay();

            input = Double.toString(answer);
            value2 = 0;
            input1Complete = false;
        }
        else {

            value1 = Double.parseDouble(input.replace(',', '.'));
            updateDisplay();
            input1Complete = true;
            input = "";
        }
    }

    public static void main(String[] args) {
        new GUICalculatorTry1();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {
            input = input.concat(button1.getText());
            inputDisplay = inputDisplay.concat(button1.getText());
            updateDisplay();
        }
        if (e.getSource() == button2) {
            input = input.concat(button2.getText());
            inputDisplay = inputDisplay.concat(button2.getText());
            updateDisplay();
        }
        if (e.getSource() == button3) {
            input = input.concat(button3.getText());
            inputDisplay = inputDisplay.concat(button3.getText());
            updateDisplay();
        }
        if (e.getSource() == button4) {
            input = input.concat(button4.getText());
            inputDisplay = inputDisplay.concat(button4.getText());
            updateDisplay();
        }
        if (e.getSource() == button5) {
            input = input.concat(button5.getText());
            inputDisplay = inputDisplay.concat(button5.getText());
            updateDisplay();
        }
        if (e.getSource() == button6) {
            input = input.concat(button6.getText());
            inputDisplay = inputDisplay.concat(button6.getText());
            updateDisplay();
        }
        if (e.getSource() == button7) {
            input = input.concat(button7.getText());
            inputDisplay = inputDisplay.concat(button7.getText());
            updateDisplay();
        }
        if (e.getSource() == button8) {
            input = input.concat(button8.getText());
            inputDisplay = inputDisplay.concat(button8.getText());
            updateDisplay();
        }
        if (e.getSource() == button9) {
            input = input.concat(button9.getText());
            inputDisplay = inputDisplay.concat(button9.getText());
            updateDisplay();
        }
        if (e.getSource() == button0) {
            input = input.concat(button0.getText());
            inputDisplay = inputDisplay.concat(button0.getText());
            updateDisplay();
        }
        if (e.getSource() == buttonDecimal) {
            input = input.concat(buttonDecimal.getText());
            inputDisplay = inputDisplay.concat(buttonDecimal.getText());
            updateDisplay();
        }
        if (e.getSource() == clearButton) {
            input = "";
            inputDisplay = "";
            updateDisplay();
            input1Complete = false;
        }


        if (e.getSource() == plusButton) {
            inputDisplay = inputDisplay.concat(plusButton.getText());
            expression = plusButton.getText().charAt(0);
            expression();
        }
        if (e.getSource() == minusButton) {
            inputDisplay = inputDisplay.concat(minusButton.getText());
            expression = minusButton.getText().charAt(0);
            expression();
        }
        if (e.getSource() == multiplyButton) {
            inputDisplay = inputDisplay.concat(multiplyButton.getText());
            expression = multiplyButton.getText().charAt(0);
            expression();
        }
        if (e.getSource() == divideButton) {
            inputDisplay = inputDisplay.concat(divideButton.getText());
            expression = divideButton.getText().charAt(0);
            expression();
        }
        if (e.getSource() == equalButton) {
            inputDisplay = inputDisplay.concat(equalButton.getText());
            expression();
        }


    }
}
