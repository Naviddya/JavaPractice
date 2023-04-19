package Java8Features;
@FunctionalInterface
public interface StudentInt {

    void show(int a);

}
 class  Demos
{
    public static void main(String[] args) {


        StudentInt obj =(a) -> System.out.println("lambbhda express has been called");

        obj.show(2);
    }
}
