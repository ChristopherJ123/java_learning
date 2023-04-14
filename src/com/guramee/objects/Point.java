package com.guramee.objects;

public class Point {
    float xCoord;
    float yCoord;

    Point(int x, int y) {
        this.xCoord = x;
        this.yCoord = y;
    }

    public double distance(Point p) {
        return Math.sqrt(Math.pow(Math.abs(xCoord - p.xCoord), 2) + Math.pow(Math.abs(yCoord - p.yCoord), 2));
    }

    public static double distance(Point a, Point b) {
        return Math.sqrt(Math.pow(Math.abs(a.xCoord - b.xCoord), 2) + Math.pow(Math.abs(a.yCoord - b.yCoord), 2));
    }
}
