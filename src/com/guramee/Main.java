package com.guramee;

import java.text.NumberFormat;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("What is your age?");

        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if (age <= 17) {
            System.out.println("You're pretty underage, get outta here!");
            return;
        }
        else if (age >= 30 && age < 50) {
            System.out.println("No boomers are allowed here! Get out!");
            return;
        }
        else if (age >= 50) {
            System.out.println("No grandpas are allowed here! Get out!");
            return;
        }
        else
        System.out.println("Oh your age is " + age + ".");
        Thread.sleep(1000);

        System.out.println("What about your weight?");

        double weight = scanner.nextDouble();
        if (weight <= 45) {
            System.out.println("You are so skinny wtf, Did you eat enough foods? (yes/no)");
            String choice = scanner.next();
            if (choice.equals("yes")) {
                System.out.println("Of course not you idiot!");
            } else if (choice.equals("no")) {
                System.out.println("Then you should eat more food.");
            } else System.out.println("The answer is yes or no you idiot.");
        } else if (weight >= 70) {
            System.out.println("You are overweight.");
        } else
        System.out.println("Oh your age is " + age + " and your weight is " + weight + "... Interesting.");


//        Number Format Func
//        NumberFormat idr = NumberFormat.getCurrencyInstance();
//        String uang = idr.format(50000);
//
//        String percent = NumberFormat.getPercentInstance().format(0.5);
//
//        System.out.println(uang);
//        System.out.println(percent);
    }
}