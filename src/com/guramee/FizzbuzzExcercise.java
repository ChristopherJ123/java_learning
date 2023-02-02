package com.guramee;

import java.util.Scanner;

public class FizzbuzzExcercise {
    public static void main(String[] args) {
        //Variable
        Scanner scannerTOTO = new Scanner(System.in);
        String str;

        //Input
        System.out.println("Enter your number");
        double input = scannerTOTO.nextDouble();

        //Logic
        if (input % 3 == 0 && input % 5 == 0) {
            str = "FizzBuzz";
            } else if (input % 3 == 0) {
            str = "Buzz";
            } else if (input % 5 == 0) {
            str = "Fizz";
        } else str = String.valueOf(input);

        System.out.println(str);
    }
}
