
import java.util.Comparator;

public class SortCompare implements  Comparator<Song>{

    public SortCompare() {
    }

    @Override
    public int compare(Song s1, Song s2) {

        if(s1.getYear() < s2.getYear()) return -1;

        if(s1.getYear() > s2.getYear()) return 1;

        return 0;
    }
    
}
