
public class Songs {
    public String Song_name;
    public String Artist;
    public int Rated;
    
    public Songs(){}

    public Songs(String Song_name, String Artist, int Rated) {
        this.Song_name = Song_name;
        this.Artist = Artist;
        this.Rated = Rated;
    }

    public void setSong_name(String Song_name) {
        this.Song_name = Song_name;
    }

    public void setArtist(String Artist) {
        this.Artist = Artist;
    }

    public void setRated(int Rated) {
        this.Rated = Rated;
    }

    public String getSong_name() {
        return Song_name;
    }

    public String getArtist() {
        return Artist;
    }

    public int getRated() {
        return Rated;
    }

    @Override
    public String toString() {
        return Song_name + " | " + Artist + " | " + Rated;
    }
}
