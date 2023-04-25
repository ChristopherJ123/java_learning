package com.guramee;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) throws FileNotFoundException {
        Long startTie = System.currentTimeMillis();

        File textfile = new File("src/com/guramee/key-value-parser.txt");

        Scanner scanner = new Scanner(textfile);

        String input = scanner.nextLine();

        String[] words = input.split("[ ]");

        for (String word : words) {
            if (word.contains("=")) {
                System.out.println();
            }
            String word2 = word + " ";
            if (word2.contains("=")) {
                String[] words3 = word2.split("=");
                System.out.print(words3[0] + "\n" + words3[1]);
            } else
                System.out.print(word2);
        }
        Long stopTime = System.currentTimeMillis();
        System.out.println((stopTime - startTie) / 1000);
    }
}