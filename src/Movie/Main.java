package Movie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Movie> movies=new ArrayList<>();
        movies.add(new Movie(2019,"Prarabdh",10));
        movies.add(new Movie(2002,"Navi",3));
        movies.add(new Movie(2020,"Batra",5));

        System.out.println("Before sorting:"+movies);
      //  NameComparator nam=new NameComparator();

       // Collections.sort(movies);
      //  Collections.sort(movies,new NameComparator());
        Collections.sort(movies,new RatingComparator());
        System.out.println("After sorting:"+movies);



    }

}
