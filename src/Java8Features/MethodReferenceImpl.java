package Java8Features;

public class MethodReferenceImpl
//implements FuncationalInterfaceMethodReference{

{
    public static  void saySomething()
    {
        System.out.println("hello  this is static method");

    }

    public  static  void  main(String[] args)
    {
        FuncationalInterfaceMethodReference ref=MethodReferenceImpl::saySomething;
        ref.sayable();
    }

}
