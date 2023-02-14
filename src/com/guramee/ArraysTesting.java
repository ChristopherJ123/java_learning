package com.guramee;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysTesting {
    public static void main (String[] args) {
        //Variables
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        String[] b;
        int[] result = new int[0];
        String bString;

        //Input
        //Input n : Number of times of an array
        n = scanner.nextInt();
        b = new String[n];

        //For loop, input b : Value of a single value from array.
        for (int i = 0; i < n; i++) {
            b[i] = scanner.next();
        }

        //Replace non digits to digits with spaces
        bString = Arrays.toString(b).replaceAll("[a-zA-Z\\[\\],]", "");

        //For loop, input b to a new array
        for (int i = 0, j = 0; i < n;) {
            if (bString.charAt(n) == ' ') {
                j++;
            } else if (bString.charAt(i) >= 0 && bString.charAt(i) <= 9) {
                result[i] = bString.charAt(i);
            } else continue;
        }
        System.out.println(bString);
    }
}
