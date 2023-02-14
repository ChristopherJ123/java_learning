package com.guramee;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class NextRound {
    public static void main(String[] args) {
        //Variables
        Scanner scanner = new Scanner(System.in);
        int n;
        int k;
        int[] a;
        int ans = 0;

        //Input
            n = scanner.nextInt();
        a = new int[n];
            k = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            if (a[i] >= k) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
