package com.guramee;

import java.util.HashMap;
import java.util.Scanner;

public class HashmapExerciseEmojisFunction {
    static HashMap<String, String> emojis = new HashMap<>();

    static String emojisCheck(String[] words) {
        String output = "";
        for (String word : words) {
            emojis.getOrDefault(word, word);
            output = output.concat(emojis.getOrDefault(word, word)) + " ";
        }
        return output;
    }

    public static void main(String[] args) {
        emojis.put(":)", "🙂");
        emojis.put(":(", "🙁");

        Scanner scanner = new Scanner(System.in);
        String userInput;
        String[] userWords;

        userInput = scanner.nextLine();
        userWords = userInput.split(" ");

        System.out.println(emojisCheck(userWords));
    }
}
