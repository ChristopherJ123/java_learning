package com.guramee;

import java.util.Scanner;

public class Waytoolongwords {
    public static void main (String[] args) {
        //Variables
        Scanner scanner = new Scanner(System.in);
        String word = "";
        String wordSimplified = "";
        int length = 0;

        //Input
        word = scanner.next();

        //Logic
        length = word.length();
        if (length > 10) {
            wordSimplified = String.valueOf(word.charAt(0)) + (length - 2) + String.valueOf(word.charAt(length - 1));
        }

        //Output
        System.out.println(wordSimplified);
    }
}
