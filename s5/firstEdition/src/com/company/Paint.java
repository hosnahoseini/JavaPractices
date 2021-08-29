package com.company;

import java.util.ArrayList;
/**
 * A class to keep shapes. Add, print, draw them.
 *
 * @author Hosna Oyarhoseini
 * @version 1400.1.30
 */
public class Paint {
    ArrayList<Circle> circles = new ArrayList<>();
    ArrayList<Triangle> triangles = new ArrayList<>();
    ArrayList<Rectangle> rectangles = new ArrayList<>();

    /**
     * add a circle
     *
     * @param circle circle
     */
    public void addCircle(Circle circle) {
        circles.add(circle);
    }

    /**
     * add a rectangle
     *
     * @param rectangle rectangle
     */
    public void addRectangle(Rectangle rectangle) {
        rectangles.add(rectangle);
    }

    /**
     * add a triangle
     *
     * @param triangle triangle
     */
    public void addTriangle(Triangle triangle) {
        triangles.add(triangle);
    }

    /**
     * print all shape info
     */
    public void printAll() {
        System.out.println("PRINT ALL");
        System.out.println("circles");
        for (Circle circle : circles)
            System.out.println(circle.toString());
        System.out.println("rectangles");
        for (Rectangle rectangle : rectangles)
            System.out.println(rectangle.toString());
        System.out.println("triangles");
        for (Triangle triangle : triangles)
            System.out.println(triangle.toString());
    }

    /**
     * draw(print info) all shapes
     */
    public void drawAll() {
        System.out.println("DRAW ALL");
        for (Circle circle : circles)
            circle.draw();
        for (Rectangle rectangle : rectangles)
            rectangle.draw();
        for (Triangle triangle : triangles)
            triangle.draw();
    }

}
