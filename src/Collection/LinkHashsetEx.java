package Collection;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkHashsetEx {

    public static void main(String[] args) {

        Set<String> country=new LinkedHashSet<>();
        country.add("india");

        country.add("pakistan");

        country.add("china");
        country.add("srilanka");
              country.add("india");

        //Collections.sort();
        System.out.println("set of country"+country);







    }
}
