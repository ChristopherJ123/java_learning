package com.guramee.objects;

public class WeightConverter {
    public static double kg_to_pounds(int weight) {
        return weight / 0.45;
    }

    public static double pounds_to_kg(int weight) {
        return weight * 0.45;
    }
}
