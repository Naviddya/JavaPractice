package Java8Features.optional;

import java.util.Optional;

public class OptionalclassEx {
    public static void main(String[] args) {


        String str ="java";


//        if (str == "java is my fav ") {
//            System.out.println("this is null object");
//        } else {
//            System.out.println(str.length());
//        }

       Optional<String> str22=Optional.ofNullable(str);

        System.out.println(str22.isPresent());

        System.out.println(str22.get());
        System.out.println(str22.orElse("no value is present"));

    }

}