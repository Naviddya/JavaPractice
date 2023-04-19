package Java8Features.streamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Methods {

    public static void main(String[] args) {



        //List<String> names=list.of("naviddya","batra","chinu");

        List<String> listmp=new ArrayList<>();
        listmp.add("naviud");
        listmp.add("batra");

        listmp.add("chine");

      //  System.out.println(listmp);


        List<String> newStream=listmp.stream().filter(e->e.startsWith("n")).collect(Collectors.toList());

        System.out.println(newStream);


        List<Integer> numbers=new ArrayList<>();

        numbers.add(5);
        numbers.add(23);
        numbers.add(51);

        numbers.add(1);


       List<Integer> newStream2= numbers.stream().map(i->i*i).collect(Collectors.toList());

        System.out.println(newStream2);

     numbers.stream().forEach(e->{
         if(numbers.equals(23))
         {
             System.out.println(e*e);
         }

     });


     numbers.stream().sorted().forEach(e-> System.out.println(e));


     Integer max=numbers.stream().max((x,y)->x.compareTo(y)).get();

        System.out.println(max);





    }
}


    //filter (predicate boolean valued function  return true or fals



