package Collection;

import javax.sound.midi.Soundbank;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapEx {

    public static void main(String[] args) {


        LinkedHashMap<String,Integer> studentlinklist=new LinkedHashMap<String,Integer>();

        studentlinklist.put("Naviddya",1);
        studentlinklist.put("batra",2);
        studentlinklist.put("chinu",3);

        System.out.println(studentlinklist);

        studentlinklist.put("prabahd",2);
        System.out.println(studentlinklist);
        studentlinklist.put("batra",3);

        System.out.println(studentlinklist);

        System.out.println("getting the value from the student  "+studentlinklist.get("batra"));

        System.out.println("size of linkhaslist "+studentlinklist.size());
        System.out.println("is empty"+studentlinklist.isEmpty());
        System.out.println("to check does it value"+studentlinklist.containsKey("batra"));


        for (Map.Entry<String,Integer> mapElement:studentlinklist.entrySet())
        {
            String key=mapElement.getKey();
            Integer value=mapElement.getValue();

            System.out.println(key+" "+value);

        }



    }
}
