package com.guramee;

public class Person {

    String person_name;
    int person_age;
    char person_gender;

    Person(String name) {
        this.person_name = name;
    }

    Person(String name, int age) {
        this.person_name = name;
        this.person_age = age;
    }

    Person(String name, char gender) {
        this.person_name = name;
        this.person_gender = gender;
    }

    Person(String name, int age, char gender) {
        // Pake `this.` method kalau nama variable sama dengan variable place holder (contoh: this.name = name)
        this.person_name = name;
        this.person_age = age;
        this.person_gender = gender;
    }

    public void talk() {
        System.out.println("Hello my name is " + this.person_name + ".");
    }
}
