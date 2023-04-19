package Movie;

public class Movie implements Comparable<Movie>  {

    private int year;
    private String name;
    private int rating;

    @Override
    public String toString() {
        return "Movie{" +
                "year=" + year +
                ", name='" + name + '\'' +
                ", rating=" + rating +
                '}';
    }

    public  Movie(int year, String name, int rating)
    {
        this.name=name;
        this.year=year;
        this.rating=rating;
    }

    public int getReleaseDate() {
        return year;
    }



    public String getName() {
        return name;
    }



    public int getRating() {
        return rating;
    }


    @Override
    public int compareTo(Movie movie) {
        return this.year - movie.year;
    }
}
