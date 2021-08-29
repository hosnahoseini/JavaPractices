package com.company;

import java.util.Objects;

/**
 * A class for circle
 *
 * @author Hosna Oyarhoseini
 * @version 1400.1.30
 */
public class Circle {
    private int radius;

    /**
     * constructor
     * @param r radius
     */
    public Circle(int r) {
        radius = r;
    }

    /**
     * calculate circle
     *
     * @return circle perimeter
     */
    public double calculatePerimeter() {
        return Math.PI * 2 * radius;
    }

    /**
     * calculate area
     *
     * @return circle area
     */
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    /**
     * draw(print info) of circle
     */
    public void draw() {
        System.out.println("circle with radius: " + radius);
    }

    /**
     * get radius
     *
     * @return radius
     */
    public int getRadius() {
        return radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return radius == circle.radius;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
