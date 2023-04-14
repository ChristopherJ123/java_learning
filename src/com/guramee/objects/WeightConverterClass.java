package com.guramee.objects;

public class WeightConverterClass {
    public static void main (String[] args) {
        int weight1_kg = 55;
        int weight2_pounds = 100;

        System.out.println(weight1_kg + " converted to pounds is " + WeightConverter.kg_to_pounds(weight1_kg));
        System.out.println(weight2_pounds + " converted to kg is " + WeightConverter.pounds_to_kg(weight2_pounds));
    }
}
