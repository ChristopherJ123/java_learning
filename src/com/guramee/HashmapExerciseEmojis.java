package com.guramee;

import java.util.HashMap;
import java.util.Scanner;

public class HashmapExerciseEmojis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        StringBuilder output = new StringBuilder("");

        HashMap<String, String> emojis = new HashMap<>();
        emojis.put(":)", "🙂");
        emojis.put(":(", "🙁");

        input = scanner.nextLine();
        String[] inputWords = input.split(" ");
        for (String inputWord : inputWords) {
            output.append(emojis.getOrDefault(inputWord, inputWord)).append(' ');
        }
        System.out.println(output);
    }
}
