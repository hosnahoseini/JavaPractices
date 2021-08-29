package com.company;

/**
 * A class to use Music collection (NOT PRO)
 */
public class MainSimple {
    public static void main(String[] args) {
        MusicCollection pop = new MusicCollection();
        MusicCollection jazz = new MusicCollection();
        MusicCollection rock = new MusicCollection();
        MusicCollection country = new MusicCollection();

        pop.addFile("m1.mp3");
        pop.addFile("m2.mp3");
        jazz.addFile("m3.mp3");
        pop.addFile("m4.mp3");
        pop.addFile("m5.mp3");
        rock.addFile("m6.mp3");

        System.out.println("number Of Music in pop musics");
        System.out.println(pop.getNumberOfFiles());
        System.out.println("--------------------------------------------------------");

        System.out.println("list All Musics in pop musics");
        pop.listAllFiles();
        System.out.println("--------------------------------------------------------");

        System.out.println("Remove two Musics in pop musics");
        pop.removeFile(1);
        pop.removeFile("m5.mp3");
        pop.listAllFiles();
        System.out.println("--------------------------------------------------------");

        System.out.println("list a Music of pop musics");
        pop.listFile(1);
        System.out.println("--------------------------------------------------------");

        System.out.println("start Playing first music in pop musics");
        pop.startPlaying(0);
        System.out.println("--------------------------------------------------------");

        System.out.println("stop Playing first music in pop musics");
        pop.stopPlaying();
        System.out.println("--------------------------------------------------------");

    }
        
}
