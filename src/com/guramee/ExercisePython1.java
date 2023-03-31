package com.guramee;

import java.util.Arrays;

public class ExercisePython1 {

    static int length;

    static int[] arrayDuplicateCheck(int[] arrDupCheck) {
        int[] tempArray = new int[arrDupCheck.length];
        int temp = 0;
        Arrays.sort(arrDupCheck);
        for (int i = 1; i < arrDupCheck.length; i++) {
            if (arrDupCheck[i-1] != arrDupCheck[i]) {
                tempArray[temp] = arrDupCheck[i-1];
                temp++;
            }
            length = temp;
            if (i == arrDupCheck.length-1) {
                tempArray[temp] = arrDupCheck[i];
            }
        }
        return tempArray;
    }

    static void printArray(int[] arrayPrint, int length) {
        for (int i = 0; i <= length; i++) {
            System.out.print(arrayPrint[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 2, 5, 5, 1, 9, 666, 420, 123, 123, 123, 6, 6, 6, 1, 77};
        int[] arrayChecked = arrayDuplicateCheck(array);
        printArray(arrayChecked, length);

    }
}
