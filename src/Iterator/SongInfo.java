package Iterator;

/**
 * Created by Quang on 11/8/15.
 */
public class SongInfo {
    String songName;
    String bandName;
    int yearReleased;

    public SongInfo(String newSongName, String newBandName, int newYearReleased){
        songName = newSongName;
        bandName = newBandName;
        yearReleased = newYearReleased;
    }

    public String getSongName(){
        return songName;
    }
    public String getBandName(){
        return bandName;
    }
    public int getYearReleased(){
        return yearReleased;
    }
}
