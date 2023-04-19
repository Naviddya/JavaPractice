package Java8Features;

@FunctionalInterface
public interface UserInterface {

    String show(String name,String sirname);



}
class Demo
{
    public static void main(String[] args) {

       // UserInterface obj = ((name, sirname) -> System.out.println("here is the name and sirname"));


      //  UserInterface obj=(name, sirname) -> System.out.println("jere os tje name"));
//        UserInterface obj=new UserInterface() {
//            @Override
//            public String show(String name, String sirname) {
//                return name+sirname;
//            }
//        };
//
//        String name= obj.show("navi","batra");
//        System.out.println(name);



    }
}
