package com.androidbasicsnd.android.musicalstructureapp;

import java.util.ArrayList;

/**
 * A class that contains information about the songs that are displayed in the application.
 */

public class Song {

    /** the id of the song */
    private String id;

    /** the title of the song */
    private String title;

    /** a list that contains the singers of the song */
    private ArrayList<String> singers;

    /**
     * A constructor that is used for the initialization of objects of type Song and has three parameters.
     *
     * @param id the id of the song
     * @param title the title of the song
     * @param singers a list that contains the singers of the song
     */
    public Song(String id, String title, ArrayList<String> singers) {
        this.id = id;
        this.title = title;
        this.singers = singers;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<String> getSingers() {
        return singers;
    }

    public void setSingers(ArrayList<String> singers) {
        this.singers = singers;
    }
}
