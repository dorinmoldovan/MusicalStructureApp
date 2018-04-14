package com.androidbasicsnd.android.musicalstructureapp;

import android.content.Context;
import android.content.res.Resources;

import java.util.ArrayList;

/**
 * A class that is used for generating a list of songs that are used to populate the application.
 */
public class SongsGenerator {

    private ArrayList<Song> songs;
    private static SongsGenerator songsGenerator;
    private Context context;
    public static final int NUMBER_OF_SONGS = 100;

    /**
     * The default constructor of the class SongsGenerator.
     */
    private SongsGenerator(Context context) {
        this.context = context;
        this.songs = new ArrayList<Song>();
        String[] songs_ids = context.getResources().getStringArray(R.array.songs_ids);
        String[] songs_titles = context.getResources().getStringArray(R.array.songs_titles);
        String[] songs_interpreters = context.getResources().getStringArray(R.array.songs_interpreters);
        String[] male_singer = context.getResources().getStringArray(R.array.male_singer);
        String[] female_singer = context.getResources().getStringArray(R.array.female_singer);

        for(int i = 0; i < NUMBER_OF_SONGS; i++) {
            this.songs.add(new Song(songs_ids[i], songs_titles[i], songs_interpreters[i], Boolean.valueOf(male_singer[i]), Boolean.valueOf(female_singer[i])));
        }
    }

    /**
     * A method that returns an instance of the SongsGenerator.
     *
     * @return
     */
    public static SongsGenerator getSongsGenerator(Context context) {
        if(songsGenerator == null) {
            songsGenerator = new SongsGenerator(context);
        }
        return songsGenerator;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public void setSongs(ArrayList<Song> songs) {
        this.songs = songs;
    }

    public ArrayList<Song> getSongsWithMaleInterpreters() {
        ArrayList<Song> songsWithMaleInterpreters = new ArrayList<Song>();
        ArrayList<Song> songs = getSongs();
        for(Song song: songs) {
            if(song.isMaleSinger() && (!song.isFemaleSinger())) {
                songsWithMaleInterpreters.add(song);
            }
        }
        return songsWithMaleInterpreters;
    }

    public ArrayList<Song> getSongsWithFemaleInterpreters() {
        ArrayList<Song> songsWithFemaleInterpreters = new ArrayList<Song>();
        ArrayList<Song> songs = getSongs();
        for(Song song: songs) {
            if(song.isFemaleSinger() && (!song.isMaleSinger())) {
                songsWithFemaleInterpreters.add(song);
            }
        }
        return songsWithFemaleInterpreters;
    }

    public ArrayList<Song> getSongsWithMaleAndFemaleInterpreters() {
        ArrayList<Song> songsWithMaleAndFemaleInterpreters = new ArrayList<Song>();
        ArrayList<Song> songs = getSongs();
        for(Song song: songs) {
            if(song.isMaleSinger() && song.isFemaleSinger()) {
                songsWithMaleAndFemaleInterpreters.add(song);
            }
        }
        return songsWithMaleAndFemaleInterpreters;
    }

}
