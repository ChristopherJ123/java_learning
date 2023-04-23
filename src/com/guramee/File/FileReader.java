package com.guramee.File;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileReader {
    public static void main(String[] args) {

        List<String> emails = new ArrayList<>();
        List<String> usernames = new ArrayList<>();
        List<String> passwords = new ArrayList<>();


        try {
            File myFile = new File("src/com/guramee/File/textfile/text.txt");
            Scanner myReader = new Scanner(myFile);
            for (int j = 0; myReader.hasNext() ; j++) {
                String word = myReader.next();
                if (j % 3 == 0) {
                    emails.add(word);
                }
                if (j % 3 == 1) {
                    usernames.add(word);
                }
                if (j % 3 == 2) {
                    passwords.add(word);
                }
            }
            myReader.close();
        } catch (IOException e) {
            System.out.println("An error occurred");
        }

        System.out.println(emails);
        System.out.println(usernames);
        System.out.println(passwords);

    }
}
