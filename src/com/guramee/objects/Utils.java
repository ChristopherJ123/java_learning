package com.guramee.objects;

public class Utils {
    // This may be static, not exactly an object
    public static int find_max(int[] array) {
        int max = array[0];
        for (int x : array) {
            if (x > max) max = x;
        }
        return max;
    }
}
