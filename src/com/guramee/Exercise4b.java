package com.guramee;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.util.Scanner;

public class Exercise4b {
    public static void main(String[] args) throws FileNotFoundException {
        long startTime = System.currentTimeMillis();

        Scanner myReader = new Scanner(new File("src/com/guramee/key-value-parser.txt"));

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

        long endTime = System.currentTimeMillis();
        double resultTime = (endTime - startTime) / 1000.0;
        System.out.println(resultTime);
    }
}
