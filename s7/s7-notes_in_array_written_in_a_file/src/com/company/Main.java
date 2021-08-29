package com.company;

import java.util.ArrayList;
/**
 * A class to test note holder
 *
 * @author Hosna Oyarhoseini
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {

        FileUtils fileUtils = new FileUtils();

        System.out.println("--Trying buffer reading and writing--");
        fileUtils.fileWriterByBuffer("buf.txt", "A new project for ap workshop\r\n");
        fileUtils.fileWriterByBuffer("buf.txt", "a note pad to save notes");
        System.out.println(fileUtils.fileReaderByBuffer("buf.txt"));

//        Note note1 = new Note("Math tasks", "page 32, exercise 3", "1400/2/20");
//        Note note2 = new Note("Physic task", "study for exam", "1399/11/15");
//        Note note3 = new Note("Go shopping", "call her to set time", "1401/7/8");
//        ArrayList<Note> notes = new ArrayList<>();
//        notes.add(note1);
//        notes.add(note2);
//
//        fileUtils.objectFileWriter("1.txt", notes);
//
//        System.out.println("--show title of note until now--");
//        fileUtils.printShortInfo("1.txt");
//
//        System.out.println("--long info of note 1--");
//        fileUtils.printLongInfo("1.txt",1);
//
//        System.out.println("--add note 3 and -show title of note until now--");
//        fileUtils.addNote("1.txt", note3);
//        fileUtils.printShortInfo("1.txt");
//
//        System.out.println("--remove note 2 and -show title of note until now--");
//        fileUtils.removeNote("1.txt", 2);
//        fileUtils.printShortInfo("1.txt");

    }
}
