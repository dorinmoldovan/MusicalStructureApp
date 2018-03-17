package com.androidbasicsnd.android.musicalstructureapp;

import java.util.ArrayList;

/**
 * A class that is used for generating a list of songs that are used to populate the application.
 */
public class SongsGenerator {

    private ArrayList<Song> songs;
    private SongsGenerator songsGenerator;

    /**
     * The default constructor of the class SongsGenerator.
     */
    private SongsGenerator() {
        this.songs = new ArrayList<Song>();
        this.songs.add(new Song("cover#1", "Can't Fight This Feeling", new ArrayList<String>(){{add("REO Speedwagon");}}));
        this.songs.add(new Song("cover#2", "Riptide", new ArrayList<String>(){{add("Vance Joy");}}));
        this.songs.add(new Song("cover#3", "Down", new ArrayList<String>(){{add("Jason Walker");}}));
        this.songs.add(new Song("cover#4", "Never Be Alone", new ArrayList<String>(){{add("Shawn Mendes");}}));
        this.songs.add(new Song("cover#5", "Hold It Against Me", new ArrayList<String>(){{add("Britney Spears");}}));
        this.songs.add(new Song("cover#6", "Can't Help Falling In Love", new ArrayList<String>(){{add("Elvis Presley");}}));
        this.songs.add(new Song("cover#7", "All Of Me", new ArrayList<String>(){{add("John Legend");}}));
        this.songs.add(new Song("cover#8", "Never Let Me Go", new ArrayList<String>(){{add("Florence"); add("The Machine");}}));
        this.songs.add(new Song("cover#9", "Budapest", new ArrayList<String>(){{add("George Ezra");}}));
        this.songs.add(new Song("cover#10", "Waiting", new ArrayList<String>(){{add("Dash Berlin"); add("Emma Hewitt");}}));
        this.songs.add(new Song("cover#11", "Behind Blue Eyes", new ArrayList<String>(){{add("Limp Bizkit");}}));
        this.songs.add(new Song("cover#12", "In and Out Of Love", new ArrayList<String>(){{add("Armin van Buuren"); add("Sharon den Adel");}}));
        this.songs.add(new Song("cover#13", "Impossible", new ArrayList<String>(){{add("James Arthur");}}));
        this.songs.add(new Song("cover#14", "Blank Space", new ArrayList<String>(){{add("Taylor Swift");}}));
        this.songs.add(new Song("cover#15", "Baby When The Light", new ArrayList<String>(){{add("David Guetta");}}));
        this.songs.add(new Song("cover#16", "Supergirl", new ArrayList<String>(){{add("Reamonn");}}));
        this.songs.add(new Song("cover#17", "Only Love Can Hurt Like This", new ArrayList<String>(){{add("Paloma Faith");}}));
        this.songs.add(new Song("cover#18", "Skinny Love", new ArrayList<String>(){{add("Birdy");}}));
        this.songs.add(new Song("cover#19", "I'm Yours", new ArrayList<String>(){{add("Jason Mraz");}}));
        this.songs.add(new Song("cover#20", "Hello", new ArrayList<String>(){{add("Adele");}}));
        this.songs.add(new Song("cover#21", "While Your Lips Are Still Red", new ArrayList<String>(){{add("Nightwish");}}));
        this.songs.add(new Song("cover#22", "I Don't Wanna Live Forever", new ArrayList<String>(){{add("ZAYN"); add("Taylor Swift");}}));
        this.songs.add(new Song("cover#23", "Chasing Cars", new ArrayList<String>(){{add("Snow Patrol");}}));
        this.songs.add(new Song("cover#24", "Born to Die", new ArrayList<String>(){{add("Lana Del Rey");}}));
        this.songs.add(new Song("cover#25", "Toxic", new ArrayList<String>(){{add("Britney Spears");}}));
        this.songs.add(new Song("cover#26", "Dear Darlin'", new ArrayList<String>(){{add("Olly Murs");}}));
        this.songs.add(new Song("cover#27", "Heartbeat'", new ArrayList<String>(){{add("Justs");}}));
        this.songs.add(new Song("cover#28", "Let Her Go'", new ArrayList<String>(){{add("Passenger");}}));
        this.songs.add(new Song("cover#29", "Story of My Life'", new ArrayList<String>(){{add("One Direction");}}));
        this.songs.add(new Song("cover#30", "Brother Louie", new ArrayList<String>(){{add("Modern Talking");}}));
        this.songs.add(new Song("cover#31", "Stay", new ArrayList<String>(){{add("Rihanna"); add("Mikky Ekko");}}));
        this.songs.add(new Song("cover#32", "Stitches", new ArrayList<String>(){{add("Shawn Mendes");}}));
        this.songs.add(new Song("cover#33", "Love Yourself", new ArrayList<String>(){{add("Justin Bieber");}}));
        this.songs.add(new Song("cover#34", "Echo", new ArrayList<String>(){{add("Jason Walker");}}));
        this.songs.add(new Song("cover#35", "You're The One That I Want", new ArrayList<String>(){{add("Grease");}}));
        this.songs.add(new Song("cover#36", "Dangerous", new ArrayList<String>(){{add("David Guetta"); add("Sam Martin");}}));
        this.songs.add(new Song("cover#37", "Afterglow", new ArrayList<String>(){{add("INXS");}}));
        this.songs.add(new Song("cover#38", "Mirrors", new ArrayList<String>(){{add("Justin Timberlake");}}));
        this.songs.add(new Song("cover#39", "Lost On You", new ArrayList<String>(){{add("LP");}}));
        this.songs.add(new Song("cover#40", "Someone Like You", new ArrayList<String>(){{add("Adele");}}));
        this.songs.add(new Song("cover#41", "All The Lovers", new ArrayList<String>(){{add("Kylie Minogue");}}));
        this.songs.add(new Song("cover#42", "When I Look At You", new ArrayList<String>(){{add("Miley Cyrus");}}));
        this.songs.add(new Song("cover#43", "You Lost Me", new ArrayList<String>(){{add("Christina Aguilera");}}));
        this.songs.add(new Song("cover#44", "Torn", new ArrayList<String>(){{add("One Direction");}}));
        this.songs.add(new Song("cover#45", "Feel", new ArrayList<String>(){{add("Robbie Williams");}}));
        this.songs.add(new Song("cover#46", "Yellow", new ArrayList<String>(){{add("Coldplay");}}));
        this.songs.add(new Song("cover#47", "Sorry", new ArrayList<String>(){{add("Justin Bieber");}}));
        this.songs.add(new Song("cover#48", "On My Mind", new ArrayList<String>(){{add("Cody Simpson");}}));
        this.songs.add(new Song("cover#49", "Incomplete", new ArrayList<String>(){{add("Backstreet Boys");}}));
        this.songs.add(new Song("cover#50", "Love Me Like You Do", new ArrayList<String>(){{add("Ellie Goulding");}}));
        
    }

    /**
     * A method that returns an instance of the SongsGenerator.
     *
     * @return
     */
    public SongsGenerator getSongsGenerator() {
        if(songsGenerator == null) {
            songsGenerator = new SongsGenerator();
        }
        return songsGenerator;
    }

}
