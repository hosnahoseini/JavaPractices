package com.company;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * A class to hold details of audio files.
 *
 * @author David J. Barnes and Michael Kِlling
 * @version 2011.07.31
 */
public class MusicCollection
{
    // An ArrayList for storing the file names of music files.
    private ArrayList<String> files;
    // A player for the music files.
    private MusicPlayer player;

    /**
     * Create a MusicCollection
     */
    public MusicCollection()
    {
        files = new ArrayList<>();
        player = new MusicPlayer();
    }

    /**
     * Add a file to the collection.
     * @param filename The file to be added.
     */
    public void addFile(String filename)
    {
        files.add(filename);
    }

    /**
     * Return the number of files in the collection.
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles()
    {
        return files.size();
    }

    /**
     * List a file from the collection.
     * @param index The index of the file to be listed.
     */
    public void listFile(int index)
    {
        System.out.println(files.get(index));
    }

    /**
     * Show a list of all the files in the collection.
     */
    public void listAllFiles()
    {
        Iterator <String> it = files.iterator();
        while (it.hasNext()){
            String tmp = it.next();
            System.out.println(tmp);

        }
    }

    /**
     * Remove a file from the collection by its index
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index)
    {
        files.remove(index);
    }

    /**
     *  Remove a file by its file name
     * @param path is filename
     */
    public void removeFile(String path){
        files.remove(path);
    }

    /**
     * Start playing a file in the collection.
     * Use stopPlaying() to stop it playing.
     * @param index The index of the file to be played.
     */
    public void startPlaying(int index)
    {
        player.startPlaying(files.get(index));
    }

    /**
     * Stop the player.
     */
    public void stopPlaying()
    {
        player.stop();
    }


    /**
     * Determine whether the given index is valid for the collection.
     * Print an error message if it is not.
     * @param index The index to be checked.
     * @return true if the index is valid, false otherwise.
     */
    private boolean validIndex(int index)
    {
        // The return value.
        // Set according to whether the index is valid or not.
        if(index >= 0 && index < files.size())
            return true;
        return false;

    }
}