package com.guramee;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class ArrayListTest1 {
    //hi
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        ArrayList<String> fruits = new java.util.ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Eggplant");
        fruits.add(3, "Dog");

        System.out.println(fruits);
        System.out.println("What's not a fruit?");
        input = scanner.nextLine();
        if (input.equalsIgnoreCase("dog")) {
            System.out.println("That's correct!");
            fruits.remove(3);
            System.out.println(fruits);
        }
        System.out.println("What's a word with an egg in it");
        input = scanner.nextLine();
        if (input.equalsIgnoreCase("eggplant")) {
            System.out.println("That's correct");
            fruits.remove(Objects.toString("Eggplant"));
            System.out.println(fruits);
        }
    }
}
