package main.java;

import java.util.ArrayList;

public class Playlist {

    public static void main(String[] args) {
        ArrayList<String> desertIslandPlaylist = new ArrayList<>();
        desertIslandPlaylist.add("More than feeling");
        desertIslandPlaylist.add("We will rock you");
        desertIslandPlaylist.add("Bohemian Rhapsody");
        desertIslandPlaylist.add("Run to the hills");
        desertIslandPlaylist.add("Hallowed by thy name");
        desertIslandPlaylist.add("Number of the beast");

        desertIslandPlaylist.remove(2);

        int indexNumberOfSongA = desertIslandPlaylist.indexOf("Hallowed by thy name");
        int indexNumberOfSongB = desertIslandPlaylist.indexOf("Number of the beast");

        String tempA = desertIslandPlaylist.get(indexNumberOfSongA);
        desertIslandPlaylist.set(indexNumberOfSongA, "Number of the beast");
        desertIslandPlaylist.set(indexNumberOfSongB, tempA);

        System.out.println(desertIslandPlaylist.toString());
        System.out.println(desertIslandPlaylist.size());
    }
}
