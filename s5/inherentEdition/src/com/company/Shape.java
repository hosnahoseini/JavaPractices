package com.company;

/**
 * An abstract class for all shapes
 *
 * @author Hosna Oyarhoseini
 * @version 1400.1.30
 */
public abstract class Shape {
    /**
     * abstract method to calculate perimeter
     *
     * @return rectangle perimeter
     */
    abstract public double calculatePerimeter();
    /**
     * abstract method to calculate area
     *
     * @return rectangle area
     */
    abstract public double calculateArea();

    /**
     * abstract method to draw shape
     */
    abstract public void draw();
    @Override
    abstract public boolean equals(Object o);
    @Override
    abstract public String toString();
}
