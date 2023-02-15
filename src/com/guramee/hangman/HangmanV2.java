package com.guramee.hangman;

import java.util.Scanner;

public class HangmanV2 {
    public static void main (String[] args) {
        //Variables
        Scanner scanner = new Scanner(System.in);
        String question;
        String input;
        String wrongLetters = "";
        String inputtedLetters = "";
        int wrongAnswers = 0;
        int ansCheck = 0;
        boolean charCheck = false;
        String[] hangmanPhase = {"""
                  WELCOME TO HANGMAN!
                  +---+
                  |   |
                      |
                      |
                      |
                      |
                ========='''

                """,
                """
                  +---+
                  |   |
                  O   |
                      |
                      |
                      |
                ========='''
                """,
                """
                  +---+
                  |   |
                  O   |
                  |   |
                      |
                      |
                ========='''

                """,
                """
                  +---+
                  |   |
                  O   |
                 /|   |
                      |
                      |
                ========='''
                """,
                """
                  +---+
                  |   |
                  O   |
                 /|\\  |
                      |
                      |
                ========='''
                """,
                """
                  +---+
                  |   |
                  O   |
                 /|\\  |
                 /    |
                      |
                ========='''
                """,
                """
                  +---+
                  |   |
                  O   |
                 /|\\  |
                 / \\  |
                      |
                ========='''
                """};

        //Welcome screen

        //Input
        System.out.println("INPUT YOUR QUESTION:");
        question = scanner.nextLine().toUpperCase();
        char[] questionChars = new char[question.length()];
        char[] questionCensored = new char[question.length()];

        //Assign question chars into variable
        for (int i = 0; i < question.length(); i++) {
            questionChars[i] = question.charAt(i);
        }

        //Make Censored Question
        for (int i = 0; i < question.length(); i++) {
            if (questionChars[i] != ' ') {
                questionCensored[i] = '_';
            } else
                questionCensored[i] = ' ';
        }

        //Logic
        while (wrongAnswers < 6) {
            System.out.println(hangmanPhase[wrongAnswers] + "PLEASE TYPE YOUR CHARACTER: ");
            System.out.println(questionCensored);
            System.out.println("Wrong Letters: "  + wrongLetters);

            //Win check
            if (ansCheck == question.replace(" ", "").length()) {
                System.out.println("\nYOU WIN!" + "\nThe word was: " + question);
            }

            //Input
            input = scanner.nextLine().toUpperCase();

            //Misal input: ASD
            for (int i = 0; i < input.length(); i++) {

                //Check already inputted
                for (int k = 0; k < inputtedLetters.length(); k++){
                    if (input.charAt(i) == inputtedLetters.charAt(k)) {
                        System.out.println("You already inputted this character!");
                        charCheck = true;
                        break;
                    }
                }
                if (charCheck) {
                    charCheck = false;
                    break;
                }

                for (int j = 0; j < question.length(); j++) {
                    //Cek Input[i] == Question[j1, j2, j3, j4, j5]
                    if (input.charAt(i) == questionChars[j]) {
                        questionCensored[j] = input.charAt(i);
                        inputtedLetters = inputtedLetters.concat(Character.toString(input.charAt(i)));
                        charCheck = true;
                        ansCheck++;
                    }
                }
                if (!charCheck) {
                    inputtedLetters = inputtedLetters.concat(Character.toString(input.charAt(i)));
                    wrongLetters = wrongLetters.concat(Character.toString(input.charAt(i)));
                    wrongAnswers++;
                } else
                    charCheck = false;
            }
        }
        //Lose part :)
        System.out.println(hangmanPhase[wrongAnswers] + "\nWrong Letters: " + wrongLetters + "\nYOU LOST! :(");
    }
}
