package com.guramee;

import java.util.HashMap;
import java.util.Map;

public class Test4 {
    public static void main(String[] args) {
        Map<String, String> mapTest = new HashMap<>();
        mapTest.put("My name is", "Giorgio");
        mapTest.put("My age is", "69");
        mapTest.put("My nationality is", "French");

        Map<Integer, String> mapTest2 = new HashMap<>();
        mapTest2.put(1, "John");
        mapTest2.put(2, "Watt");
        mapTest2.put(3, "Damian");
    }
    int a;
    int b;

    public void setINT(int a, int b) {
    }

    public void printINT() {
        System.out.println("Value of a = " + a);
        System.out.println("Value of b = " + b);
    }


}
