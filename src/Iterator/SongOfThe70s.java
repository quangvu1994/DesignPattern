package Iterator;
import java.util.*;
/**
 * Created by Quang on 11/8/15.
 */
public class SongOfThe70s implements SongIterator{
    ArrayList<SongInfo> bestSongs;

    public SongOfThe70s(){
        bestSongs = new ArrayList<SongInfo>();
        addSong("Imagine", "John Lennon", 1971);
        addSong("American Pie", "John Lennon", 1971);
        addSong("I will survive", "John Lennon", 1971);
    }

    public void addSong(String songName, String bandName, int yearReleased){
        SongInfo songInfo = new SongInfo(songName, bandName, yearReleased);
        bestSongs.add(songInfo);
    }

    @Override
    public Iterator createIterator() {
        return bestSongs.iterator();
    }
}
