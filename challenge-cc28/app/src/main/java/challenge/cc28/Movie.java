package challenge.cc28;

public class Movie {
    String title;
    int year;
    String [] genres;

    public Movie(String title, int year, String[] genres) {
        this.title = title;
        this.year = year;
        this.genres = genres;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public String[] getGenres() {
        return genres;
    }
}
