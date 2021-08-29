package com.company;

import org.w3c.dom.Node;

import java.io.*;
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
     * @param fileName fileName
     * @param text     text to be written in the file
     */
    public void fileWriterByBuffer(String fileName, String text) {

        try (FileWriter fileWriter = new FileWriter(fileName, true);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            bufferedWriter.write(text);
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
     * write array of notes to file
     *
     * @param fileName fileName
     * @param notes    array of notes
     */
    public void objectFileWriter(String fileName, ArrayList<Note> notes) {
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(fileName);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(notes);
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
     * read array of notes form file
     *
     * @param fileName fileName
     * @return array of notes in the file
     */
    public ArrayList<Note> objectFileReader(String fileName) {
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        ArrayList<Note> notes = null;
        try {
            fileInputStream = new FileInputStream(fileName);
            objectInputStream = new ObjectInputStream(fileInputStream);
            notes = (ArrayList<Note>) objectInputStream.readObject();
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
        return notes;
    }

    /**
     * print short info of notes in the file
     *
     * @param fileName fileName
     */
    public void printShortInfo(String fileName) {
        ArrayList<Note> notes = objectFileReader(fileName);
        int index = 1;
        for (Note note : notes)
            System.out.println(index++ + ") " + note.printShortInfo());
    }

    /**
     * print long info of a note
     *
     * @param fileName fileName
     * @param index    index of note
     */
    public void printLongInfo(String fileName, int index) {
        ArrayList<Note> notes = objectFileReader(fileName);
        System.out.println(notes.get(index - 1));
    }

    /**
     * Add a new note
     *
     * @param fileName fileName
     * @param note     new note
     */
    public void addNote(String fileName, Note note) {
        ArrayList<Note> notes = objectFileReader(fileName);
        notes.add(note);
        objectFileWriter(fileName, notes);
    }

    /**
     * remove a note
     *
     * @param fileName fileName
     * @param index    index of note
     */
    public void removeNote(String fileName, int index) {
        ArrayList<Note> notes = objectFileReader(fileName);
        if (index > 0 && index <= notes.size()) {
            notes.remove(index - 1);
            objectFileWriter(fileName, notes);
        } else
            System.out.println("Wrong index");
    }



}
