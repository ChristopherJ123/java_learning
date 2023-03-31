package com.guramee;

import java.util.Scanner;

public class BubbleSortTest {
    //Variables
    static Scanner scanner = new Scanner(System.in);
    static int length;

    public static void main(String[] args) {
        length = scanner.nextInt();
        int[] arrayInput = new int[length];

        //Input Array
        for (int i = 0; i < length; i++) {
            arrayInput[i] = scanner.nextInt();
        }

        System.out.print("BEFORE BUBBLE SORT: ");
        printArray(arrayInput);

        bubbleSort(arrayInput);

        System.out.println();
        System.out.print("AFTER BUBBLE SORT: ");
        printArray(arrayInput);
    }

    static void printArray(int[] arrayPrint) {
        for (int i = 0; i < arrayPrint.length; i++) {
            System.out.print(arrayPrint[i] + " ");
        }
    }

    static void bubbleSort(int[] arrayBubbleSort) {
        int temp;
        for (int i = 0; i < arrayBubbleSort.length; i++) {
            for (int j = 1; j < arrayBubbleSort.length - i; j++) {
                if (arrayBubbleSort[j-1] > arrayBubbleSort[j]) {
                    temp = arrayBubbleSort[j-1];
                    arrayBubbleSort[j-1] = arrayBubbleSort[j];
                    arrayBubbleSort[j] = temp;
                }
            }
        }
    }
}
