package com.company;

/**
 * A class for rectangle
 *
 * @author Hosna Oyarhoseini
 * @version 1400.1.30
 */

public class Rectangle extends Polygon{

    /**
     * Constructor
     * @param a first side
     * @param b second side
     * @param c third side
     * @param d forth side
     */
    public Rectangle(Integer a, Integer b, Integer c, Integer d) {
        super(a, b, c, d);
    }

    /**
     * check if the rectangle is square or not
     *
     * @return true if its a square
     */
    public boolean isSquare() {
        if (getSides().get(0) == getSides().get(1) && getSides().get(1) == getSides().get(2) && getSides().get(3) == getSides().get(2))
            return true;
        return false;
    }

    /**
     * calculate perimeter
     *
     * @return rectangle perimeter
     */
    @Override
    public double calculatePerimeter() {
        return getSides().get(0) + getSides().get(1) + getSides().get(2) + getSides().get(3);
    }

    /**
     * calculate area
     *
     * @return rectangle area
     */
    @Override
    public double calculateArea() {
        return getSides().get(0) * getSides().get(1);
    }

    /**
     * draw(print info) of rectangle
     */
    @Override
    public void draw(){
        System.out.println("rectangle with sides: " +
                getSides().get(0) + ", " + getSides().get(1) + ", " +
                getSides().get(2) + ", " + getSides().get(3) );
    }

    @Override
    public String toString() {
        return "Rectangle: " + super.toString();
    }
}
