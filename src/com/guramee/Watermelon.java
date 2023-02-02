package com.guramee;

import java.util.Scanner;

public class Watermelon {
    public static void main(String[] args) {
        //Variables
        Scanner scanner = new Scanner(System.in);
        String str = "NO";

        //Input
        int input = scanner.nextInt();

        //Logic
        if (input != 0 && input / 2 != 1 && input % 2 == 0) str = "YES";
            else str = "NO";

        System.out.println(str);
    }
}
