package com.guramee.objects;

public class DiceClass {
    public static void main(String[] args) {
        Dice dice1 = new Dice();
        Dice dice2 = new Dice();

        System.out.println(dice1.roll());
        System.out.println(dice2.roll());
    }
}
