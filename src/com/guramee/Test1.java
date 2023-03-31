package com.guramee;

import java.util.Scanner;

public class Test1 {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        int input;
        String output = "";

        input = scanner.nextInt();

        while (true) {
            if (input != 0) {
                input = input / 2;
                output = output.concat(Integer.toString(input)) + ',';
            } else break;
        }
        System.out.println(output);
    }
}
