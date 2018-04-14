package com.androidbasicsnd.android.musicalstructureapp;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class SongsInterpretedByMalesAndFemalesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create an array of songs

        ArrayList<Song> songs = new ArrayList<Song>();

        Context context = getApplicationContext();

        songs = SongsGenerator.getSongsGenerator(context).getSongsWithMaleAndFemaleInterpreters();

        SongAdapter adapter = new SongAdapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }

}
