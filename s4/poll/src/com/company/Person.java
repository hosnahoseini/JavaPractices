package com.company;

/**
 * A class to represent person info
 *
 * @author Hosna Oyarhoseini
 * @version 2021.April.6
 */
public class Person {

    private String firstName;
    private String lastName;

    /**
     * constructor
     *
     * @param firstName person first name
     * @param lastName  person last name
     */
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * getter for first name
     *
     * @return person first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * getter for last name
     *
     * @return person first name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * override toString to show person info
     *
     * @return person first name + last name
     */
    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}
