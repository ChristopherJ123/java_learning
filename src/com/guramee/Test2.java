package com.guramee;

import java.util.Scanner;

public class Test2 {
    public static void main (String[] args) {
        //Variables
        Scanner scanner = new Scanner(System.in);
        double calculate1;

        calculate1 = calculate(scanner.nextInt(), scanner.next(), scanner.nextInt());
        System.out.println(calculate1);
        System.out.println("The root of " + calculate1 + " = " + Math.sqrt(calculate1));

//        System.out.println(calculate(scanner.nextInt(), scanner.next() , scanner.nextInt()));

    }
    private static double calculate(double a, String b, double c) {
        switch (b) {
            case "+" : return a + c;
            case "-" : return a - c;
            case "*" : return a * c;
            case "/" : return a / c;
            case "^" : return a * (a * (c - 1));
            case "%" : return a % c;
            default :
                System.out.println("ERROR");
                return 0;
        }
    }
}
