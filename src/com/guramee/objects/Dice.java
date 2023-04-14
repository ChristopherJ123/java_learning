package com.guramee.objects;

public class Dice {
    public static int roll() {
        return (int) Math.round(Math.random()*6);
    }
}
