package com.guramee.objects;

public class UtilsClass {
    public static void main(String[] args) {
        int[] numbers = {100, 10, 1, 200, 2, 10000, 3};

        int maximum_number = Utils.find_max(numbers);
        System.out.println(maximum_number);
    }
}
