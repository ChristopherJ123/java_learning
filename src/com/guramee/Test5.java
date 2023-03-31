package com.guramee;

import java.util.Scanner;

public class Test5 {
    //Variables
    static Scanner scanner = new Scanner(System.in);
    static Test5 object1 = new Test5();
    static Test5 object2 = new Test5();
    int a;
    int b;

//    public void setINT(int a, int b) {
//        this.a = a;
//        this.b = b;
//    }

    public void setINT(int A, int B) {
        a = A;
        b = B;
    }

    public void printINT() {
        System.out.println("Value of a = " + a);
        System.out.println("Value of b = " + b);
    }

    public static void main (String[] args) {
        object1.setINT(scanner.nextInt(), scanner.nextInt());
        object1.printINT();

        object2.setINT(10, 8);
        object2.printINT();

        object1.printINT();
        object2.printINT();
    }
}
