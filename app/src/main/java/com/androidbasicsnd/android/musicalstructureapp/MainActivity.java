package com.androidbasicsnd.android.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the category for all songs
        TextView allSongsTextView = (TextView) findViewById(R.id.all_songs);

        // Set a click listener on that View
        allSongsTextView.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the category all songs is clicked on.
            @Override
            public void onClick(View view) {
                Intent allSongsIntent = new Intent(MainActivity.this, AllSongsActivity.class);
                startActivity(allSongsIntent);
            }
        });

        // Find the View that shows the category for songs interpreted by males
        TextView songsInterpretedByMales = (TextView) findViewById(R.id.songs_interpreted_by_males);

        // Set a click listener on that View
        songsInterpretedByMales.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the category all songs is clicked on.
            @Override
            public void onClick(View view) {
                Intent songsInterpretedByMalesIntent = new Intent(MainActivity.this, SongsInterpretedByMalesActivity.class);
                startActivity(songsInterpretedByMalesIntent);
            }
        });

        // Find the View that shows the category for songs interpreted by females
        TextView songsInterpretedByFemales = (TextView) findViewById(R.id.songs_interpreted_by_females);

        // Set a click listener on that View
        songsInterpretedByFemales.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the category all songs is clicked on.
            @Override
            public void onClick(View view) {
                Intent songsInterpretedByFemalesIntent = new Intent(MainActivity.this, SongsInterpretedByFemalesActivity.class);
                startActivity(songsInterpretedByFemalesIntent);
            }
        });

        // Find the View that shows the category for songs interpreted by males and females
        TextView songsInterpretedByMalesAndFemales = (TextView) findViewById(R.id.songs_interpreted_by_males_and_females);

        // Set a click listener on that View
        songsInterpretedByMalesAndFemales.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the category all songs is clicked on.
            @Override
            public void onClick(View view) {
                Intent songsInterpretedByMalesAndFemalesIntent = new Intent(MainActivity.this, SongsInterpretedByMalesAndFemalesActivity.class);
                startActivity(songsInterpretedByMalesAndFemalesIntent);
            }
        });


    }
}
