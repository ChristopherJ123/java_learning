package com.guramee.objects;

public class PointClass {
    public static void main(String[] args) {
        Point2 pointA = new Point2(0, 0);
        Point2 pointB = new Point2(3, 4);

        double distance = Point2.distance(pointA, pointB);
        System.out.println(distance);
        distance = pointA.distance(pointB);
        System.out.println(distance);
    }
}
