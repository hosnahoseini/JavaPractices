package com.company;

import java.util.ArrayList;
import java.util.Objects;

/**
 * A class for rectangle
 *
 * @author Hosna Oyarhoseini
 * @version 1400.1.30
 */


public class Rectangle {
    private ArrayList<Integer> sides = new ArrayList<>();

    /**
     * Constructor
     * @param a first side
     * @param b second side
     * @param c third side
     * @param d forth side
     */
    public Rectangle(int a, int b, int c, int d) {
        sides.add(a);
        sides.add(b);
        sides.add(c);
        sides.add(d);
    }

    /**
     * check if the rectangle is square or not
     *
     * @return true if its a square
     */
    public boolean isSquare() {
        if (sides.get(0).equals(sides.get(1)) && sides.get(1).equals(sides.get(2)) && sides.get(3).equals(sides.get(2)))
            return true;
        return false;
    }

    /**
     * calculate perimeter
     *
     * @return rectangle perimeter
     */
    public double calculatePerimeter() {
        return sides.get(0) + sides.get(1) + sides.get(2) + sides.get(3);
    }

    /**
     * calculate area
     *
     * @return rectangle area
     */
    public double calculateArea() {
        return sides.get(0) * sides.get(1);
    }

    /**
     * draw(print info) of rectangle
     */
    public void draw() {
        System.out.println("rectangle with sides: " +
                sides.get(0) + ", " + sides.get(1) + "," +
                sides.get(2) + ", " + sides.get(3));
    }

    /**
     * get sides of rectangle
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
        Rectangle rectangle = (Rectangle) o;
        return Objects.equals(sides, rectangle.sides);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "sides=" + sides +
                '}';
    }
}
