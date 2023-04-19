package Java8Features.streamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

public class StreamObject {


    public static void main(String[] args) {

        //collections
        //group of object
        //arrays

        Stream<Object> emptyStream=Stream.empty();
//
//        emptyStream.forEach(e->
//        {
//            System.out.println(e);
//        });

    ///stream array
        String name[]={"naviddya","batra","chinu","simran","jatin"};


        Stream<String> Stream1=Stream.of(name);


        Stream1.forEach(e->{
            System.out.println(e);
        });

        //budilder

//       Stream<Object> streamBuilder= Stream.builder().build();
//
//        Arrays.stream()


        List<Integer> listOfInt=new ArrayList<>();

        //  List<Integer> listofInteger=List.of(8,8,9,965,,546,45);

        listOfInt.add(1);
        listOfInt.add(22);
        listOfInt.add(8);
        listOfInt.add(19);
        listOfInt.add(23);
        listOfInt.add(88);

       Stream<Integer> stream2=listOfInt.stream();

       stream2.forEach(e->{
           System.out.println(e.getClass());
       });

    }
}
