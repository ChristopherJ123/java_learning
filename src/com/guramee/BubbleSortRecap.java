package com.guramee;

import java.util.Scanner;

public class BubbleSortRecap {
    static Scanner scanner = new Scanner(System.in);
    static int length;
    static int[] arrayInput;

    static void bubbleSort() {
        int temp;
        for (int i = 0; i < arrayInput.length; i++) {
            for (int j = 1; j < arrayInput.length - i; j++) {
                if (arrayInput[j-1] > arrayInput[j]) {
                    temp = arrayInput[j-1];
                    arrayInput[j-1] = arrayInput[j];
                    arrayInput[j] = temp;
                }
            }
        }
    }

    static void printArray() {
        for (int i = 0; i < arrayInput.length; i++) {
            System.out.print(arrayInput[i] + " ");
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to bubble sort");
        System.out.println("Enter array length");

        length = scanner.nextInt();
        arrayInput = new int[length];

        for (int i = 0; i < length; i++) {
            arrayInput[i] = scanner.nextInt();
        }
        bubbleSort();
        printArray();
    }
}
