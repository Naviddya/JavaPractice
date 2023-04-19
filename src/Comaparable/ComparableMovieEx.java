package Comaparable;

import Movie.Movie;

public class ComparableMovieEx  implements  Comparable<ComparableMovieEx> {

    private  String moveiname;
    private  String rating;
    private  int releasesDate;

    public ComparableMovieEx(String moveiname, String rating, int releasesDate) {
        this.moveiname = moveiname;
        this.rating = rating;
        this.releasesDate = releasesDate;
    }

    @Override
    public String toString() {
        return "ComparableMovieEx{" +
                "moveiname='" + moveiname + '\'' +
                ", rating='" + rating + '\'' +
                ", releasesDate=" + releasesDate +
                '}';
    }

    public String getMoveiname() {
        return moveiname;
    }

    public void setMoveiname(String moveiname) {
        this.moveiname = moveiname;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public int getReleasesDate() {
        return releasesDate;
    }

    public void setReleasesDate(int releasesDate) {
        this.releasesDate = releasesDate;
    }



    @Override
    public int compareTo(ComparableMovieEx o) {
        return  this.releasesDate-o.releasesDate;
    }
}
