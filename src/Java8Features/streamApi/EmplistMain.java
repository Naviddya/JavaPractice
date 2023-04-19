package Java8Features.streamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmplistMain {

    public static void main(String[] args) {

        List<String> citiesWorkedIn=new ArrayList<>();
        citiesWorkedIn.add("pune");
        citiesWorkedIn.add("banglore");
        citiesWorkedIn.add("mumbai");

        EmpList emp1=new EmpList("naviddya",1,citiesWorkedIn);



        List<String> citiesWorkedIn2=new ArrayList<>();
        citiesWorkedIn2.add("pune");
        citiesWorkedIn2.add("banglore");
        citiesWorkedIn2.add("mumbai");

        EmpList emp2=new EmpList("Tanishq",2,citiesWorkedIn2);



        List<EmpList> emplist=new ArrayList<>();
        emplist.add(emp1);
        emplist.add(emp2);
        System.out.println(emplist);
        
        
        
//        List<Integer> ids=new ArrayList<>();
//
//        for (EmpList empList:emplist
//             ) {
//
//                ids.add(empList.getId());
//
//
//
//
//        }
//        System.out.println(ids);
//


         List<Integer> ids=emplist.stream().
                 map(empList -> empList.getId()).collect(Collectors.toList());

        System.out.println(ids);

//      List< List<String>> employee= emplist.stream().map(empList ->
//                empList.getCitiesWorkedIn()).collect(Collectors.toList());

//        List<List<String>> employee = emplist.stream()
//                .flatMap(empList -> empList.getCitiesWorkedIn().stream())
//                .collect(Collectors.toList());



    }
}
