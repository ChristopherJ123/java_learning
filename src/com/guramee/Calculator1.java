package com.guramee;


import java.util.Scanner;

public class Calculator1 {
    public static void main(String[] args){
        //Scanner
        Scanner scannerTOTO = new Scanner(System.in);

        //Variables
        double totalNumber = 0;

        //Inputs
        System.out.println("Please input your first number");
        double firstNumber = scannerTOTO.nextDouble();
        System.out.println("Please input your second number");
        double secondNumber = scannerTOTO.nextDouble();
        System.out.println("Please input function + - * /");
        String inputFunction = scannerTOTO.next();

        //Logic
        switch (inputFunction) {
            case "+" -> totalNumber = firstNumber + secondNumber;
            case "-" -> totalNumber = firstNumber - secondNumber;
            case "*" -> totalNumber = firstNumber * secondNumber;
            case "/" -> totalNumber = firstNumber / secondNumber;
            default -> System.out.println("You did not type the function correctly.");
        }

        System.out.println("Your final answer is " + totalNumber);
    }
}
/*
    //Old Function
        if(inputFunction.equals("+")) {
            totalNumber = firstNumber + secondNumber;
        } else if (inputFunction.equals("-")) {
            totalNumber = firstNumber - secondNumber;
        } else if (inputFunction.equals("*")) {
            totalNumber = firstNumber * secondNumber;
        } else if (inputFunction.equals("/")) {
            totalNumber = firstNumber / secondNumber;
        } else System.out.println("You did not type the function correctly.");
 */