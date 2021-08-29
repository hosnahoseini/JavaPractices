package com.company;

import java.util.Objects;

/**
 * A class for a single vote
 *
 * @author Hosna Oyarhoseini
 * @version 2021.April.6
 */
public class Vote {
    private Person person;
    private String date;

    /**
     * constructor
     *
     * @param person voter info
     * @param date   date of voting
     */
    public Vote(Person person, String date) {
        this.person = person;
        this.date = date;
    }

    /**
     * getter for person identity
     *
     * @return person identity
     */
    public Person getPerson() {
        return person;
    }

    /**
     * getter for date
     *
     * @return date of voting
     */
    public String getDate() {
        return date;
    }

    /**
     * print person's info + date of voting
     */
    public void print() {
        System.out.println("name: " + person.toString() + " | date: " + date);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vote vote = (Vote) o;
        return person.equals(vote.person) && date.equals(vote.date);
    }

    @Override
    public int hashCode() {
        int result = getPerson().hashCode();
        result = 31 * result + getDate().hashCode();
        return result;
    }
}
