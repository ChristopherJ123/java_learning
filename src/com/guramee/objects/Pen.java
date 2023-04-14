package com.guramee.objects;

public class Pen {
    String name;
    String color;
    String point_size;
    boolean clicked = false;

    public void click() {
        clicked = true;
    }

    public void unclick() {
        clicked = false;
    }

}
