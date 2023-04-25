package com.guramee;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) throws FileNotFoundException {
        long startTime = System.currentTimeMillis();

        File myFile = new File("src/com/guramee/key-value-parser.txt");
        Scanner myReader = new Scanner(myFile);

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

        long endTime = System.currentTimeMillis();
        double resultTime = (endTime - startTime) / 1000.0;
        System.out.println(resultTime);
    }
}
