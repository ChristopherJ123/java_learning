package com.guramee;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        String finalSentence = "";

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String[] words = input.split("[ ]");

        for (String word : words) {
            if (word.contains("=")) {
                System.out.println();
            }
            String word2 = word + " ";
            if (word2.contains("=")) {
                String[] words3 = word2.split("=");
                System.out.print(words3[0].trim() + "\n" + words3[1]);
            } else
                finalSentence = word2.concat(word2);
            System.out.println(finalSentence);
        }
    }
}
