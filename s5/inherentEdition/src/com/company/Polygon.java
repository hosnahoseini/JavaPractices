package com.company;

import java.util.ArrayList;
import java.util.Objects;

/**
 * An abstract class for polygons
 *
 * @author Hosna Oyarhoseini
 * @version 1400.1.30
 */
public abstract class Polygon extends Shape{
    private ArrayList<Integer> sides = new ArrayList<>();

    /**
     * constructor
     * @param args sides
     */
    public Polygon(Integer... args) {
        super();
        for (Integer arg : args)
            sides.add(arg);
    }

    /**
     * get side
     * @return side
     */
    public ArrayList<Integer> getSides() {
        return sides;
    }

    /**
     * abstract method to calculate perimeter
     *
     * @return rectangle perimeter
     */
    @Override
    abstract public double calculatePerimeter();
    /**
     * abstract method to calculate area
     *
     * @return rectangle area
     */
    @Override
    abstract public double calculateArea();

    /**
     * abstract method to draw shape
     */
    @Override
    abstract public void draw();

    @Override
    public String toString() {
        String res = "";
        int cnt = 1;
        for (Integer side : sides){
            res = res + "side" + cnt ++ + ":" + side + " | ";
        }
        return res;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Polygon polygon = (Polygon) o;
        return Objects.equals(sides, polygon.sides);
    }

}
