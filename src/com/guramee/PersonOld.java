package com.guramee;

public class PersonOld {

    private static String person_name;

    public static void name(String name_var) {
        person_name = name_var;
    }

    public static void talk() {
        System.out.println("Hello my name is " + person_name);
    }
}
