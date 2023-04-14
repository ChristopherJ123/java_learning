package com.guramee;

public class Class {
    public static void main(String[] args) {
        Person person1 = new Person("Christopher Joshua", 18, 'M');
        Person koboKanaeru = new Person("Kobo Kanaeru", 'F');
        Person rock = new Person("rock", 20000);

        person1.talk();
        koboKanaeru.talk();
    }
}
