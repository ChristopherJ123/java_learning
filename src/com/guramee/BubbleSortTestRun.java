package com.guramee;

import java.util.Scanner;

public class BubbleSortTestRun {
    //Variables

    public static void main(String[] args) {
        long x = System.currentTimeMillis();

        int[] arrayInput = new int[100000];

        //Input Array
        for (int i = 0; i < arrayInput.length; i++) {
            arrayInput[i] = arrayInput.length-i;
        }

        System.out.print("BEFORE BUBBLE SORT: ");
        printArray(arrayInput);

        bubbleSort(arrayInput);

        System.out.println();
        System.out.print("AFTER BUBBLE SORT: ");
        printArray(arrayInput);

        long y = System.currentTimeMillis();
        System.out.println("The time it takes is " + (y-x) + " MS");
        System.out.println(x);
        System.out.println(y);
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
