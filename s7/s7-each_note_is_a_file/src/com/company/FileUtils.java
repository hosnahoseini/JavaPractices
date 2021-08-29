package com.company;

import java.io.*;
import java.nio.file.Paths;
import java.util.ArrayList;

/**
 * A class to read and write in the file
 *
 * @author Hosna Oyarhoseini
 * @version 1.0
 */
public class FileUtils {
    /**
     * write a text to file by buffer
     *
     * @param note new note
     */
    public void fileWriterByBuffer(Note note) {

        try (FileWriter fileWriter = new FileWriter(note.getTitle()+".txt");
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            bufferedWriter.write(note.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * read from a file by buffer
     *
     * @param fileName fileName
     * @return text
     */
    public String fileReaderByBuffer(String fileName) {
        fileName += ".txt";
        String result = "";
        try (FileReader fileReader = new FileReader(fileName);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                result += '\n' + line;
            }
//            char[] buffer = new char[2048];
//            while (bufferedReader.ready()) {
//                int count = bufferedReader.read(buffer);
//                result += new String(buffer, 0, count);
//            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }

    /**
     * write a note to file
     *
     * @param note note
     */
    public void objectFileWriter(Note note) {
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(note.getTitle()+".txt");
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(note);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                objectOutputStream.close();
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * read note form file
     *
     * @param fileName fileName
     * @return note in the file
     */
    public Note objectFileReader(String fileName) {
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        Note note = null;
        try {
            fileInputStream = new FileInputStream(fileName);
            objectInputStream = new ObjectInputStream(fileInputStream);
            note = (Note) objectInputStream.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                objectInputStream.close();
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return note;
    }

    /**
     * print short info of note in the file
     */
    public void printShortInfo() {

        File folder = new File("C:\\Users\\RAI\\Desktop\\university\\term4\\ap\\Lab\\s7\\s7-each_note_is_a_file");
        int index = 1;
        for (final File fileEntry : folder.listFiles()) {
            String fileName = fileEntry.getName();
            if (fileName.contains(".txt")) {
                System.out.println(index++ + ") " + objectFileReader(fileEntry.getName()).printShortInfo());
            }
        }

    }

    /**
     * print long info of a note
     *
     * @param fileName fileName
     */
    public void printLongInfo(String fileName) {
        System.out.println(objectFileReader(fileName+".txt"));
    }

    /**
     * remove a note
     *
     * @param fileName fileName
     */
    public void removeNote(String fileName) {
        fileName += ".txt";
        File file = new File(fileName);
        file.delete();
    }


}
