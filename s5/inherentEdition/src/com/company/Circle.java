package com.company;

/**
 * A class for circle
 *
 * @author Hosna Oyarhoseini
 * @version 1400.1.30
 */
public class Circle extends Shape {
    private int radius;

    /**
     * constructor
     * @param radius radius
     */
    public Circle(int radius) {
        this.radius = radius;
    }

    /**
     * get radius
     *
     * @return radius
     */
    public int getRadius() {
        return radius;
    }

    /**
     * calculate circle
     *
     * @return circle perimeter
     */
    @Override
    public double calculatePerimeter() {
        return Math.PI * 2 * radius;
    }

    /**
     * calculate area
     *
     * @return circle area
     */
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    /**
     * draw(print info) of circle
     */
    @Override
    public void draw() {
        System.out.println("circle with radius: " + radius);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return radius == circle.radius;
    }

    @Override
    public String toString() {
        return "Circle: " +
                "radius: " + radius;
    }
}
