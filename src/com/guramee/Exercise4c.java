package com.guramee;

import java.util.Scanner;

public class Exercise4c {
    public static void main(String[] args) {

        Scanner myReader = new Scanner(System.in);

        String header = "";
        String result = "";

        while (myReader.hasNext()) {
            String word = myReader.next();
            if (word.contains("=")) {
                System.out.println(header);
                System.out.println(result);
                header = word.split("=")[0];
                result = word.split("=")[1];
            } else
                result = result.concat(" ").concat(word);
        }
        System.out.println(header);
        System.out.println(result);
    }
}
