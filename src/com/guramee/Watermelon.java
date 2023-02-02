package com.guramee;

import java.util.Scanner;

public class Watermelon {
    public static void main(String[] args) {
        //Variables
        Scanner scanner = new Scanner(System.in);
        String str = "NO";

        //Input
        System.out.print("Input: ");
        int input = scanner.nextInt();

        //Logic
        if (input % 4 == 0) str = "YES";
            else str = "NO";

        System.out.println(str);
    }
}
