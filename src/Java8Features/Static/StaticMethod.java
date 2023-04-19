package Java8Features.Static;

@FunctionalInterface
public interface StaticMethod {


    void show();

    static void runs()
    {
        System.out.println("static mehtod has been called ");
    }

}
class staticimp implements StaticMethod
{
    @Override
    public void show() {
        System.out.println("method has been called ");

    }
}
class Main
{
    public static void main(String[] args) {

        StaticMethod.runs();
    }
}




