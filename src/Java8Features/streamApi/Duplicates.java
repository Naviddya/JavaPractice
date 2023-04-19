package Java8Features.streamApi;

import java.awt.print.PrinterGraphics;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Duplicates {

    public static void main(String[] args) {

        List<Integer> dup=new ArrayList<>();

        dup.add(22);
        dup.add(23);
        dup.add(30);
        dup.add(45);
        dup.add(45);


        List<Integer>  str=dup.stream().distinct().collect(Collectors.toList());

        System.out.println(str);
        int [] arr={22,33,44,55,55,66};

       int [] array=new int[arr.length];
// int j=0;
//
//        for(int i=0;i<arr.length-1;i++)
//        {
//            if(arr[i]!=arr[i+1])
//            {
//                 array[j++]=arr[i];
//            }
//        }
//        array[j++]=arr[arr.length];
//       // System.out.println(array[j]);
//
//        for (int i = 0; i < j; i++)
//            System.out.print(arr[i] + " ");
        int j = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                array[j++] = arr[i];
            }
        }
        array[j++] = arr[arr.length - 1];

        for (int i = 0; i < j; i++) {
            System.out.print(array[i] + " ");
        }

        List<Integer>  element= Arrays.asList(2,344,56,78,90);

       List<Integer> ele= element.stream().sorted().collect(Collectors.toList());

        System.out.println(ele);

       Integer  intr=ele.stream().skip(1).findFirst().orElse(null);

       //Integer interer=ele.stream().findAny().get(344);

        System.out.println(intr);


        //wan to search the elemet int i the list

        List<Integer> intrr=Arrays.asList(23,21,11,11,22,44,44,1,22,3,3,3,4);


        boolean ispresent=intrr.stream().anyMatch(x->x==23);

        if(ispresent)
        {
            System.out.println("344 is present");
        }


        Set<Integer> se=new HashSet<>();

        List<Integer>  sr=intrr.stream().filter(x->se.add(x)).collect(Collectors.toList());

        System.out.println(sr);


       long count= intrr.stream().count();

        System.out.println(count);


          Optional<Integer> max= intrr.stream().max(Integer::compare);

        int  mx=intrr.stream().max(Integer::compare).get();

        System.out.println(mx);



        List<Integer> listdesc=intrr.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());

        System.out.println(listdesc);


        List<Integer> fiveHighest=intrr.stream().sorted(Collections.reverseOrder()).limit(5).collect(Collectors.toList());

        System.out.println(fiveHighest);


       int min= intrr.stream().min(Integer::compareTo).get();

        System.out.println(min);


        List<String> names=Arrays.asList("naviddua","bagtra","headoffice","prabradh");


       long coun= names.stream().filter(x->x.length()>8).count();

        List<String> listOfnames= names.stream().filter(x->x.length()>8).collect(Collectors.toList());


        System.out.println(coun);

        System.out.println(listOfnames);


        List<Integer> listOfIntegers=Arrays.asList(2,45,67,89,10);

        List<Integer> lis=listOfIntegers.stream().map(i->i*3).collect(Collectors.toList());

        System.out.println(lis);

       int su= listOfIntegers.stream().mapToInt(Integer::intValue).sum();

        System.out.println(su);




    }
}
