package com.guramee;

import java.io.IOException;
import java.util.Scanner;

public class ClearScreenTest {
    public static void main(String[] args) throws IOException, InterruptedException {
        //variables
        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("Hello world");
        input = scanner.next();

        System.out.println("Test");
        System.out.print("asd \033[H\033[2J asd");
        System.out.flush();
        input = scanner.next();
        final String os = System.getProperty("os.name");
        if (os.contains("Windows"))
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        else
            Runtime.getRuntime().exec("clear");

    }
}
