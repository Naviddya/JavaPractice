package Java8Features.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamApiEx {


    public static void main(String[] args) {



        List<Integer> list= Arrays.asList(1,2,66,55,44,44);

        Stream<Integer> data=list.stream();
        //list.forEach(n-> System.out.println(n));


        //data.forEach(n-> System.out.println(n));
       Stream<Integer> sorted=data.sorted();

        sorted.forEach(n-> System.out.println(n));
    }
}
