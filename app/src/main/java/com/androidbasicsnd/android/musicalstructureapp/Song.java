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

    /** the singer or the singers of the song */
    private String sungBy;

    /** a boolean flag which indicates if the song is intepreted by a male or by more males */
    private boolean maleSinger;

    /** a boolean flag which indicates if the song is interpreted by a female or by more females */
    private boolean femaleSinger;

    /**
     * A constructor that is used for the initialization of objects of type Song and has three parameters.
     *
     * @param id the id of the song
     * @param title the title of the song
     * @param sungBy the singer or the singers of the song
     */
    public Song(String id, String title, String sungBy, boolean maleSinger, boolean femaleSinger) {
        this.id = id;
        this.title = title;
        this.sungBy = sungBy;
        this.maleSinger = maleSinger;
        this.femaleSinger = femaleSinger;
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

    public String getSungBy() {
        return sungBy;
    }

    public void setSungBy(String sungBy) {
        this.sungBy = sungBy;
    }

    public boolean isMaleSinger() {
        return maleSinger;
    }

    public void setMaleSinger(boolean maleSinger) {
        this.maleSinger = maleSinger;
    }

    public boolean isFemaleSinger() {
        return femaleSinger;
    }

    public void setFemaleSinger(boolean femaleSinger) {
        this.femaleSinger = femaleSinger;
    }
}
