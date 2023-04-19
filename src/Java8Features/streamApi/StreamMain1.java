package Java8Features.streamApi;

import InterfaceExample.InterfaceExmple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain1 {

    public static  void main(String args[])
    {
        //create a list and print even records


        List<Integer> listOfInt=new ArrayList<>();

      //  List<Integer> listofInteger=List.of(8,8,9,965,,546,45);

        listOfInt.add(1);
        listOfInt.add(2);
        listOfInt.add(8);
        listOfInt.add(19);
        listOfInt.add(23);
        listOfInt.add(88);

        System.out.println(listOfInt);

        //List<Integer> list= Arrays.asList(23,365,35,243,76);

//


//        for (Integer int:
//             ) {
//
//        }


        //with stream api
//       Stream<Integer> stream=listOfInt.stream();
//
//       List<Integer> newList=stream.filter(i->i%2==0).collect(Collectors.toList());
//
//        System.out.println(newList);

        List<Integer> newfilteredlist=listOfInt.stream().filter(x->x%2==0).collect(Collectors.toList());

        System.out.println(newfilteredlist);

        List<Integer> newfilteredlist2=listOfInt.stream().filter(x->x>50).collect(Collectors.toList());

        System.out.println(newfilteredlist2);
    }
}
