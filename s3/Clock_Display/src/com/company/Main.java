package com.company;

/**
 * A class to display clock from 00:00 to infinite time ;))
 * @author Hosna_oyar
 * @version 2021.03.15
 */

public class Main {
    /**
     * A method to wait
     * @param ms amount of time to wait(millisecond)
     */
    public static void wait(int ms)
    {
        try
        {
            Thread.sleep(ms);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
    }

    public static void main(String[] args) {
        ClockDisplay clock = new ClockDisplay(23,59,57);
        while (true){
            wait(1000);
            clock.timeTick();
            System.out.println(clock.getTime());
        }

    }
}
