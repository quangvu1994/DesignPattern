package Iterator;
import java.util.*;
/**
 * Created by Quang on 11/8/15.
 */
public class DiscJockey {
    SongIterator songs70s;
    SongIterator songs80s;
    SongIterator songs90s;

    public DiscJockey(SongIterator songs70s, SongIterator songs80s, SongIterator songs90s){
        this.songs70s = songs70s;
        this.songs80s = songs80s;
        this.songs90s = songs90s;
    }

    public void showTheSong(){
        Iterator s70s = songs70s.createIterator();
        Iterator s80s = songs80s.createIterator();
        Iterator s90s = songs90s.createIterator();

        System.out.println("Songs of the 70s\n");
        printTheSongs(s70s);
    }

    public void printTheSongs(Iterator iterator){
        while(iterator.hasNext()){
            SongInfo songInfo = (SongInfo) iterator.next();

            System.out.println(songInfo.getSongName());
            System.out.println(songInfo.getBandName());
            System.out.println(songInfo.getYearReleased());
        }
    }
}
