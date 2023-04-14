package com.guramee;

import java.util.Scanner;

public class GayDetector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean sterile = true;
        String input = "";

        while (sterile) {
            System.out.println("Welcome aboard, please enter your name");
            input = scanner.nextLine();
            if (!input.contains("Bryan Anthonio")) {
                System.out.println("Welcome aboard " + input);
            } else sterile = false;
        }
        System.out.println("GAY PERSON DETECTED! Initiating sterilization...");
        System.out.println(input + " has been safely ejected away to space");
    }
}
