package com.company;

import java.util.ArrayList;
/**
 * A class to keep shapes. Add, print, draw them.
 *
 * @author Hosna Oyarhoseini
 * @version 1400.1.30
 */
public class Paint {
    private ArrayList<Shape> shapes;

    /**
     * constructor
     */
    public Paint() {
        shapes = new ArrayList<>();
    }

    /**
     * add a shape
     * @param shape shape
     */
    public void addShape(Shape shape){
        shapes.add(shape);
    }

    /**
     * draw(print info) all shapes
     */
    public void drawAll(){
        for(Shape shape:shapes)
            shape.draw();
    }

    /**
     * print all shape info
     */
    public void  printAll(){
        for(Shape shape:shapes)
            System.out.println(shape.toString());
    }

    /**
     * print squares and equilateral
     */
    public void describeEqualSides(){
        for(Shape shape:shapes){
            if(shape instanceof Triangle && ((Triangle) shape).isEquilateral())
                System.out.println(shape.toString() + " --> is Equilateral");
            else if(shape instanceof Rectangle && ((Rectangle) shape).isSquare())
                System.out.println(shape.toString() + " --> is Square");
        }
    }
}
