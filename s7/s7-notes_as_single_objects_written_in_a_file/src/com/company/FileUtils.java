package com.company;

import org.w3c.dom.Node;

import java.io.*;
import java.util.ArrayList;
import java.util.Formatter;

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
     * print short info of notes in the file
     *
     * @param fileName fileName
     */
    public void printShortInfo(String fileName) {
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        Note note = null;
        int index = 1;
        boolean checked = true;
        try {
            fileInputStream = new FileInputStream(fileName);
            objectInputStream = new ObjectInputStream(fileInputStream);
            while(checked){
                note = (Note) objectInputStream.readObject();
                System.out.println(index ++ + ") " + note.printShortInfo());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (EOFException e){
            checked = false;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }  finally{
            try {
                objectInputStream.close();
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    /**
     * print long info of a note
     *
     * @param fileName fileName
     * @param index    index of note
     */
    public void printLongInfo(String fileName, int index) {

        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        Note note = null;
        try {
            fileInputStream = new FileInputStream(fileName);
            objectInputStream = new ObjectInputStream(fileInputStream);
            for (int i = 0; i < index; i++) {
                note = (Note) objectInputStream.readObject();
                System.out.println(note);
            }

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

    }

    /**
     * Add a new note
     *
     * @param fileName fileName
     * @param note     new note
     */
    public void addNote(String fileName, Note note) {
        singleObjectFileWriter(fileName, note);
    }

    /**
     * remove a note
     *
     * @param fileName fileName
     * @param index    index of note
     */
    public void removeNote(String fileName, int index) {
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        boolean checked = true;
        ArrayList<Note> notes = new ArrayList<>();

        try {
            fileInputStream = new FileInputStream(fileName);
            objectInputStream = new ObjectInputStream(fileInputStream);

            for (int i = 0; i < index - 1; i++) {
                notes.add((Note) objectInputStream.readObject());
            }

            objectInputStream.readObject();

            Note note = null;
            while(checked) {
                note = (Note) objectInputStream.readObject();
                notes.add(note);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (EOFException e){
            checked = false;
        }
        catch (IOException e) {
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

        //make file empty with print writer
        PrintWriter writer = null;
        try {
            writer = new PrintWriter(fileName);
            writer.close();
            for(Note note1:notes){
                singleObjectFileWriter(fileName, note1);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    /**
     * write (append) single note in file
     * @param fileName fileName
     * @param note note
     */
    public void singleObjectFileWriter(String fileName, Note note) {
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        File file = new File(fileName);
        try {
            fileOutputStream = new FileOutputStream(file, true);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));

            if (bufferedInputStream.read() != -1) {             //check if its empty or not
                objectOutputStream = new MyObjectOutputStream(fileOutputStream);
            } else {
                objectOutputStream = new ObjectOutputStream(fileOutputStream);
            }
            objectOutputStream.writeObject(note);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            try {
                objectOutputStream.close();
                fileOutputStream.close();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }
    }

    /**
     * read single note from file
     * @param fileName fileName
     * @return note
     */
    public Note singleObjectFileReader(String fileName) {
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

}
