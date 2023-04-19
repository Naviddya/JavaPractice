package Comaparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        List<ComparableMovieEx> movieList=new ArrayList<>();


        movieList.add(new ComparableMovieEx("St","2",2024));
        movieList.add(new ComparableMovieEx("dus ka dum","3",2018));
        movieList.add(new ComparableMovieEx("hero","4",2020));


        Collections.sort(movieList);
        System.out.println("movies after sorting");


        for (ComparableMovieEx ex:movieList
             ) {

            System.out.println(ex.getMoveiname()+" "+ex.getRating()+" "+ex.getReleasesDate());

        }

    }
}
