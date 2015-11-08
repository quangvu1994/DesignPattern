package Iterator;

import java.util.*;

/**
 * Created by Quang on 11/8/15.
 */
public class SongOfThe90s implements SongIterator {
    Hashtable<Integer, SongInfo> bestSongs;
    int hashKey = 0;
    public SongOfThe90s(){
        bestSongs = new Hashtable<Integer, SongInfo>();
        addSong("Imagine", "John Lennon", 1971);
        addSong("American Pie", "John Lennon", 1971);
        addSong("I will survive", "John Lennon", 1971);
    }

    public void addSong(String songName, String bandName, int yearReleased){
        SongInfo songInfo = new SongInfo(songName, bandName, yearReleased);
        bestSongs.put(hashKey, songInfo);
        hashKey++;
    }

    @Override
    public Iterator createIterator() {
        return bestSongs.values().iterator();
    }
}
