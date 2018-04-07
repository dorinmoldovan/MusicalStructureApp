package com.androidbasicsnd.android.musicalstructureapp;

import java.util.ArrayList;

/**
 * A class that is used for generating a list of songs that are used to populate the application.
 */
public class SongsGenerator {

    private ArrayList<Song> songs;
    private static SongsGenerator songsGenerator;

    /**
     * The default constructor of the class SongsGenerator.
     */
    private SongsGenerator() {
        this.songs = new ArrayList<Song>();
        this.songs.add(new Song("cover#1", "Can't Fight This Feeling", new ArrayList<String>(){{add("REO Speedwagon");}}, true, false));
        this.songs.add(new Song("cover#2", "Riptide", new ArrayList<String>(){{add("Vance Joy");}}, true, false));
        this.songs.add(new Song("cover#3", "Down", new ArrayList<String>(){{add("Jason Walker");}}, true, false));
        this.songs.add(new Song("cover#4", "Never Be Alone", new ArrayList<String>(){{add("Shawn Mendes");}}, true, false));
        this.songs.add(new Song("cover#5", "Hold It Against Me", new ArrayList<String>(){{add("Britney Spears");}}, false, true));
        this.songs.add(new Song("cover#6", "Can't Help Falling In Love", new ArrayList<String>(){{add("Elvis Presley");}}, false, true));
        this.songs.add(new Song("cover#7", "All Of Me", new ArrayList<String>(){{add("John Legend");}}, true, false));
        this.songs.add(new Song("cover#8", "Never Let Me Go", new ArrayList<String>(){{add("Florence"); add("The Machine");}}, false, true));
        this.songs.add(new Song("cover#9", "Budapest", new ArrayList<String>(){{add("George Ezra");}}, true, false));
        this.songs.add(new Song("cover#10", "Waiting", new ArrayList<String>(){{add("Dash Berlin"); add("Emma Hewitt");}}, false, true));
        this.songs.add(new Song("cover#11", "Behind Blue Eyes", new ArrayList<String>(){{add("Limp Bizkit");}}, true, false));
        this.songs.add(new Song("cover#12", "In and Out Of Love", new ArrayList<String>(){{add("Armin van Buuren"); add("Sharon den Adel");}}, false, true));
        this.songs.add(new Song("cover#13", "Impossible", new ArrayList<String>(){{add("James Arthur");}}, true, false));
        this.songs.add(new Song("cover#14", "Blank Space", new ArrayList<String>(){{add("Taylor Swift");}}, false, true));
        this.songs.add(new Song("cover#15", "Baby When The Light", new ArrayList<String>(){{add("David Guetta");}}, false, true));
        this.songs.add(new Song("cover#16", "Supergirl", new ArrayList<String>(){{add("Reamonn");}}, true, false));
        this.songs.add(new Song("cover#17", "Only Love Can Hurt Like This", new ArrayList<String>(){{add("Paloma Faith");}}, false, true));
        this.songs.add(new Song("cover#18", "Skinny Love", new ArrayList<String>(){{add("Birdy");}}, false, true));
        this.songs.add(new Song("cover#19", "I'm Yours", new ArrayList<String>(){{add("Jason Mraz");}}, true, false));
        this.songs.add(new Song("cover#20", "Hello", new ArrayList<String>(){{add("Adele");}}, false, true));
        this.songs.add(new Song("cover#21", "While Your Lips Are Still Red", new ArrayList<String>(){{add("Nightwish");}}, true, false));
        this.songs.add(new Song("cover#22", "I Don't Wanna Live Forever", new ArrayList<String>(){{add("ZAYN"); add("Taylor Swift");}}, true, true));
        this.songs.add(new Song("cover#23", "Chasing Cars", new ArrayList<String>(){{add("Snow Patrol");}}, true, false));
        this.songs.add(new Song("cover#24", "Born to Die", new ArrayList<String>(){{add("Lana Del Rey");}}, false, true));
        this.songs.add(new Song("cover#25", "Toxic", new ArrayList<String>(){{add("Britney Spears");}}, false, true));
        this.songs.add(new Song("cover#26", "Dear Darlin'", new ArrayList<String>(){{add("Olly Murs");}}, true, false));
        this.songs.add(new Song("cover#27", "Heartbeat'", new ArrayList<String>(){{add("Justs");}}, true, false));
        this.songs.add(new Song("cover#28", "Let Her Go'", new ArrayList<String>(){{add("Passenger");}}, true, false));
        this.songs.add(new Song("cover#29", "Story of My Life'", new ArrayList<String>(){{add("One Direction");}}, true, false));
        this.songs.add(new Song("cover#30", "Brother Louie", new ArrayList<String>(){{add("Modern Talking");}}, true, false));
        this.songs.add(new Song("cover#31", "Stay", new ArrayList<String>(){{add("Rihanna"); add("Mikky Ekko");}}, true, true));
        this.songs.add(new Song("cover#32", "Stitches", new ArrayList<String>(){{add("Shawn Mendes");}}, true, false));
        this.songs.add(new Song("cover#33", "Love Yourself", new ArrayList<String>(){{add("Justin Bieber");}}, true, false));
        this.songs.add(new Song("cover#34", "Echo", new ArrayList<String>(){{add("Jason Walker");}}, true, false));
        this.songs.add(new Song("cover#35", "You're The One That I Want", new ArrayList<String>(){{add("Grease");}}, true, true));
        this.songs.add(new Song("cover#36", "Dangerous", new ArrayList<String>(){{add("David Guetta"); add("Sam Martin");}}, true, false));
        this.songs.add(new Song("cover#37", "Afterglow", new ArrayList<String>(){{add("INXS");}}, true, false));
        this.songs.add(new Song("cover#38", "Mirrors", new ArrayList<String>(){{add("Justin Timberlake");}}, true, false));
        this.songs.add(new Song("cover#39", "Lost On You", new ArrayList<String>(){{add("LP");}}, false, true));
        this.songs.add(new Song("cover#40", "Someone Like You", new ArrayList<String>(){{add("Adele");}}, false, true));
        this.songs.add(new Song("cover#41", "All The Lovers", new ArrayList<String>(){{add("Kylie Minogue");}}, false, true));
        this.songs.add(new Song("cover#42", "When I Look At You", new ArrayList<String>(){{add("Miley Cyrus");}}, false, true));
        this.songs.add(new Song("cover#43", "You Lost Me", new ArrayList<String>(){{add("Christina Aguilera");}}, false, true));
        this.songs.add(new Song("cover#44", "Torn", new ArrayList<String>(){{add("One Direction");}}, true, false));
        this.songs.add(new Song("cover#45", "Feel", new ArrayList<String>(){{add("Robbie Williams");}}, true, false));
        this.songs.add(new Song("cover#46", "Yellow", new ArrayList<String>(){{add("Coldplay");}}, true, false));
        this.songs.add(new Song("cover#47", "Sorry", new ArrayList<String>(){{add("Justin Bieber");}}, true, false));
        this.songs.add(new Song("cover#48", "On My Mind", new ArrayList<String>(){{add("Cody Simpson");}}, true, false));
        this.songs.add(new Song("cover#49", "Incomplete", new ArrayList<String>(){{add("Backstreet Boys");}}, true, false));
        this.songs.add(new Song("cover#50", "Love Me Like You Do", new ArrayList<String>(){{add("Ellie Goulding");}}, false, true));
        this.songs.add(new Song("cover#51", "Say Something", new ArrayList<String>(){{add("A Great Big World"); add("Christina Aguilera");}}, true, true));
        this.songs.add(new Song("cover#52", "Crazy In Love", new ArrayList<String>(){{add("Beyonce");}}, false, true));
        this.songs.add(new Song("cover#53", "Because I Love You", new ArrayList<String>(){{add("September");}}, false, true));
        this.songs.add(new Song("cover#54", "Suspicious Minds", new ArrayList<String>(){{add("Elvis Presley");}}, true, false));
        this.songs.add(new Song("cover#55", "Drive By", new ArrayList<String>(){{add("Train");}}, true, false));
        this.songs.add(new Song("cover#56", "Heaven", new ArrayList<String>(){{add("Bryan Adams");}}, true, false));
        this.songs.add(new Song("cover#57", "Everything I Do", new ArrayList<String>(){{add("Bryan Adams");}}, true, false));
        this.songs.add(new Song("cover#58", "Bleeding Love", new ArrayList<String>(){{add("Leona Lewis");}}, false, true));
        this.songs.add(new Song("cover#59", "Because I Love You", new ArrayList<String>(){{add("Stevie B");}}, true, false));
        this.songs.add(new Song("cover#60", "Pillowtalk", new ArrayList<String>(){{add("ZAYN");}}, true, false));
        this.songs.add(new Song("cover#61", "Love The Way You Lie", new ArrayList<String>(){{add("Eminem"); add("Rihanna");}}, true, true));
        this.songs.add(new Song("cover#62", "November Rain", new ArrayList<String>(){{add("Guns N' Roses");}}, true, false));
        this.songs.add(new Song("cover#63", "Lady In Black", new ArrayList<String>(){{add("Uriah Heep");}}, true, false));
        this.songs.add(new Song("cover#64", "My Life Would Suck Without You", new ArrayList<String>(){{add("Kelly Clarkson");}}, false, true));
        this.songs.add(new Song("cover#65", "Glad You Came", new ArrayList<String>(){{add("The Wanted");}}, true, false));
        this.songs.add(new Song("cover#66", "Fairytale", new ArrayList<String>(){{add("Alexander Rybak");}}, true, false));
        this.songs.add(new Song("cover#67", "Let Go", new ArrayList<String>(){{add("Paul Van Dyk");}}, true, false));
        this.songs.add(new Song("cover#68", "When You Look Me In The Eyes", new ArrayList<String>(){{add("Jonas Brothers");}}, true, false));
        this.songs.add(new Song("cover#69", "Sing Me To Sleep", new ArrayList<String>(){{add("Alan Walker");}}, false, true));
        this.songs.add(new Song("cover#70", "Arms", new ArrayList<String>(){{add("Christina Perri");}}, false, true));
        this.songs.add(new Song("cover#71", "Catch You", new ArrayList<String>(){{add("Sophie Ellis-Bextor");}}, false, true));
        this.songs.add(new Song("cover#72", "Sign of the Times", new ArrayList<String>(){{add("Harry Styles");}}, true, false));
        this.songs.add(new Song("cover#73", "Titanium", new ArrayList<String>(){{add("David Guetta"); add("Sia");}}, false, true));
        this.songs.add(new Song("cover#74", "Transylvania", new ArrayList<String>(){{add("McFly");}}, true, false));
        this.songs.add(new Song("cover#75", "Only Teardrops", new ArrayList<String>(){{add("Emmelie de Forest");}}, false, true));
        this.songs.add(new Song("cover#76", "Back To December", new ArrayList<String>(){{add("Taylor Swift");}}, false, true));
        this.songs.add(new Song("cover#77", "Believe", new ArrayList<String>(){{add("Cher");}}, false, true));
        this.songs.add(new Song("cover#78", "Locked Out Of Heaven", new ArrayList<String>(){{add("Bruno Mars");}}, true, false));
        this.songs.add(new Song("cover#79", "Eye Of The Tiger", new ArrayList<String>(){{add("Survivor");}}, true, false));
        this.songs.add(new Song("cover#80", "Every Single Day", new ArrayList<String>(){{add("Benny Benassi");}}, false, true));
        this.songs.add(new Song("cover#81", "Sky", new ArrayList<String>(){{add("Sonique");}}, false, true));
        this.songs.add(new Song("cover#82", "My Heart Will Go On", new ArrayList<String>(){{add("Celine Dion");}}, false, true));
        this.songs.add(new Song("cover#83", "I Got You Babe", new ArrayList<String>(){{add("Sonny"); add("Cher"); }}, true, true));
        this.songs.add(new Song("cover#84", "Ring My Bells", new ArrayList<String>(){{add("Enrique Iglesias");}}, true, false));
        this.songs.add(new Song("cover#85", "My Number One", new ArrayList<String>(){{add("Helena Paparizou");}}, false, true));
        this.songs.add(new Song("cover#86", "Uncover", new ArrayList<String>(){{add("Zara Larson");}}, false, true));
        this.songs.add(new Song("cover#87", "Eternal Flame", new ArrayList<String>(){{add("The Bangles");}}, false, true));
        this.songs.add(new Song("cover#88", "Spending My Time", new ArrayList<String>(){{add("Roxette");}}, false, true));
        this.songs.add(new Song("cover#89", "In The Heat Of The Night", new ArrayList<String>(){{add("Sandra");}}, false, true));
        this.songs.add(new Song("cover#90", "Sleep, For The Weak!", new ArrayList<String>(){{add("Lea Rue"); add("Lost Frequencies"); }}, false, true));
        this.songs.add(new Song("cover#91", "One on One", new ArrayList<String>(){{add("Tujamo"); add("Sorana"); }}, false, true));
        this.songs.add(new Song("cover#92", "Alone", new ArrayList<String>(){{add("Alan Walker"); }}, false, true));
        this.songs.add(new Song("cover#93", "Broken Strings", new ArrayList<String>(){{add("James Morrison"); add("Nelly Furtado"); }}, true, true));
        this.songs.add(new Song("cover#94", "Perfect Places", new ArrayList<String>(){{add("Lorde"); }}, false, true));
        this.songs.add(new Song("cover#95", "A Drop In The Ocean", new ArrayList<String>(){{add("Ron Rope"); }}, true, false));
        this.songs.add(new Song("cover#96", "Everytime We Touch", new ArrayList<String>(){{add("Maggie Reilly"); }}, false, true));
        this.songs.add(new Song("cover#97", "Let Me Love You", new ArrayList<String>(){{add("DJ Snake"); add("Justin Bieber"); }}, true, false));
        this.songs.add(new Song("cover#98", "Dusk Till Dawn", new ArrayList<String>(){{add("ZAYN"); add("Sia"); }}, true, true));
        this.songs.add(new Song("cover#99", "Mercy", new ArrayList<String>(){{add("Shawn Mendes"); }}, true, false));
        this.songs.add(new Song("cover#100", "2U", new ArrayList<String>(){{add("David Guetta"); add("Justin Bieber"); }}, true, false));
    }

    /**
     * A method that returns an instance of the SongsGenerator.
     *
     * @return
     */
    public static SongsGenerator getSongsGenerator() {
        if(songsGenerator == null) {
            songsGenerator = new SongsGenerator();
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
