package com.guramee.hangman;

import java.util.Scanner;

public class Hangman {
    public static void main (String[] args) {
        //Variables
        Scanner scanner = new Scanner(System.in);
        String input;
        int wrongAnswers = 0;
        String wrongLetters = "";
        boolean end = false;
        char b = '_';
        char r = '_';
        char y = '_';
        char a = '_';
        char n = '_';
        char i = '_';
        char s = '_';
        char g = '_';
        String[] hangmanPhase = {"""
                  WELCOME TO HANGMAN!
                  +---+
                  |   |
                      |
                      |
                      |
                      |
                ========='''
                PLEASE TYPE YOUR CHARACTER:
                _____ __ ___
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

        //Welcome Screen
        System.out.println(hangmanPhase[0]);

        while (wrongAnswers < 7) {
            if (end) break;
            //Input
            input = scanner.next().toUpperCase();

            //Periksa Input (Di for loop supaya ga perlu masukin input lagi(BUG))
            for (int k = 0; k < input.length(); k++) {
                switch (input.charAt(k)) {
                    case 'B' -> b = 'B';
                    case 'R' -> r = 'R';
                    case 'Y' -> y = 'Y';
                    case 'A' -> a = 'A';
                    case 'N' -> n = 'N';
                    case 'I' -> i = 'I';
                    case 'S' -> s = 'S';
                    case 'G' -> g = 'G';
                    default -> {
                        wrongAnswers++;
                        wrongLetters = wrongLetters.concat(String.valueOf(input.charAt(k)));
                    }
                }

                //Cek kalau sudah tamat length input
                if (k == input.length() - 1) {
                    String answer = "" + b + r + y + a + n + " " + i + s + " " + g + a + y;
                    if (wrongAnswers < 6) {
                        if (b == '_' || r == '_' || y == '_' || a == '_' || n == '_' || i == '_' || s == '_' || g == '_') {
                            System.out.println(hangmanPhase[wrongAnswers]);
                            System.out.println(answer);
                            System.out.println("WRONG LETTERS: " + wrongLetters);
                        }
                        else {
                            System.out.println(hangmanPhase[wrongAnswers]);
                            System.out.println(answer);
                            System.out.println("WRONG LETTERS: " + wrongLetters);
                            System.out.println("\n YOU WON!");
                            end = true;
                        }
                    }
                    else {
                        System.out.println(hangmanPhase[wrongAnswers]);
                        System.out.println(answer);
                        System.out.println("WRONG LETTERS: " + wrongLetters);
                        System.out.println("GAME OVER!");
                        end = true;
                    }
                }
            }
        }
    }
}
