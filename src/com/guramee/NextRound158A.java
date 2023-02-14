package com.guramee;

import java.lang.reflect.Array;
import java.util.Scanner;

public class NextRound158A {
    public static void main(String[] args) {
        //Variables
        Scanner scanner = new Scanner(System.in);
        int n;
        int k;
        int j = 0;
        int[] a;
        int ans = 0;

        //Input
        n = scanner.nextInt();
        a = new int[n];
        k = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            j = Array.getInt(a, k - 1);
        }
        for (int i = 0; i < n; i++) {
            if (a[i] > 0 && a[i] >= j) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}

