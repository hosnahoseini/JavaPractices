package com.company;

/**
 * A class for triangle
 *
 * @author Hosna Oyarhoseini
 * @version 1400.1.30
 */

public class Triangle extends Polygon{

    /**
     * constructor
     * @param a first side
     * @param b second side
     * @param c third side
     */
    public Triangle(Integer a, Integer b, Integer c) {
        super(a, b, c);
    }

    /**
     * check if the rectangle is equilateral or not
     *
     * @return true if its a equilateral
     */
    public boolean isEquilateral() {
        if (getSides().get(0) == getSides().get(1) && getSides().get(1) == getSides().get(2))
            return true;
        return false;
    }

    /**
     * calculate triangle
     *
     * @return triangle perimeter
     */
    @Override
    public double calculatePerimeter() {
        return getSides().get(0) + getSides().get(1) + getSides().get(2);
    }

    /**
     * calculate area
     *
     * @return rectangle area
     */
    @Override
    public double calculateArea() {
        if(isEquilateral())
            return getSides().get(0) * getSides().get(0) * Math.sqrt(3/4) / 2;
        else{
            System.out.println("I need angle:(");
            return -1;
        }
    }

    /**
     * draw(print info) of triangle
     */
    @Override
    public void draw(){
        System.out.println("triangle with sides: " +
                getSides().get(0) + ", " + getSides().get(1) + ", " + getSides().get(2));
    }

    @Override
    public String toString() {
        return "Triangle: " + super.toString();
    }

}
