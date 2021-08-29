package com.company;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * A class to hold details of audio musics collections
 * The pro version contain more info for each music
 * and you can choose favorites and search in the musics
 *
 * @author Hosna_oyar
 * @version 2021.03.15
 */
public class MusicCollectionPro {
    // An ArrayList for storing the music info
    private ArrayList<Music> musics;
    // A player for the musics.
    private MusicPlayer player;
    // Name of the collection
    private String collectionName;
    // An ArrayList for storing the favorite music
    // It is defined static because all object of MusicCollection type should have access to it
    private static ArrayList<Music> favorite;

    /**
     * Create a MusicCollectionPro
     */
    public MusicCollectionPro(String name) {
        collectionName = name;
        musics = new ArrayList<>();
        player = new MusicPlayer();
        favorite = new ArrayList<>();
    }

    /**
     * Add a music to the collection.
     *
     * @param music The music to be added.
     */
    public void addMusic(Music music) {
        musics.add(music);
    }

    /**
     * Return the number of musics in the collection.
     *
     * @return The number of musics in the collection.
     */
    public int getNumberOfMusics() {
        return musics.size();
    }

    /**
     * List a music from the collection.
     *
     * @param index The index of the music to be listed.
     */
    public void listMusic(int index) {
        musics.get(index).print();
    }

    /**
     * Show a list of all the musics in the collection.
     */
    public void listAllMusics() {
        Iterator<Music> it = musics.iterator();
        while (it.hasNext()) {
            Music tmp = it.next();
            tmp.print();

        }
    }

    /**
     * Remove a music from the collection.
     *
     * @param index The index of the music to be removed.
     */
    public void removeMusic(int index) {
        Iterator<Music> it = musics.iterator();
        while (it.hasNext()) {
            Music tmp = it.next();
            if (tmp == musics.get(index)) {
                it.remove();
            }

        }
    }

    /**
     * Start playing a music in the collection.
     * Use stopPlaying() to stop it playing.
     *
     * @param index The index of the music to be played.
     */
    public void startPlaying(int index) {
        player.startPlaying(musics.get(index).getPath());
    }

    /**
     * Stop the player.
     */
    public void stopPlaying() {
        player.stop();
    }


    /**
     * Determine whether the given index is valid for the collection.
     * Print an error message if it is not.
     *
     * @param index The index to be checked.
     * @return true if the index is valid, false otherwise.
     */
    private boolean validIndex(int index) {
        // The return value.
        // Set according to whether the index is valid or not.
        if (index >= 0 && index < musics.size())
            return true;
        return false;

    }

    /**
     * @return collection name
     */
    public String getCollectionName() {
        return collectionName;
    }

    /**
     * change collectionName
     * @param collectionName name of collection
     */
    public void setCollectionName(String collectionName) {
        this.collectionName = collectionName;
    }


    /**
     * @return favorite musics
     */
    public static ArrayList<Music> getFavorite() {
        return favorite;
    }

    /**
     * change favorite music
     * @param favorite favorite musics
     */
    public static void setFavorite(ArrayList<Music> favorite) {
        MusicCollectionPro.favorite = favorite;
    }

    /**
     * add a favorite musics
     * @param newMusic new favorite musics
     */
    public static void addFavorite(Music newMusic) {
        favorite.add(newMusic);
    }

    /**
     * remove favorite musics
     * @param music the favorite musics we want to remove
     */
    public static void removeFavorite(Music music) {
        favorite.remove(music);
    }

    /**
     * list favorite musics
     */
    public static void listFavoriteMusics() {
        System.out.println("Favorite musics: ");
        Iterator<Music> it = favorite.iterator();
        while (it.hasNext()) {
            Music tmp = it.next();
            tmp.print();
        }
    }

    /**
     * search a music by its address or singer in all the music in this collection
     * @param search the string we are searching for
     * @return true if found it or false if it didn't
     */
    public boolean search(String search) {
        Iterator<Music> it = musics.iterator();
        boolean find = false;
        while (it.hasNext()) {
            Music tmp = it.next();
            if (tmp.getPath().contains(search) || tmp.getSinger().contains(search)) {
                tmp.print();
                find = true;
            }
        }
        if (find) {
            System.out.println("^found it:)^");
            return true;
        } else {
            System.out.println("There is not such a music:(");
            return false;
        }

    }

}