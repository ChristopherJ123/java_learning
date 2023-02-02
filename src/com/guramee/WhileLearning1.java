package com.guramee;

import java.util.Scanner;

public class WhileLearning1 {
    public static void main (String[] args) {
        //Variables
        Scanner scanner = new Scanner(System.in);
        String str = "";

        while (!str.equals("quit")) {
            System.out.print("Input: ");
            str = scanner.next().toLowerCase();
            if (str.equals("pass"))
                continue;
            if (str.equals("quit"))
                break;
            System.out.println(str);
        }
    }
}
