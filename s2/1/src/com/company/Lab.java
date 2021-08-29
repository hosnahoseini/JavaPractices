package com.company;
/**
 * The Lab class represents a Lab in a faculty
 * It holds the lab details relevant in our context
 *
 * @author Hosna
 * @version 1.0
 */
public class Lab {
    /////fields/////
    private Student[] students;
    private float avg;
    private String day;
    private int capacity;
    private int currentSize;

    /////constructors/////

    /**
     * @param cap class's capacity
     * @param d   class's day
     */
    public Lab(int cap, String d) {
        capacity = cap;
        day = d;
        students = new Student[capacity];
    }

    /////methods/////

    /**
     * @param std one of the student's info
     */
    public void enrollStudent(Student std) {
        if (currentSize < capacity) {
            students[currentSize] = std;
            currentSize++;
        } else {
            System.out.println("Lab is full!!!");
        }
    }

    /**
     * print info of class
     */
    public void print() {
        calculateAvg();
        System.out.println("lab info : \n" + "day: " + day
                + ", capacity: " + capacity + ", current size: "
                + currentSize + ", avarage: " + avg);
        System.out.println("student's info:");
        for (int i = 0; i < currentSize; i++) {
            System.out.print(i + 1 + ") ");
            students[i].print();
        }
        System.out.println("-------------------------------");
    }


    /**
     * @return student's info
     */
    public Student[] getStudents() {
        return students;
    }

    /**
     * @param students student's info
     */
    public void setStudents(Student[] students) {
        for (currentSize = 0; currentSize < students.length; currentSize++){
            this.students[currentSize].setFirstName(students[currentSize].getFistName());
            this.students[currentSize].setLastName(students[currentSize].getLastName());
            this.students[currentSize].setGrade(students[currentSize].getGrade());
            this.students[currentSize].setID(students[currentSize].getID());
            //this.students[currentSize] = students[currentSize];

        }

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
        for (int i = 0; i < currentSize; i++)
            avg += students[i].getGrade();
        avg /= currentSize;

    }

    /**
     * @return day of class
     */
    public String getDay() {
        return day;
    }

    /**
     * @param day day of class
     */
    public void setDay(String day) {
        this.day = day;
    }

    /**
     * @return capacity of class
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * @param capacity of class
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
