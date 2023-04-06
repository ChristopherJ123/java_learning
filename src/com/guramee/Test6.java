package com.guramee;

public class Test6 {

    Test6() {
        System.out.println("Test");
    }

    public static void main(String[] args) {
        System.out.println(5 + 5 * 5);

        new Test6();

        String a = "k";
        a += a;
        System.out.println(a);
    }
}
