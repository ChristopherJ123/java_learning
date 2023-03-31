package com.guramee;

import java.util.Scanner;

public class Test3 {
    public static void main (String[] args) {
        //Variables
        Scanner scanner = new Scanner(System.in);

        System.out.println(test(scanner.nextInt()));


    }
    private static int test(int a) {
        if (a == 0) return 1;
        return test(a/2) + test(a/3);
    }
}
