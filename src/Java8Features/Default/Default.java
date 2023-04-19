package Java8Features.Default;

@FunctionalInterface
public interface Default {



     void show();


    default void run()
    {
        System.out.println("default method");
    }


    static  void staticmethod()
    {
        System.out.println("static method has been called at class levele no need to create a obj");
    }


}

class Defaultimpl implements Default
{
    @Override
    public void show() {

        System.out.println("this has been called ");

    }

    @Override
    public  void  run()
    {
      //   super();
        Default.super.run();
       // System.out.println("this can be overide");
    }

}
class  Main
{
    public static void main(String[] args)
    {
    Default imp=new Defaultimpl();
     imp.show();
     imp.run();
     //imp.super.run();
      //  Default.staticmethod();

        Default.staticmethod();

    }
}

