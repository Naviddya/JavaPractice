//package Java8Features.streamApi;
//
//import java.util.Arrays;
//import java.util.List;
//import java.util.stream.Collectors;
//
//public class StudentImpl {
//
//
//    public static void main(String[] args) {
//
//        List<Student> stu= Arrays.asList(new Student("naviddya","gwalior","batra"),
//                new Student("chinu","banglore","batra"),
//                new Student("Ekta","Delhi","Khanna"));
//
//   try{
//       for (Student str:stu
//       ) {
//           if(str.getAddress()=="delhi")
//           {
//               System.out.println(str);
//           }
//
//
//           System.out.println(str.getName());
//           System.out.println(str.getAddress().equals("banglore"));
//
//       }
//       catch
//       {
//           System.out.println("we dont have matching address");
//
//       }
//
//   }
//
//
//
//
////       List<Student> newstream= stu.stream().filter
////
////        System.out.println(newstream);
//
//    }
//}
