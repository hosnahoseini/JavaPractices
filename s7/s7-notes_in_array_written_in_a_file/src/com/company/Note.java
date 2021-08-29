package com.company;

import java.io.Serializable;
/**
 * A class to repreasent a note
 *
 * @author Hosna Oyarhoseini
 * @version 1.0
 */
public class Note implements Serializable {
    private String title;
    private String text;
    private String date;

    public Note(String title, String text, String date) {
        this.title = title;
        this.text = text;
        this.date = date;
    }

    /**
     * print short info
     * @return short info
     */
    public String printShortInfo() {
        return "Title : " + title ;
    }

    /**
     * print long info
     * @return long info
     */
    @Override
    public String toString() {
        return "title: " + title + "\t\t"+
                "date: " + date + '\n' +
                "text: " + text;
    }
}
