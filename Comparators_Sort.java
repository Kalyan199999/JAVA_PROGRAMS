
import  java.util.*;

public class Comparators_Sort {
    public static void main(String[] args) {
        ArrayList<Song> list = new ArrayList<>();

        list.add(new Song("dum masala", "mahesh babu", 2024));
        list.add(new Song("rakasi rakasi", "ntr", 2015));
        list.add(new Song("manasa nuvve cheppu", "harris jai raj", 2008));
        list.add(new Song("harimo harimo", "rajini", 2010));
        list.add(new Song("legend", "balayya", 2015));
        list.add(new Song("jayaho", "a r rehaman", 1999));

        for(Song s:list)
        {
            System.out.println(s);
        }

        // Collections.sort(list);
        // System.out.println("After Comparable Sorting...................");

        // for(Song s:list)
        // {
        //     System.out.println(s);
        // }

        // Collections.sort(list, new SortCompare());

        Collections.sort(list , (s1,s2)-> s1.getYear() - s2.getYear());

        
        System.out.println("After Comparator Sorting...................");
        for(Song s:list)
        {
            System.out.println(s);
        }
    }
}
