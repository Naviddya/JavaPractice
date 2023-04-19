package Java8Features;


import java.sql.Array;
import java.util.Arrays;
import java.util.List;

public class ForeachMethod {

    public static void main(String[] args) {


        List<Integer> inte= Arrays.asList(2,12,152,45);


        inte.forEach(n-> System.out.println(n));




//        for(int i=0;i< inte.size();i++)
//        {
//            System.out.println(inte.get(i));
//        }

//        for (Integer ints:inte)
//        {
//            System.out.println(ints);
//        }


    }


}
