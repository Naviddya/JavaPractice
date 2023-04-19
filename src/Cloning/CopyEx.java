package Cloning;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CopyEx {

    public static void main(String args[]) {
        List<String> srcList = new ArrayList<String>(3);
        List<String> descList = new ArrayList<String>(3);


        srcList.add("batra");
        srcList.add("heyey");
        srcList.add("dhshh");

        System.out.println("here is the first  line" + srcList);


        descList.add("idtiot");
        descList.add("stupid");
        descList.add("ideal");
        System.out.println("here is the second list "+descList);

        Collections.copy(descList,srcList);

        System.out.println("here is the new list after copy"+descList);

    }



}
