package MusicLibrary;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class MusicLibrary {
    private List<String> songs = new ArrayList<>();
    private Random rand = new Random();

    public List<String> getSongs() { return songs; }
    public void addSong(String song) { songs.add(song); }
    public void removeSong(String song) { songs.remove(song); }

    public void playRandomSong() {
        if (songs.isEmpty()) System.out.println("No songs available.");
        else System.out.println("Playing: " + songs.get(rand.nextInt(songs.size())));
    }
}

