package Collection;

import java.util.ArrayList;
import java.util.List;

public class ListExample {


    public static void main(String[] args) {

        List<Integer> li=new ArrayList<Integer>();

        li.add(0,10);
        li.add(1,20);
        li.add(2,30);


        System.out.println(li);

       System.out.println(li.size());

        System.out.println(li.get(2));


        List<String> li2=new ArrayList<>();

        li2.add("batra");
        li2.add("chinu");

        li2.add("hadder");

        System.out.println(li2);

        li2.set(1,"bta");

        System.out.println(li2);

        int li3=li2.indexOf("chinu");

        System.out.println(li3);


        for(int i=0;i< li2.size();i++)
        {
            System.out.println(li.get(i));
        }

        for (String str:li2
             )
        {

            System.out.println(str);


           // equals method

            String st1="naviddya";
            String st22="batra";
            System.out.println(st1.equals(st22));
            System.out.println(st1==st22);
        }


    }
}
