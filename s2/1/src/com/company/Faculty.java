package com.company;
/**
 * The Faculty class represents a Faculty in university
 * It holds the faculty details relevant in our context
 *
 * @author Hosna
 * @version 1.0
 */
public class Faculty {
    /////fields/////
    private Lab[] labs;
    private float avg;
    private String name;
    private int currNumber;
    private int capacity;

    /////constructors/////

    /**
     * @param name name of faculty
     * @param cap  capacity of labs in the faculty
     */
    public Faculty(String name, int cap) {
        this.name = name;
        capacity = cap;
        labs = new Lab[capacity];
    }

    /////methods//////

    /**
     * print info of faculty
     */
    public void print() {
        calculateAvg();
        System.out.println("Faculty info : \n" + "name: " + name
                + ", capacity: " + capacity + ", current size: "
                + currNumber + ", average: " + avg);
        System.out.println("-------------------------------");
        System.out.println("Lab's info:");
        System.out.println("-------------------------------");
        for (int i = 0; i < currNumber; i++) {
            labs[i].print();
        }
    }

    /**
     * @param lab new lab we want to add
     */
    public void enrollLab(Lab lab) {
        if (currNumber < capacity) {
            labs[currNumber] = lab;
            currNumber++;
        } else {
            System.out.println("Faculty is full!!!");
        }
    }

    /**
     * @param labs array of labs we want to add
     */
    public void setLabs(Lab[] labs) {
        for (currNumber = 0; currNumber < labs.length; currNumber++){
            this.labs[currNumber].setDay(labs[currNumber].getDay());
            this.labs[currNumber].setAvg(labs[currNumber].getAvg());
            this.labs[currNumber].setCapacity(labs[currNumber].getCapacity());
            this.labs[currNumber].setStudents(labs[currNumber].getStudents());
//            this.labs[currNumber] = labs[currNumber];
        }


    }

    /**
     * @return array of labs
     */
    public Lab[] getLab() {
        return labs;
    }

    /**
     * @param avg lab average
     */
    public void setAvg(float avg) {
        this.avg = avg;
    }

    /**
     * @return average
     */
    public float getAvg() {
        calculateAvg();
        return avg;
    }

    /**
     * calculate average
     */
    public void calculateAvg() {
        avg = 0;
        for (int i = 0; i < currNumber; i++)
            avg += labs[i].getAvg();
        avg /= currNumber;

    }

    /**
     * @return name of faculty
     */
    public String getDay() {
        return name;
    }

    /**
     * @param name name of faculty
     */
    public void setDay(String name) {
        this.name = name;
    }

    /**
     * @return capacity of  faculty
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * @param capacity of faculty
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }


}
