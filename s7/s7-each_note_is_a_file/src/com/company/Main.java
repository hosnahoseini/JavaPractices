package com.company;


/**
 * A class to test note holder
 *
 * @author Hosna Oyarhoseini
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {

        FileUtils fileUtils = new FileUtils();

        Note note1 = new Note("Math tasks", "page 32\r\nexercise 3", "1400/2/20");
        Note note2 = new Note("Physic task", "study for exam\r\n1234", "1399/11/15");
        Note note3 = new Note("Go shopping", "call her to set time\r\ncheck the time", "1401/7/8");

//        System.out.println("--Trying buffer reading and writing--");
//        fileUtils.fileWriterByBuffer(note1);
//        fileUtils.fileWriterByBuffer(note2);
//        System.out.println(fileUtils.fileReaderByBuffer("Math tasks"));

        fileUtils.objectFileWriter(note1);
        fileUtils.objectFileWriter(note2);

        System.out.println("--show title of note until now--");
        fileUtils.printShortInfo();

        System.out.println("--long info of note \"Math tasks\"--");
        fileUtils.printLongInfo("Math tasks");

        System.out.println("--add note \"Go shopping\" and -show title of note until now--");
        fileUtils.objectFileWriter(note3);
        fileUtils.printShortInfo();

        System.out.println("--remove note \"Physic task\" and -show title of note until now--");
        fileUtils.removeNote("Physic task");
        fileUtils.printShortInfo();

    }
}
