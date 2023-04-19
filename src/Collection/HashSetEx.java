package Collection;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class HashSetEx {

    public static void main(String[] args) {


        Set<String> students=new HashSet<>();
        Set<Object> colleges=new HashSet<>();

        colleges.add("ITM");
        colleges.add("MITS");

        students.add("naviddya");
        students.add("batra");
        students.add("naviddya");
        System.out.println("here is set"+students);

        for(String str:students)
        {
            System.out.print("list of students are"+str+",");
        }
        for(Object college:colleges)
        {
            System.out.print("list of students are"+college+",");
        }
    }
}
