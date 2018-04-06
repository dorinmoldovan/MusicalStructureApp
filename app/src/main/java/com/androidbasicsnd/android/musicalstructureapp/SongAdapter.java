package com.androidbasicsnd.android.musicalstructureapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {

    public SongAdapter(Activity context, ArrayList<Song> songs) {
        super(context, 0, songs);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Song currentSong = getItem(position);

        TextView idTextView = (TextView) listItemView.findViewById(R.id.id_text_view);
        idTextView.setText(currentSong.getId());

        TextView titleTextView = (TextView) listItemView.findViewById(R.id.title_text_view);
        titleTextView.setText(currentSong.getTitle());

        TextView singersTextView = (TextView) listItemView.findViewById(R.id.singers_text_view);
        String singers = "";
        for(int i = 0; i < currentSong.getSingers().size(); i++) {
            if(i == 0) {
                singers += currentSong.getSingers().get(i);
            } else {
                singers += " & ";
                singers += currentSong.getSingers().get(i);
            }
        }
        singersTextView.setText(singers);

        return listItemView;
    }

}
