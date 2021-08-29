package com.company;
/**
 * The Student class represents a student in a student
 * administration system.
 * It holds the student details relevant in our context
 *
 * @author Hosna
 * @version 1.0
 */

public class Student {
    /////fields/////

    //student's first name
    private String fistName;

    //student's last name
    private String lastName;

    //student's ID
    private String ID;

    //student's grade
    private int grade;

    /////constructors/////

    /**
     * @param firstName first name of student
     * @param lastName  last name of student
     * @param ID        ID of student
     */
    public Student(String firstName, String lastName, String ID) {
        this.fistName = firstName;
        this.lastName = lastName;
        this.ID = ID;
    }

    /////methods//////

    /**
     * print info
     */
    public void print() {
        System.out.println(lastName + ", student ID: "
                + ID + ", grade: " + grade);
    }

    /**
     * @return first name of student
     */
    public String getFistName() {
        return fistName;
    }

    /**
     * @param fName student's first name
     */
    public void setFirstName(String fName) {
        fistName = fName;
    }

    /**
     * @return last name of student
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lName student's last name
     */
    public void setLastName(String lName) {
        fistName = lName;
    }

    /**
     * @return grade's student
     */
    public int getGrade() {
        return grade;
    }

    /**
     * @param grade student's grade
     */
    public void setGrade(int grade) {
        this.grade = grade;
    }

    /**
     * @return ID's student
     */
    public String getID() {
        return ID;
    }

    /**
     * @param ID student's grade
     */
    public void setID(String ID) {
        this.ID = ID;
    }

}
