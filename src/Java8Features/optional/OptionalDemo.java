package Java8Features.optional;

import java.util.*;

public class OptionalDemo {

    public static void main(String[] args) {


        List<Integer> arr=new ArrayList<>();

        arr.add(23);
        arr.add(25);
        arr.add(278);
        arr.add(1);

        for(Integer in:arr)
        {
            System.out.println(in);
        }

        Collections.sort(arr);

        System.out.println(arr);

        Collections.reverse(arr);

        System.out.println(arr);

        System.out.println(arr.get(2));

//        int temp=0;
//        for(int i=0;i<arr.size();i++)
//        {
//            int max=arr[i];
//            if(max>arr[i])
//            {
//
//            }
//        }






//        Customer customer=new Customer(11,"batra",null, Arrays.asList("8989"));
//
//        System.out.println(customer);
//
//       Optional<String>  emptyOptional=Optional.empty();
//
//        System.out.println(emptyOptional);





    }


}
