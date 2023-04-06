package com.guramee;

import java.util.Scanner;

public class Functions {
    static void greetUser(String userName) {
        System.out.println("Hi " + userName);
    }

    static int squareRoot(int number) {
        return number * number;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        String number_input;
        int answer;

        name = scanner.nextLine();
        greetUser(name);

        number_input = scanner.nextLine();
        answer = squareRoot(Integer.parseInt(number_input));
        System.out.println(answer);
    }
}
