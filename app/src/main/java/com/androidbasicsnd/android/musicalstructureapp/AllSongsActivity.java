package com.androidbasicsnd.android.musicalstructureapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Adapter;
import android.widget.ListView;

import java.util.ArrayList;

public class AllSongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create an array of songs

        ArrayList<Song> songs = new ArrayList<Song>();

        songs = SongsGenerator.getSongsGenerator().getSongs();

        SongAdapter adapter = new SongAdapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }

}