package com.guramee;

import java.util.HashMap;
import java.util.Scanner;

// Exercise: int-numbers to string using hashmap
public class HashmapExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<String, String> identity = new HashMap<>();
        HashMap<Integer, String> numbers = new HashMap<>();

        numbers.put(1, "one");
        numbers.put(2, "two");
        numbers.put(3, "three");
        numbers.put(4, "four");
        numbers.put(5, "five");
        numbers.put(6, "six");
        numbers.put(7, "seven");
        numbers.put(8, "eight");
        numbers.put(9, "nine");
        numbers.put(0, "zero");


        identity.put("Phone number", scanner.nextLine());

        StringBuilder phone_number_string = new StringBuilder();
        for (int i = 0; i < identity.get("Phone number").length(); i++) {
            phone_number_string.append(numbers.get(Character.getNumericValue(identity.get("Phone number").charAt(i)))).append(' ');
        }
        System.out.println(phone_number_string);
    }
}
