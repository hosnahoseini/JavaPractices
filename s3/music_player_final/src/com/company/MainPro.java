package com.company;

/**
 * A class to use music player add,listen,remove,stop,...
 */
public class MainPro {


    public static void main(String[] args) {

        //Define collection in a NOT array form
        /*MusicCollectionPro pop = new MusicCollectionPro();
        MusicCollectionPro jazz = new MusicCollectionPro();
        MusicCollectionPro rock = new MusicCollectionPro();
        MusicCollectionPro country = new MusicCollectionPro();
        */

        //make categories
        MusicCollectionPro[] categories = new MusicCollectionPro[4];
        categories[0] = new MusicCollectionPro("pop");
        categories[1] = new MusicCollectionPro("jazz");
        categories[2] = new MusicCollectionPro("rock");
        categories[3] = new MusicCollectionPro("country");

        //make musics
        Music m1 = new Music("m1.mp3","me",2001);
        Music m2 = new Music("m2.mp3","you",2074);
        Music m3 = new Music("m3.mp3","we",1998);
        Music m4 = new Music("m4.mp3","gholi",1400);
        //MusicInfo m5 = new MusicInfo("m5.mp3","taylor",2007);

        //add musics to categories
        categories[0].addMusic(m1);
        categories[0].addMusic(m2);
        categories[0].addMusic(m4);
        categories[0].addMusic(new Music("m5.mp3","taylor",2007));
        categories[1].addMusic(m3);


        System.out.println("number Of Music in pop musics");
        System.out.println(categories[0].getNumberOfMusics());
        System.out.println("--------------------------------------------------------");

        System.out.println("list All Musics in pop musics");
        categories[0].listAllMusics();
        System.out.println("--------------------------------------------------------");

        System.out.println("Remove a Musics in pop musics");
        categories[0].removeMusic(3);
        categories[0].listAllMusics();
        System.out.println("--------------------------------------------------------");

        System.out.println("list a Music of pop musics");
        categories[0].listMusic(1);
        System.out.println("--------------------------------------------------------");

        System.out.println("start Playing first music in pop musics");
        categories[0].startPlaying(0);
        System.out.println("--------------------------------------------------------");

        System.out.println("add m1 and m2 and m3 as favorite then remove m2");
        MusicCollectionPro.addFavorite(m1);
        MusicCollectionPro.addFavorite(m2);
        MusicCollectionPro.addFavorite(m3);
        MusicCollectionPro.listFavoriteMusics();
        MusicCollectionPro.removeFavorite(m2);
        MusicCollectionPro.listFavoriteMusics();
        System.out.println("--------------------------------------------------------");

        System.out.println("search m in pop musics:");
        categories[0].search("m");
        System.out.println("search m4 in jazz musics:");
        categories[1].search("m4");
        System.out.println("search 'ou' in pop musics:");
        categories[0].search("ou");
        System.out.println("--------------------------------------------------------");

        System.out.println("stop Playing first music in pop musics");
        categories[0].stopPlaying();
        System.out.println("--------------------------------------------------------");
    }
}
