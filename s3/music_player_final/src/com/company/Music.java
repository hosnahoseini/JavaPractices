package com.company;

/**
 * A class to hold info of a music
 *
 * @author Hosna_oyar
 * @version 2021.03.15
 */
public class Music {
    /////fields/////
    // music address
    private String path;
    // singer's name
    private String singer;
    // release year
    private int year;

    /**
     * initializing info
     * @param path music's address
     * @param singer singer
     * @param year release year
     */
    /////constructors/////
    public Music(String path, String singer, int year) {
        this.path = path;
        this.singer = singer;
        this.year = year;
    }

    /////methods/////

    /**
     * @return path of music
     */
    public String getPath() {
        return path;
    }

    /**
     * @param path path of music
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * @return name of the singer
     */
    public String getSinger() {
        return singer;
    }

    /**
     * @param singer name of the singer
     */
    public void setSinger(String singer) {
        this.singer = singer;
    }

    /**
     * @return release year of music
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year release year of music
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * print info of a music
     */
    public void print() {
        System.out.println("path: " + getPath()
                + ", singer: " + getSinger()
                + ", year: " + getYear());
    }


}
