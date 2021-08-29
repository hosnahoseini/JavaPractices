package com.company;

import java.util.ArrayList;
import java.util.Objects;

/**
 * A class for triangle
 *
 * @author Hosna Oyarhoseini
 * @version 1400.1.30
 */

public class Triangle {
    private ArrayList<Integer> sides = new ArrayList<>();

    /**
     * constructor
     * @param a first side
     * @param b second side
     * @param c third side
     */
    public Triangle(int a, int b, int c) {
        sides.add(a);
        sides.add(b);
        sides.add(c);
    }

    /**
     * check if the rectangle is equilateral or not
     *
     * @return true if its a equilateral
     */
    public boolean isEquilateral() {
        if (sides.get(0).equals(sides.get(1)) && sides.get(1).equals(sides.get(2)))
            return true;
        return false;
    }

    /**
     * calculate triangle
     *
     * @return triangle perimeter
     */
    public double calculatePerimeter() {
        return sides.get(0) + sides.get(1) + sides.get(2);
    }

    /**
     * calculate area
     *
     * @return rectangle area
     */
    public double calculateArea() {
        if (isEquilateral())
            return sides.get(0) * sides.get(0) * Math.sqrt(3 / 4) / 2;
        else {
            System.out.println("I need angle:(");
            return -1;
        }
    }

    /**
     * draw(print info) of triangle
     */
    public void draw() {
        System.out.println("triangle with sides: " +
                sides.get(0) + ", " + sides.get(1) + "," + sides.get(2));
    }

    /**
     * get sides of triangle
     *
     * @return sides
     */
    public ArrayList<Integer> getSides() {
        return sides;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Objects.equals(sides, triangle.sides);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sides);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "sides=" + sides +
                '}';
    }
}
