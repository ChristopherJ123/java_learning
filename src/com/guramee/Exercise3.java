package com.guramee;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Long startTie = System.currentTimeMillis();
        try {
            File myFile = new File("src/com/guramee/key-value-parser.txt");
            Scanner scanner = new Scanner(myFile);
            while (scanner.hasNextLine()) {
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
                    } else {
                        System.out.print(word2);
                    }
                }
            }
            scanner.close();
        } catch (IOException e) {
            System.out.println("Error while reading file");
            e.printStackTrace();
        }
        Long stopTime = System.currentTimeMillis();
        double result = (stopTime - startTie) / 1000.0;
        System.out.println((result));
    }
}