package com.guramee.objects;

public class PenClass {
    public static void main(String[] args) {
        Pen sarasa_pen = new Pen();
        Pen drawing_pen = new Pen();

        sarasa_pen.name = "Sarasa Pen";
        drawing_pen.name = "Jokyo Pen";

        System.out.println(sarasa_pen.name);
        System.out.println(drawing_pen.name);

        sarasa_pen.click();
        System.out.println(sarasa_pen.clicked);
        sarasa_pen.unclick();
        System.out.println(sarasa_pen.clicked);

        drawing_pen.click();
        System.out.println(drawing_pen.clicked);
    }
}
