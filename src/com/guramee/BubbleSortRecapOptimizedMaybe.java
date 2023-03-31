package com.guramee;

import java.util.Scanner;

public class BubbleSortRecapOptimizedMaybe {
    static Scanner scanner = new Scanner(System.in);

    static void bubbleSort(int[] arrayBubbleSorted) {
        int temp;
        for (int i = 0; i < arrayBubbleSorted.length; i++) {
            for (int j = 1; j < arrayBubbleSorted.length - i; j++) {
                if (arrayBubbleSorted[j-1] > arrayBubbleSorted[j]) {
                    temp = arrayBubbleSorted[j-1];
                    arrayBubbleSorted[j-1] = arrayBubbleSorted[j];
                    arrayBubbleSorted[j] = temp;
                }
            }
        }
    }

    static void printArray(int[] arrayPrint) {
        for (int i = 0; i < arrayPrint.length; i++) {
            System.out.print(arrayPrint[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arrayInput;
        int length;

        System.out.println("Welcome to bubble sort");
        System.out.println("Enter array length");

        length = scanner.nextInt();
        arrayInput = new int[length];

        for (int i = 0; i < length; i++) {
            arrayInput[i] = scanner.nextInt();
        }
        bubbleSort(arrayInput);
        printArray(arrayInput);
    }
}
