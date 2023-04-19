package Java8Features.streamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamBasicExample {

    public static void main(String[] args) {


//        Stream s1=Stream.of(20,30,40,78,50,90);
//
//
//        Stream s2=s1.filter(i->i>20).forEach(i->System.out.print(i));
//

        List<String> listString=new ArrayList<>();

        listString.add("navud");
        listString.add("naman");
        listString.add("batra");

        Stream s1=listString.stream();

       List<String> str= listString.stream().filter(i->i.startsWith("n")).collect(Collectors.toList());

        System.out.println(str);


        //MApping opertiaon


        List<String> str2=str.stream().map(s->s.toUpperCase()).collect(Collectors.toList());

        System.out.println(str2);
      //  List<String> names = Arrays.asList("Chris", "HTML", "XML", "CSS");

    }
}
