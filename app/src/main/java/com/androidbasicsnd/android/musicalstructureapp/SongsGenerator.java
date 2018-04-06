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
        this.songs.add(new Song("cover#51", "Say Something", new ArrayList<String>(){{add("A Great Big World"); add("Christina Aguilera");}}));
        this.songs.add(new Song("cover#52", "Crazy In Love", new ArrayList<String>(){{add("Beyonce");}}));
        this.songs.add(new Song("cover#53", "Because I Love You", new ArrayList<String>(){{add("September");}}));
        this.songs.add(new Song("cover#54", "Suspicious Minds", new ArrayList<String>(){{add("Elvis Presley");}}));
        this.songs.add(new Song("cover#55", "Drive By", new ArrayList<String>(){{add("Train");}}));
        this.songs.add(new Song("cover#56", "Heaven", new ArrayList<String>(){{add("Bryan Adams");}}));
        this.songs.add(new Song("cover#57", "Everything I Do", new ArrayList<String>(){{add("Bryan Adams");}}));
        this.songs.add(new Song("cover#58", "Bleeding Love", new ArrayList<String>(){{add("Leona Lewis");}}));
        this.songs.add(new Song("cover#59", "Because I Love You", new ArrayList<String>(){{add("Stevie B");}}));
        this.songs.add(new Song("cover#60", "Pillowtalk", new ArrayList<String>(){{add("ZAYN");}}));
        this.songs.add(new Song("cover#61", "Love The Way You Lie", new ArrayList<String>(){{add("Eminem"); add("Rihanna");}}));
        this.songs.add(new Song("cover#62", "November Rain", new ArrayList<String>(){{add("Guns N' Roses");}}));
        this.songs.add(new Song("cover#63", "Lady In Black", new ArrayList<String>(){{add("Uriah Heep");}}));
        this.songs.add(new Song("cover#64", "My Life Would Suck Without You", new ArrayList<String>(){{add("Kelly Clarkson");}}));
        this.songs.add(new Song("cover#65", "Glad You Came", new ArrayList<String>(){{add("The Wanted");}}));
        this.songs.add(new Song("cover#66", "Fairytale", new ArrayList<String>(){{add("Alexander Rybak");}}));
        this.songs.add(new Song("cover#67", "Let Go", new ArrayList<String>(){{add("Paul Van Dyk");}}));
        this.songs.add(new Song("cover#68", "When You Look Me In The Eyes", new ArrayList<String>(){{add("Jonas Brothers");}}));
        this.songs.add(new Song("cover#69", "Sing Me To Sleep", new ArrayList<String>(){{add("Alan Walker");}}));
        this.songs.add(new Song("cover#70", "Arms", new ArrayList<String>(){{add("Christina Perri");}}));
        this.songs.add(new Song("cover#71", "Catch You", new ArrayList<String>(){{add("Sophie Ellis-Bextor");}}));
        this.songs.add(new Song("cover#72", "Sign of the Times", new ArrayList<String>(){{add("Harry Styles");}}));
        this.songs.add(new Song("cover#73", "Titanium", new ArrayList<String>(){{add("David Guetta"); add("Sia");}}));
        this.songs.add(new Song("cover#74", "Transylvania", new ArrayList<String>(){{add("McFly");}}));
        this.songs.add(new Song("cover#75", "Only Teardrops", new ArrayList<String>(){{add("Emmelie de Forest");}}));
        this.songs.add(new Song("cover#76", "Back To December", new ArrayList<String>(){{add("Taylor Swift");}}));
        this.songs.add(new Song("cover#77", "Believe", new ArrayList<String>(){{add("Cher");}}));
        this.songs.add(new Song("cover#78", "Locked Out Of Heaven", new ArrayList<String>(){{add("Bruno Mars");}}));
        this.songs.add(new Song("cover#79", "Eye Of The Tiger", new ArrayList<String>(){{add("Survivor");}}));
        this.songs.add(new Song("cover#80", "Every Single Day", new ArrayList<String>(){{add("Benny Benassi");}}));
        this.songs.add(new Song("cover#81", "Sky", new ArrayList<String>(){{add("Sonique");}}));
        this.songs.add(new Song("cover#82", "My Heart Will Go On", new ArrayList<String>(){{add("Celine Dion");}}));
        this.songs.add(new Song("cover#83", "I Got You Babe", new ArrayList<String>(){{add("Sonny"); add("Cher"); }}));
        this.songs.add(new Song("cover#84", "Ring My Bells", new ArrayList<String>(){{add("Enrique Iglesias");}}));
        this.songs.add(new Song("cover#85", "My Number One", new ArrayList<String>(){{add("Helena Paparizou");}}));
        this.songs.add(new Song("cover#86", "Uncover", new ArrayList<String>(){{add("Zara Larson");}}));
        this.songs.add(new Song("cover#87", "Eternal Flame", new ArrayList<String>(){{add("The Bangles");}}));
        this.songs.add(new Song("cover#88", "Spending My Time", new ArrayList<String>(){{add("Roxette");}}));
        this.songs.add(new Song("cover#89", "In The Heat Of The Night", new ArrayList<String>(){{add("Sandra");}}));
        this.songs.add(new Song("cover#90", "Sleep, For The Weak!", new ArrayList<String>(){{add("Lea Rue"); add("Lost Frequencies"); }}));
        this.songs.add(new Song("cover#91", "One on One", new ArrayList<String>(){{add("Tujamo"); add("Sorana"); }}));
        this.songs.add(new Song("cover#92", "Alone", new ArrayList<String>(){{add("Alan Walker"); }}));
        this.songs.add(new Song("cover#93", "Broken Strings", new ArrayList<String>(){{add("James Morrison"); add("Nelly Furtado"); }}));
        this.songs.add(new Song("cover#94", "Perfect Places", new ArrayList<String>(){{add("Lorde"); }}));
        this.songs.add(new Song("cover#95", "A Drop In The Ocean", new ArrayList<String>(){{add("Ron Rope"); }}));
        this.songs.add(new Song("cover#96", "Everytime We Touch", new ArrayList<String>(){{add("Maggie Reilly"); }}));
        this.songs.add(new Song("cover#97", "Let Me Love You", new ArrayList<String>(){{add("DJ Snake"); add("Justin Bieber"); }}));
        this.songs.add(new Song("cover#98", "Dusk Till Dawn", new ArrayList<String>(){{add("ZAYN"); add("Sia"); }}));
        this.songs.add(new Song("cover#99", "Mercy", new ArrayList<String>(){{add("Shawn Mendes"); }}));
        this.songs.add(new Song("cover#100", "2U", new ArrayList<String>(){{add("David Guetta"); add("Justin Bieber"); }}));
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
}
