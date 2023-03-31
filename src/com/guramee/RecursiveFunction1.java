package com.guramee;

import java.util.Scanner;

public class RecursiveFunction1 {
    public static void main (String[] args) {
        //Variables
        Scanner scanner = new Scanner(System.in);
        int n;
        int m;
        int calc1;
        int calc2;
        int ans = 0;
        String concatString1 = "";
        String concatString2 = "";
        boolean condition1 = true;
        boolean condition2 = true;


        //Input
        n = scanner.nextInt();

        m = n;
        calc1 = n;
        calc2 = m;

        //Logic
        // F(n) = F(n/2) + F(n/3)
        //Misal: 4
        while (condition1 || condition2) {
            if (calc1 != 0) {
                calc1 = calc1 / 2;
                concatString1 = concatString1.concat(Integer.toString(calc1)) + ',';
                System.out.println(concatString1);
            } else condition1 = false;
            if (calc2 != 0) {
                calc2 = calc2 / 3;
                concatString2 = concatString2.concat(Integer.toString(calc2)) + ',';
            } else condition2 = false;
        }

        System.out.println(concatString1);
        System.out.println(concatString2);
    }
}
