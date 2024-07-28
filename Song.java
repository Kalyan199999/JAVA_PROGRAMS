public class Song implements  Comparable<Song>{
    
    private String name,singer;
    private int year;

    Song(String nam , String sing,int y)
    {
        this.name = nam;
        this.singer = sing;
        this.year = y;
    }

    public  String getName()
    {
        return name;
    }

    public String getSinger()
    {
        return singer;
    }

    public  int getYear()
    {
        return year;
    }

    @Override
    public String toString()
    {
        return "Song [title="+name+ ", Singer="+singer+", year="+year+"]";
    }

    @Override
    public int compareTo(Song anotherSong) {

        // if(this.getYear() > anotherSong.getYear()) return 1;
        
        // if(this.getYear() < anotherSong.getYear()) return 1;

        // return 0;

        return this.getName().compareTo(anotherSong.getName());
    }

}
