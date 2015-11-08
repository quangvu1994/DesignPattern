package Iterator;
import java.util.*;

/**
 * Created by Quang on 11/8/15.
 */
public class SongOfThe80s implements SongIterator {
    SongInfo[] bestSongs;
    int arrayValue = 0;

    public SongOfThe80s(){
        bestSongs = new SongInfo[3];
        addSong("Imagine", "John Lennon", 1971);
        addSong("American Pie", "John Lennon", 1971);
        addSong("I will survive", "John Lennon", 1971);
    }

    public void addSong(String songName, String bandName, int yearReleased){
        SongInfo songInfo = new SongInfo(songName, bandName, yearReleased);
        bestSongs[arrayValue] = songInfo;
        arrayValue++;
    }

    @Override
    public Iterator createIterator() {
        return Arrays.asList(bestSongs).iterator();
    }
}
