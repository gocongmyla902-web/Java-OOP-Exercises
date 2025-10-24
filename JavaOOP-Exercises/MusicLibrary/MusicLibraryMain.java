package MusicLibrary;

public class MusicLibraryMain {
    public static void main(String[] args) {
        MusicLibrary lib = new MusicLibrary();
        lib.addSong("Song A");
        lib.addSong("Song B");
        lib.playRandomSong();
    }
}
