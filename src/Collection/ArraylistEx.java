package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArraylistEx {

    public static void main(String[] args)
    {
        int a=5;
        ArrayList<Integer> in=new ArrayList<Integer>(a);

        in.add(2);
        in.add(30);
        System.out.println("the added element in the arraylist in"+in);
        in.add(40);
        for(int i=0;i<10;i++)
        {
            in.add(i);
            System.out.println(in);
        }

        for(int i=0;i<in.size();i++)
        {
            System.out.println(in.get(i));
        }
        System.out.println("updated list"+in.size());
        in.remove(5);
        if(in.contains(30))
        {
            System.out.println("arraylist value is present");
        } else

        {
            System.out.println("value is no pre");
        }
        System.out.println(in.contains(30));
        System.out.println("updated list"+in.size());


        ArrayList<Object> arrl=new ArrayList<Object>();

        arrl.add("sjas");
        arrl.add(1);
        System.out.println(arrl);

        ArrayList<String> str=new ArrayList<>();

        str.add("bat");
        str.add("sun");
        str.add("basss");
        
        for(int i=0;i<str.size();i++)
        {
            System.out.println(str.get(i)+" ");
        }

        System.out.println();
        for(String sf:str)
        {
            System.out.println(sf);
        }

        ArrayList<Integer> addingelement=new ArrayList<>();

        addingelement.add(24);
        addingelement.add(45);

        System.out.println(addingelement);
         addingelement.add(1,35);
        System.out.println(addingelement);
        Collections.sort(addingelement);
        System.out.println(addingelement);


        String str4="naviddya";
        String str2="navidda";
         if(str2==str4)
        //if(str2.equals(str4))
        {
            System.out.println("we have the same value for the string then hascode is also same "+str2.hashCode()+" "+str4.hashCode());
        }


    }

}
